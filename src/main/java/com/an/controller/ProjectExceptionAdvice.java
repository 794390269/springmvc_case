package com.an.controller;

import com.an.exception.BusinessException;
import com.an.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException ex){
        //记录日志
        //发送信息给运维
        //发送邮件给开发人员,ex对象发送给开发人员
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException ex){
        return new Result(ex.getCode(),null,ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
        //记录日志
        //发送信息给运维
        //发送邮件给开发人员,ex对象发送给开发人员
        System.out.println("嘿嘿，异常哪里跑~");
        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"系统繁忙请稍后再试！");
    }
}
