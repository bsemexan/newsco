package com.example.android.newsco;

/**
 * Created by beryy on 8/23/16.
 */
public class NewsFeed {

    private final String mType;

    private final String mTitle;

    private final String mUrl;

    private String mContributor;





    public NewsFeed(String type, String title, String url, String contributor){
        mType = type;
        mTitle = title;
        mUrl = url;
        mContributor = contributor;
    }

    public NewsFeed(String type, String title, String url){
        mType = type;
        mTitle = title;
        mUrl = url;
    }

    /**
     * Returns the author.
     */
    public String getContributor(){
        return mContributor;
    }
    /**
     * Returns the type.
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
