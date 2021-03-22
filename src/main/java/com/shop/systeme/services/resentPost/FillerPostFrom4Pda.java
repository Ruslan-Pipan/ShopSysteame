package com.shop.systeme.services.resentPost;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component("fillerPost")
public class FillerPostFrom4Pda implements FillerPostI {
    private final List<ResentPost> resentPosts = new ArrayList<>();

    @Override
    public List<ResentPost> getPosts() {
        return this.resentPosts;
    }

    @Scheduled(cron = "0 * 12 * * ?")
    @PostConstruct
    public void filing(){
        try {
            Document document = Jsoup.connect("https://keddr.com/").get();
            Elements elements = document.getElementsByClass("review-post");
            int i = 0;
            for (Element element : elements) {


                Elements img = element.getElementsByClass("image_media");
                Elements title = element.getElementsByClass("blog-title");
                Elements originalUrl = element.getElementsByClass("review-post-image");
                Elements articleDate = element.getElementsByClass("article-date");
                Elements author = element.getElementsByClass("author-link");

                ResentPost post = new ResentPost();
                post.setUrlImages(img.attr("data-src"));
                post.setNamePost(title.text());
                post.setOriginalUrl(originalUrl.attr("href"));
                post.setTimePost(articleDate.text());
                post.setAuthor(author.text());
                resentPosts.add(post);
                i++;
                if (i > 3) break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
