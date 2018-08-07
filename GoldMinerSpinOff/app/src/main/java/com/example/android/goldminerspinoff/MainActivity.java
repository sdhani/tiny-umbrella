package com.example.android.goldminerspinoff;

import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.goldminerspinoff.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textTimer;
    private double mStartRadians = 0;
    private TextView mArrowRadians;
    ImageView imageView;

    Random r;
    int oldDegree = 0, curDegree = 0;
    private Button StartTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializing the views
        //textTimer = (TextView) findViewById(R.id.mtextTimer);
        //StartTimer = (Button) findViewById(R.id.startButton);
        //StartTimer.setOnClickListener(this);

        imageView = (ImageView) findViewById(R.id.imageView);


        r = new Random();

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oldDegree = curDegree % 360;// last arrow position
                curDegree = r.nextInt(3600) + 360; // new arrow positions


                //rotate animation
                RotateAnimation animation = new RotateAnimation(oldDegree, curDegree, RotateAnimation.RELATIVE_TO_SELF,
                        0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);

                animation.setFillAfter(true);
                animation.setDuration(3600);
                animation.setInterpolator(new AccelerateDecelerateInterpolator());
                animation.setAnimationListener(new Animation.AnimationListener(){
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        curDegree = curDegree % 360;

                    }
                });
                imageView.startAnimation(animation);
            }
        });
    }


    @Override
    public void onClick(View v) {
        long maxTimeInMilliseconds = 30000;// in your case
        startTimer(maxTimeInMilliseconds, 1000);
    }

    public void startTimer(final long finish, long tick) {
        CountDownTimer t;
        t = new CountDownTimer(finish, tick) {

            public void onTick(long millisUntilFinished) {
                long remainedSecs = millisUntilFinished / 1000;
                textTimer.setText("" + (remainedSecs / 60) + ":" + (remainedSecs % 60));// manage it accordign to you
                mStartRadians += 1/180;
            }

            public void onFinish() {
                textTimer.setText("00:00:00");
                Toast.makeText(MainActivity.this, "Finish", Toast.LENGTH_SHORT).show();

                cancel();
            }
        }.start();
    }
}