package io.spring.initializr.others.config;

import io.spring.initializr.others.CustomizeTemplate;
import io.spring.initializr.others.exsample.TestHtmlTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TemplateConfig {

    @Bean
    public CustomizeTemplate template() {
        return new TestHtmlTemplate();
    }
}
