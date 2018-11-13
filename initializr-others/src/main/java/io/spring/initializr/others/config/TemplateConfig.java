package io.spring.initializr.others.config;

import io.spring.initializr.others.CustomizeTemplate;
import io.spring.initializr.others.RenderContent;
import io.spring.initializr.others.exsample.TestHtmlTemplate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:context.properties")
@ConfigurationProperties(prefix = "template.render")
public class TemplateConfig {

    private RenderContent[] contents;

    @Bean
    public CustomizeTemplate template() {
        return new TestHtmlTemplate(contents);
    }

    public RenderContent[] getContents() {
        return contents;
    }

    public void setContents(RenderContent[] contents) {
        this.contents = contents;
    }
}
