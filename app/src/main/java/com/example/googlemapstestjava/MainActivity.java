package com.example.googlemapstestjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText etv;
    private Uri url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etv = findViewById(R.id.etv);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                url = Uri.parse(
                        "https://www.google.com/maps/dir/?api=1&origin=" +
                                "目前位置&destination=" + etv.getText()
                );
                Intent intent = new Intent("android.intent.action.VIEW",url);
                startActivity(intent);
            }
        });
    }
}