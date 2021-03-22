package com.shop.systeme.services.resentPost;

public class ResentPost {

    private String namePost;
    private String timePost;
    private String urlImages;

    private String originalUrl;
    private String author;

    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    public String getTimePost() {
        return timePost;
    }

    public void setTimePost(String timePost) {
        this.timePost = timePost;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getDateAndAuthor(){
        return timePost + " | " + author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrlImages() {
        return urlImages;
    }

    public void setUrlImages(String urlImages) {
        this.urlImages = urlImages;
    }

    @Override
    public String toString() {
        return "ResentPost{" +
                "namePost='" + namePost + '\'' +
                ", timePost='" + timePost + '\'' +
                ", urlImages='" + urlImages + '\'' +
                ", originalUrl='" + originalUrl + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
