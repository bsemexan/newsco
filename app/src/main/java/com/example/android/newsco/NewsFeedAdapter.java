package com.example.android.newsco;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by beryy on 8/25/16.
 */
public class NewsFeedAdapter extends ArrayAdapter<NewsFeed> {

    static class ViewHolder{
        public TextView titleTextView;
        public TextView authorTextView;
        public TextView typeTextView;
        public TextView contributorTextView;
    }
    /**
     * Constructs a new {@link NewsFeedAdapter}.
     *
     * @param context of the app
     * @param news    is the list of news, which is the data source of the adapter
     */
    public NewsFeedAdapter(Context context, List<NewsFeed> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the news
     * in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.feed_view, parent, false);

            ViewHolder viewHolder = new ViewHolder();
            viewHolder.titleTextView = (TextView) listItemView.findViewById(R.id.title_field);
            viewHolder.authorTextView = (TextView) listItemView.findViewById((R.id.url_field));
            viewHolder.typeTextView = (TextView) listItemView.findViewById((R.id.type_field));
            viewHolder.contributorTextView = (TextView) listItemView.findViewById(R.id.contributor_field);
            listItemView.setTag(viewHolder);
        }

        ViewHolder holder = (ViewHolder) listItemView.getTag();
        NewsFeed currentNews = getItem(position);


        holder.typeTextView.setText(currentNews.getType());
        holder.titleTextView.setText(currentNews.getTitle());
        holder.contributorTextView.setText(currentNews.getContributor());
        holder.authorTextView.setText(currentNews.getUrl());



        return listItemView;
    }
}
