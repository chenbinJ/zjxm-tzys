package com.springboot.config;

import com.github.ag.core.exception.BaseException;
import com.springboot.constant.penghao.BizOrBizExceptionConstant;

public class ZtgeoBizException extends BaseException {
    public ZtgeoBizException(String message) {
        super(message, BizOrBizExceptionConstant.ZTGEO_BIZ_ERROR_CODE);
    }
}
