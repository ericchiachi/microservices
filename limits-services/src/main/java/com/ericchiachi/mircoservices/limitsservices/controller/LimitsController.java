package com.ericchiachi.mircoservices.limitsservices.controller;

import com.ericchiachi.mircoservices.limitsservices.bean.Limits;
import com.ericchiachi.mircoservices.limitsservices.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
