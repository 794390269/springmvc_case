package com.an.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.an.controller","com.an.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
