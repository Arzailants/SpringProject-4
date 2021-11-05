package com.example.demo.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

// MENAMBAHKAN ANNOTATION CONFIGURASI
@Configuration
@ConfigurationProperties(prefix = "bank")
@Getter
@Setter
public class ApplicationProperties {

    private String name;
    private String username;
    private String password;

    private String welcomeText;

}
