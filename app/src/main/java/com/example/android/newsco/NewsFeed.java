package com.example.android.newsco;

/**
 * Created by beryy on 8/23/16.
 */
public class NewsFeed {

    private final String mType;

    private final String mTitle;

    private String mUrl;

    public NewsFeed(String type, String title, String url){
        mType = type;
        mTitle = title;
        mUrl = url;
    }

    /**
     * Returns the author.
     */

    public String getType() {

        return mType;
    }

    /**
     * Returns the title
     */
    public String getTitle() {

        return mTitle;
    }

    /**
     * Returns the website URL to find more information about the article.
     */
    public String getUrl() {

        return mUrl;
    }
}
