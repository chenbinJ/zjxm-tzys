package com.springboot.rest.chenbin;

import com.github.wxiaoqi.security.common.msg.ObjectRestResponse;
import com.springboot.component.chenbin.HttpCallComponent;
import com.springboot.component.chenbin.file.FromFTPDownloadComponent;
import com.springboot.component.chenbin.file.ToFTPUploadComponent;
import com.springboot.config.ZtgeoBizException;
import com.springboot.entity.SJ_Fjfile;
import com.springboot.popj.registration.ImmovableFile;
import com.springboot.util.chenbin.BusinessDealBaseUtil;
import com.springboot.util.chenbin.IDUtil;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Api(tags = "测试api")
@RestController
@Scope("prototype")
public class TestRest {
    @Autowired
    private HttpCallComponent httpCallComponent;

    @RequestMapping(value = "/getFileList", method = RequestMethod.POST)
    public ObjectRestResponse<List<ImmovableFile>> getFileList(@RequestParam("receiptNumber") String receiptNumber, @RequestParam("token") String token) {
        List<SJ_Fjfile> fileVoList = httpCallComponent.getFileVoList(receiptNumber, token);

        return new ObjectRestResponse<List<ImmovableFile>>().data(null);
    }
}
