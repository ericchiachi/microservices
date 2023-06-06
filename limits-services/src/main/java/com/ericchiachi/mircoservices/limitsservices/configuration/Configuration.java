package com.ericchiachi.mircoservices.limitsservices.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// this will be loaded from the application.properties, with annotation limits-services
@Getter
@Setter
@Component
@ConfigurationProperties("limits-services")
public class Configuration {
    private int minimum;
    private int maximum;
}
