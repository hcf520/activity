package com.hcf.activity.config.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class ErrorController extends AbstractErrorController {

    public ErrorController() {
        super(new DefaultErrorAttributes());
    }

    @RequestMapping("/error")
    public ModelAndView getErrorPath(HttpServletRequest request, HttpServletResponse response) {
        // TODO
        return null;
    }

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return null;
	}

    // Do Something
}
