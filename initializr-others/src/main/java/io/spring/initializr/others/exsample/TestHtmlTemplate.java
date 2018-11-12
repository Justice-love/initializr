package io.spring.initializr.others.exsample;

import io.spring.initializr.others.CustomizeTemplate;
import io.spring.initializr.others.RenderContent;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.List;

@Configuration
public class TestHtmlTemplate implements CustomizeTemplate {

    @Override
    public List<RenderContent> contents() {
        RenderContent renderContent = new RenderContent();
        renderContent.setDescription("desc");
        renderContent.setDestPath("src/main/resources/html");
        renderContent.setFileName("test.html");

        return Collections.singletonList(renderContent);
    }
}
