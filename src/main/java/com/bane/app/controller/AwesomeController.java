package com.bane.app.controller;

import com.bane.app.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/awesome")
public class AwesomeController {

    @Autowired
    private ExampleService exampleService;

    @RequestMapping(value = "/lol", method = RequestMethod.GET)
    public @ResponseBody String awesomeControllerMeth() {
        return exampleService.awesomeMeth();
    }
}
