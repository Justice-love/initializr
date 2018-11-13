package io.spring.initializr.others;

import java.util.List;

public class RenderContainer {

    private List<RenderContent> renderContents;

    public RenderContainer(List<RenderContent> renderContents) {
        this.renderContents = renderContents;
    }

    public List<RenderContent> getRenderContents() {
        return renderContents;
    }

    public void setRenderContents(List<RenderContent> renderContents) {
        this.renderContents = renderContents;
    }
}
