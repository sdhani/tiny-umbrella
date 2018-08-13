package com.example.android.hamburgerblitz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class Level1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        final ArrayList<Square> blocks = new ArrayList<Square>();

        blocks.add(new Square(1, R.color.colorAccent));
        blocks.add(new Square(2, R.color.colorPrimary));
        blocks.add(new Square(3, R.color.colorAccent));
        blocks.add(new Square(4, R.color.colorAccent));
        blocks.add(new Square(5, R.color.colorPrimaryDark));
        blocks.add(new Square(6, R.color.colorPrimaryDark));
        blocks.add(new Square(1, R.color.colorPrimary));
        blocks.add(new Square(5, R.color.colorAccent));
        blocks.add(new Square(6, R.color.colorAccent));
        blocks.add(new Square(6, R.color.colorPrimaryDark));
       // blocks.add(new Square(1, R.color.colorPrimaryDark));
       // blocks.add(new Square(5, R.color.colorAccent));

        SquareAdapter adapter = new SquareAdapter(this, blocks);

        GridView gridView = (GridView)findViewById(R.id.grid_view);

        gridView.setAdapter(adapter);

        int firstClickRecord = 0;

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Square block = blocks.get(position);
                int value = block.getSquareValue();

                if(blocks.get(position + 3) != null &&
                        blocks.get(position - 3) != null ){
                    if(blocks.get(position + 2).getSquareValue() == value && blocks.get(position + 3).getSquareValue() == value){
                        Toast.makeText(Level1.this, "Yes. Possible Move", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}

