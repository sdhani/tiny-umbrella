package com.example.android.hamburgerblitz;

public class Square {
    private static final int NO_IMAGE_PROVIDED = -1; //-1 is out of range of all valid resource id's
    private int mSquareValue;
    private int mImageId = NO_IMAGE_PROVIDED;
    private int mColorId;
    private String mColorName;

//    public Square(int squareValue, int imageId) {
//        mSquareValue = squareValue;
//        mImageId = imageId;
//    }

    public Square(int squareValue, int colorId, String colorName) {
        mSquareValue = squareValue;
        mColorId = colorId;
        mColorName = colorName;

    }

    public int getSquareValue() {
        return mSquareValue;
    }

    public int getColorId() {
        return mColorId;
    }

    public String getColorName() {
        return mColorName;
    }

    public int getImageId() {
        return mImageId;
    }

    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }

}