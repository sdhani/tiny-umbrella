package com.example.android.hamburgerblitz;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SquareAdapter extends ArrayAdapter<Square>{
    private static final String LOG_TAG = SquareAdapter.class.getSimpleName();

    // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
    // the second argument is used when the ArrayAdapter is populating a single TextView.
    // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
    // going to use this second argument, so it can be any value. Here, we used 0.

    public SquareAdapter(Activity context, ArrayList<Square> board){
        super(context, 0, board);
    }

    /**
     * getView method is called when the listview is trying to display
     * a list of items at a given position. So it will pass in a potential
     * view we could use i.e. convertView
     * */

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;

        if(gridItemView == null){
            //creates a new list item view layout
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.board_grid,parent, false);
        }

        Square currentSquare = getItem(position);

        ImageView image = (ImageView) gridItemView.findViewById(R.id.image_view);
        if(currentSquare.hasImage()){
            //Set image to the image resource specified in the current word
            image.setImageResource(currentSquare.getImageId());
            image.setVisibility(View.VISIBLE);
        }else {
            //if no image is specified set to Gone (8)
            image.setVisibility(View.GONE);
        }

        return gridItemView;
    }
}

