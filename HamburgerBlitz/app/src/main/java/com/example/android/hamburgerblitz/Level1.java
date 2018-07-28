package com.example.android.hamburgerblitz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class Level1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        Square b1 = new Square(1, R.drawable.one);
        Square b2 = new Square(2, R.drawable.two);
        Square b3 = new Square(4, R.drawable.four);
        Square b4 = new Square(5, R.drawable.five);
        Square b5 = new Square(6, R.drawable.six);
        Square b6 = new Square(1, R.drawable.one);
        Square b7 = new Square(3, R.drawable.three);
        Square b8 = new Square(5, R.drawable.five);
        Square b9 = new Square(1, R.drawable.one);


        ArrayList<Square> blocks = new ArrayList<Square>();

        blocks.add(new Square(1, R.drawable.one));
        blocks.add(new Square(2, R.drawable.two));
        blocks.add(new Square(4, R.drawable.four));
        blocks.add(new Square(5, R.drawable.five));
        blocks.add(new Square(6, R.drawable.six));
        blocks.add(new Square(1, R.drawable.one));
        blocks.add(new Square(3, R.drawable.three));
        blocks.add(new Square(5, R.drawable.five));
        blocks.add(new Square(1, R.drawable.one));
        blocks.add(new Square(1, R.drawable.one));
        blocks.add(new Square(2, R.drawable.two));
        blocks.add(new Square(4, R.drawable.four));
        blocks.add(new Square(5, R.drawable.five));
        blocks.add(new Square(6, R.drawable.six));
        blocks.add(new Square(1, R.drawable.one));
        blocks.add(new Square(3, R.drawable.three));
        blocks.add(new Square(5, R.drawable.five));
        blocks.add(new Square(1, R.drawable.one));
        blocks.add(new Square(1, R.drawable.one));
        blocks.add(new Square(2, R.drawable.two));
        blocks.add(new Square(4, R.drawable.four));
        blocks.add(new Square(5, R.drawable.five));
        blocks.add(new Square(6, R.drawable.six));
        blocks.add(new Square(1, R.drawable.one));
        blocks.add(new Square(3, R.drawable.three));
        blocks.add(new Square(5, R.drawable.five));
        blocks.add(new Square(1, R.drawable.one));

        SquareAdapter adapter = new SquareAdapter(this, blocks, R.color.colorAccent);

        GridView gridView = (GridView)findViewById(R.id.grid_view);

        gridView.setAdapter(adapter);

    }
}

