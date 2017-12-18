/*
 * @(#) GlobalExceptionHandler.java 2017/12/15
 * 
 * Copyright (c) 2016, SIMPO Technology. All Rights Reserved. SIMPO Technology. CONFIDENTIAL
 */
package com.xuwc.dubbo.common.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xuwc
 * @version 1.0
 * @since 2017/12/15
 */
//@ControllerAdvice
//@RestController
//public class GlobalExceptionHandler implements ErrorController {
//    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
//
//    @ExceptionHandler(value = Exception.class)
//    @RequestMapping("/error")
//    public String defaultErrorHandler(HttpServletRequest req, Exception ex) throws Exception {
//        logger.error("", ex);
//        String result = "";
//        if (ex instanceof org.springframework.validation.BindException) {
//            BindException bindException = (BindException) ex;
//            for (FieldError fieldErro : bindException.getBindingResult().getFieldErrors()) {
//                result += "【" + fieldErro.getField() + ":" + fieldErro.getDefaultMessage() + "】";
//            }
//        } else if (ex instanceof MethodArgumentNotValidException) {
//            MethodArgumentNotValidException methodArgumentNotValidException = (MethodArgumentNotValidException) ex;
//            for (FieldError fieldErro : methodArgumentNotValidException.getBindingResult().getFieldErrors()) {
//                result += "【" + fieldErro.getField() + ":" + fieldErro.getDefaultMessage() + "】";
//            }
//        } else if (ex instanceof HttpRequestMethodNotSupportedException) {
//            HttpRequestMethodNotSupportedException httpRequestMethodNotSupportedException = (HttpRequestMethodNotSupportedException) ex;
//            result = httpRequestMethodNotSupportedException.getMessage();
//        } else if (ex instanceof NoHandlerFoundException) {
//            result = "无效的请求地址";
//        } else if (ex instanceof MissingServletRequestParameterException) {
//            MissingServletRequestParameterException missingServletRequestParameterException = (MissingServletRequestParameterException) ex;
//            result = "缺少必要的参数[" + missingServletRequestParameterException.getMessage() + "]";
//        } else {
//            result = ex.getMessage().toString();
//        }
//        logger.info(result);
//        return result;
//    }
//
//    public String getErrorPath() {
//        return "/error";
//    }
//}