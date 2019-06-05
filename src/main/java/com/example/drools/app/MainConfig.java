package com.example.drools.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.example.drools.helloworld.HelloWorldPackageInfo;
import com.example.drools.helloworld.config.SwaggerConfig;
import com.example.drools.rules.RulesPackageInfo;

@Configuration
@Import(SwaggerConfig.class)
@ComponentScan(basePackageClasses = { HelloWorldPackageInfo.class, RulesPackageInfo.class })
public class MainConfig {

}
