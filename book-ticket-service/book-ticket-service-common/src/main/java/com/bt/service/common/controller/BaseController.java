package com.bt.service.common.controller;


import com.bt.common.controller.AbstractController;
import com.bt.service.common.utils.ServletUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseController extends AbstractController {
    @Override
    protected HttpServletRequest getRequest() {
        return ServletUtils.getRequest();
    }

    @Override
    protected HttpServletResponse getResponse() {
        return ServletUtils.getResponse();
    }
}
