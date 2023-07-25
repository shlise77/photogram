package com.photo.photogram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/sign")
public class SignController {
    @RequestMapping(value="/signup")
    public ModelAndView signUpGet() throws Exception{
        ModelAndView mv = new ModelAndView("sign/signUp");

        return mv;
    }
}
