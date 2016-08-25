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

    /**
     * Constructs a new {@link NewsFeedAdapter}.
     *
     * @param context of the app
     * @param news    is the list of earthquakes, which is the data source of the adapter
     */
    public NewsFeedAdapter(Context context, List<NewsFeed> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the earthquake at the given position
     * in the list of earthquakes.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.feed_view, parent, false);
        }

        NewsFeed currentNews = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_field);
        titleTextView.setText(currentNews.getTitle());

        TextView authorTextView = (TextView) listItemView.findViewById((R.id.author_field));
        authorTextView.setText(currentNews.getAuthor());

        return listItemView;
    }
}
