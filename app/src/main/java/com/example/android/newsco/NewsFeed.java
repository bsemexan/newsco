package com.example.android.newsco;

/**
 * Created by beryy on 8/23/16.
 */
public class NewsFeed {

    private final String author;

    private final String title;

    private String mUrl;

    public NewsFeed(String NewsAuthor, String NewsTitle, String url){
        author = NewsAuthor;
        title = NewsTitle;
        url = mUrl;
    }

    /**
     * Returns the author.
     */

    public String getAuthor() {

        return author;
    }

    /**
     * Returns the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the website URL to find more information about the article.
     */
    public String getUrl() {
        return mUrl;
    }
}
