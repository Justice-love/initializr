package io.spring.initializr.others.exsample;

import io.spring.initializr.others.CustomizeTemplate;
import io.spring.initializr.others.RenderContent;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class TestHtmlTemplate implements CustomizeTemplate {

    private RenderContent[] contents;

    public TestHtmlTemplate(RenderContent[] contents) {
        this.contents = contents;
    }

    @Override
    public List<RenderContent> contents() {
        return Optional.ofNullable(contents).map(c -> Arrays.asList(c)).orElse(Collections.EMPTY_LIST);
    }
}
