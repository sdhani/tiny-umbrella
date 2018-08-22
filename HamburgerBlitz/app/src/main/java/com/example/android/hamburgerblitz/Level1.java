package com.example.android.hamburgerblitz;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;









import java.util.ArrayList;

public class Level1 extends AppCompatActivity {
    private int oldSquare = -1, currentSquare = 1;
    private int ctr = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        final ArrayList<Square> blocks = new ArrayList<Square>();

        int red = Color.rgb(255, 0, 0);
        int blue = Color.rgb(38, 0, 230);
        int green = Color.rgb(21, 128, 0);
        int yellow = Color.rgb(255, 255, 0);
        int pink = Color.rgb(255, 25, 255);
        int orange = Color.rgb(255, 128, 0);

        blocks.add(new Square(1, red, "red"));
        blocks.add(new Square(2, blue, "blue"));
        blocks.add(new Square(3, green, "green"));
        blocks.add(new Square(4, yellow, "yellow"));
        blocks.add(new Square(5, pink, "pink"));
        blocks.add(new Square(6, orange, "orange"));
        blocks.add(new Square(2, blue, "blue"));
        blocks.add(new Square(3, green, "green"));
        blocks.add(new Square(2, blue, "blue"));
        blocks.add(new Square(5, pink, "pink"));
        blocks.add(new Square(1, red, "red"));
        blocks.add(new Square(6, orange, "orange"));
        blocks.add(new Square(3, green, "green"));
        blocks.add(new Square(4, yellow, "yellow"));
        blocks.add(new Square(4, yellow, "yellow"));
        blocks.add(new Square(6, orange, "orange"));
        blocks.add(new Square(4, yellow, "yellow"));
        blocks.add(new Square(5, pink, "pink"));
        blocks.add(new Square(6, orange, "orange"));
        blocks.add(new Square(6, orange, "orange"));

        SquareAdapter adapter = new SquareAdapter(this, blocks);

        GridView gridView = (GridView)findViewById(R.id.grid);

        gridView.setAdapter(adapter);

        //TRY APPLYING STATE LIST DRAWABLE

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(Level1.this, "Red", Toast.LENGTH_SHORT).show();
                oldSquare = blocks.get(position).getSquareValue();

                if (currentSquare == oldSquare){
                    Toast.makeText(Level1.this, "currentSquare: " + currentSquare, Toast.LENGTH_SHORT).show();
                    Log.v("currentSquare","" + currentSquare);
                }
                }
        });
    }

    public void recordClick(int squareValue){
        if(ctr == 0){

        }
    }
}

