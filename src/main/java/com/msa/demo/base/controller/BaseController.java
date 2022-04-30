package com.msa.demo.base.controller;

import com.msa.demo.base.utils.StateParameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;

/**
 * 提供日志接口以及返回model的固定参数格式
 */
public class BaseController {
    protected final String success = StateParameter.SUCCESS;
    protected final String fail = StateParameter.FAULT;

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public ModelMap getModelMap(String status, Object data, String msg){
        ModelMap modelMap = new ModelMap();
        modelMap.put("status", status);
        modelMap.put("data", data);
        modelMap.put("msg", msg);
        return modelMap;
    }
}
