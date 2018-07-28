package com.example.android.hamburgerblitz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView start = findViewById(R.id.start_text_view);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent levelOneIntent = new Intent(MainActivity.this, Level1.class);
                startActivity(levelOneIntent);
            }
        });


    }
}

