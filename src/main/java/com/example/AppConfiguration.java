package com.example;


import com.tomkasp.annotations.EnableQuartzHipster;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@EnableQuartzHipster
@EnableTransactionManagement
public class AppConfiguration {



}
