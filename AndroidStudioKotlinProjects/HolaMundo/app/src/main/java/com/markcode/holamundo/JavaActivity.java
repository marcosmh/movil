package com.markcode.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JavaActivity extends AppCompatActivity {

    private Button btn;
    private final String GREETER = "Hello from the other side!";
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btn.setOnClickListener(onClick(view) -> {

            //Acceder al segundo activity y mandarle un string
            Intent intent = new Intent(JavaActivity.this,MainActivity.class);
            intent.putExtra("greeter",GREETER);
            startActivity(intent);
        });
    }

    protected View  onClick(View view) {
        return view;
    }
}