package com.springboot.controller;

import com.github.wxiaoqi.security.common.msg.ObjectRestResponse;
import com.springboot.component.AnonymousInnerComponent;
import com.springboot.component.EsfRoomComponent;
import com.springboot.component.ParallelSectorsComponent;
import com.springboot.component.RealEstateMortgageComponent;
import com.springboot.component.chenbin.HttpCallComponent;
import com.springboot.config.ZtgeoBizException;
import com.springboot.popj.GetReceiving;
import com.springboot.popj.warrant.ParametricData;
import com.springboot.util.chenbin.ErrorDealUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;

@Slf4j
@Api(tags = "不动产api")
@RestController
@Scope("prototype")
public class RealEstateMortgageController {

    @Value("${httpclient.seam}")
    private String seam;//接口
    @Value("${httpclient.ip}")
    private String ip;
    @Value("${glHouseBuyer.obligeeQlr}")
    private String obligeeQlr;
    @Autowired
    private RealEstateMortgageComponent realEstateMortgageComponent;
    @Autowired
    private AnonymousInnerComponent anonymousInner;
    @Autowired
    private EsfRoomComponent esfRoomComponent;
    @Autowired
    private ParallelSectorsComponent parallelSectorsComponent;
    @Autowired
    private HttpCallComponent httpCallComponent;


    @RequestMapping(value = "/AutoBackfillData", method = RequestMethod.POST)
    @ApiOperation("二手房水电气回填数据自动接口")
    public ObjectRestResponse AutoBackfillData(@RequestParam("commonInterfaceAttributer") String commonInterfaceAttributer) throws Exception {
        return esfRoomComponent.getAutoBackfillData(commonInterfaceAttributer);
    }


    @RequestMapping(value = "/getRealEstateMortgage", method = RequestMethod.POST)
    @ApiOperation("不动产抵押信息")
    public ObjectRestResponse getRealEstateMortgage(@RequestParam("dyzmh") String dyzmh, @RequestParam(value = "qlrmc", required = false) String qlrmc) throws Exception {
        System.out.println(dyzmh);
        return realEstateMortgageComponent.getRealEstateMortgage(dyzmh, qlrmc, false);
    }

    @RequestMapping(value = "/getRealPropertyCertificate", method = RequestMethod.POST)
    @ApiOperation("不动产权属信息")
    public ObjectRestResponse getRealPropertyCertificate(@RequestBody ParametricData parametricData) throws Exception {
        return realEstateMortgageComponent.getRealPropertyCertificate(parametricData);
    }


    @RequestMapping(value = "/getParallelSectorsCertificate", method = RequestMethod.POST)
    @ApiOperation("平行部门数据获取")
    public ObjectRestResponse getParallelSectorsCertificate(@RequestBody ParametricData parametricData) throws Exception {
        return parallelSectorsComponent.getParallelSectorsCertificate(parametricData);
    }


    @RequestMapping(value = "/getAutoRealPropertyCertificateTwo", method = RequestMethod.POST)
    @ApiOperation("不动产抵押登记（含两证）受理自动接口")
    public ObjectRestResponse getAutoRealPropertyCertificateTwo(@RequestParam("commonInterfaceAttributer") String commonInterfaceAttributer) throws Exception {
        return realEstateMortgageComponent.getAutoRealPropertyCertificateTwo(commonInterfaceAttributer);
    }


    @RequestMapping(value = "/sendRegistrationMortgageRevocation", method = RequestMethod.POST)
    @ApiOperation("发送数据到登记局进行审批操作返回受理编号")
    public ObjectRestResponse sendRegistrationMortgageRevocation(@RequestParam("commonInterfaceAttributer") String commonInterfaceAttributer) throws ParseException {
        ObjectRestResponse<String> rv = new ObjectRestResponse<String>();
        try {
            rv = realEstateMortgageComponent.sendRegistrationMortgageRevocation(commonInterfaceAttributer);
        } catch (ParseException e1) {
            log.error(ErrorDealUtil.getErrorInfo(e1));
            rv.setStatus(20500);
            rv.setData("传入的数据格式不正确");
        } catch (ZtgeoBizException e2) {
            log.error(ErrorDealUtil.getErrorInfo(e2));
            rv.setStatus(20500);
            rv.setData(e2.getMessage());
        } catch (Exception e3) {
            log.error(ErrorDealUtil.getErrorInfo(e3));
            rv.setStatus(20500);
            rv.setData("内网同步出现其它运行时异常，请排查！");
        }
        return rv;
    }

    @RequestMapping(value = "/getReceiving", method = RequestMethod.POST)
    @ApiOperation(value = "登记局返回成功数据")
    public void getReceiving(@RequestBody GetReceiving getReceiving, OutputStream resp) throws IOException {
        anonymousInner.GetReceiving(getReceiving, resp);
    }

    @RequestMapping(value = "/getSendRoom", method = RequestMethod.POST)
    @ApiOperation(value = "登记局返回二手房受理成功数据")
    public void getSendRoom(@RequestBody GetReceiving getReceiving, OutputStream resp) throws IOException {
        anonymousInner.getSendRoom(getReceiving, resp);
    }

    @RequestMapping(value = "/getMortgageCancellation", method = RequestMethod.POST)
    @ApiOperation(value = "不动产预告证明号")
    public ObjectRestResponse getMortgageCancellation(String ygzmh) throws Exception {
        return realEstateMortgageComponent.getMortgageCancellation(ygzmh);
    }




}
