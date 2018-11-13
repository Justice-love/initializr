package io.spring.initializr.others;

public class RenderContent {

    private String destPath;
    private String fileName;
    private String description;

    public String getDestPath() {
        return destPath;
    }

    public void setDestPath(String destPath) {
        this.destPath = destPath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String contentKey() {
        return destPath + fileName;
    }
}
