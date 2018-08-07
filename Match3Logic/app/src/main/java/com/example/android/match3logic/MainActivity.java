package com.example.android.match3logic;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener {
    private RelativeLayout mRelLay;
    private float mInitialX, mInitialY;
    private int mInitialLeft, mInitialTop;
    private View mMovingView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRelLay = (RelativeLayout) findViewById(R.id.relativeLayout);

        for (int i = 0; i < 3; i++) {
            mRelLay.getChildAt(i).setOnTouchListener(this);

        }
    }


    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        RelativeLayout.LayoutParams mLayoutParams;

        switch (motionEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                mMovingView = view;
                mLayoutParams = (RelativeLayout.LayoutParams) mMovingView.getLayoutParams();
                mInitialX = motionEvent.getRawX();
                mInitialY = motionEvent.getRawY();
                mInitialLeft = mLayoutParams.leftMargin;
                mInitialTop = mLayoutParams.topMargin;

                break;

            case MotionEvent.ACTION_MOVE:
                if (mMovingView != null) {
                    mLayoutParams = (RelativeLayout.LayoutParams) mMovingView.getLayoutParams();
                    mLayoutParams.leftMargin = (int) (mInitialLeft + motionEvent.getRawX() - mInitialX);
                    mLayoutParams.topMargin = (int) (mInitialTop + motionEvent.getRawY() - mInitialY);
                    mMovingView.setLayoutParams(mLayoutParams);
                }


                break;

            case MotionEvent.ACTION_UP:
                mMovingView = null;
                break;
        }

        return true;
    }
}
    /*
    private boolean isTouch = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int startX = -1;
        int startY = -1;
        int X = (int) event.getX();
        int Y = (int) event.getY();
        int eventaction = event.getAction();

        switch (eventaction) {
            case MotionEvent.ACTION_DOWN:
                //Toast.makeText(this, "ACTION_DOWN AT COORDS "+"X: "+X+" Y: "+Y, Toast.LENGTH_SHORT).show();
                startX = X;
                startY = Y;
                isTouch = true;
                break;

            case MotionEvent.ACTION_MOVE:
                //Toast.makeText(this, "MOVE "+"X: "+X+" Y: "+Y, Toast.LENGTH_SHORT).show();
                break;

            case MotionEvent.ACTION_UP:
                //Toast.makeText(this, "ACTION_UP "+"X: "+X+" Y: "+Y, Toast.LENGTH_SHORT).show();

                if(isTouch && startX < X && startY == Y){
                    Toast.makeText(this, "RIGHT "+"X: "+X+" Y: "+Y, Toast.LENGTH_SHORT).show();
                }else if(isTouch && startX > X && startY == Y){
                    Toast.makeText(this, "LEFT "+"X: "+X+" Y: "+Y, Toast.LENGTH_SHORT).show();
                }else if(isTouch && startY < Y && startX == X){
                    Toast.makeText(this, "DOWN "+"X: "+X+" Y: "+Y, Toast.LENGTH_SHORT).show();
                }else if(isTouch && startY < Y && startX == X){
                    Toast.makeText(this, "UP "+"X: "+X+" Y: "+Y, Toast.LENGTH_SHORT).show();
                }
                break;
        }
        return true;
    }

    public static float convertPixelsToDp(float px){
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        float dp = px / (metrics.densityDpi / 160f);
        return Math.round(dp);
    }

    public static float convertDpToPixel(float dp){
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        float px = dp * (metrics.densityDpi / 160f);
        return Math.round(px);
    }
}
*/
    /*
    private void touchStart(float x, float y) {
        myPath = new Path();
        FingerPath fp = new FingerPath(currentColor, strokeWidth, myPath);
        paths.add(fp);

        myPath.reset();
        myPath.moveTo(x, y);
        mX = x;
        mY = y;
    }

    private void touchMove(float x, float y) {
        float dx = Math.abs(x - mX);
        float dy = Math.abs(y - mY);

        if (dx >= TOUCH_TOLERANCE || dy >= TOUCH_TOLERANCE) {
            myPath.quadTo(mX, mY, (x + mX) / 2, (y + mY) / 2);
            mX = x;
            mY = y;
        }
    }

    private void touchUp() {
        myPath.lineTo(mX, mY);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        switch(event.getAction()) {
            case MotionEvent.ACTION_DOWN :
                touchStart(x, y);
                invalidate();
                break;
            case MotionEvent.ACTION_MOVE :
                touchMove(x, y);
                invalidate();
                break;
            case MotionEvent.ACTION_UP :
                touchUp();
                invalidate();
                break;
        }

        return true;

*/


