package com.example.android.hamburgerblitz;

import android.widget.ImageView;

public class Square {
    private static final int NO_IMAGE_PROVIDED = -1; //-1 is out of range of all valid resource id's
    private int mSquareValue;
    private int mImageId = NO_IMAGE_PROVIDED;

    public Square(int squareValue, int imageId) {
        mSquareValue = squareValue;
        mImageId = imageId;
    }

    public int getSquareValue() {
        return mSquareValue;
    }

    public int getImageId(){
        return mImageId;
    }

    public boolean hasImage() { return mImageId != NO_IMAGE_PROVIDED; }

}
