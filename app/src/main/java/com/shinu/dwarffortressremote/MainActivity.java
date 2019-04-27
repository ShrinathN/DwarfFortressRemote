package com.shinu.dwarffortressremote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    String string_global_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MenuInflater menuInflater = getMenuInflater();

        //getting all the buttons
        Button button_upKey = findViewById(R.id.button_upKey);
        Button button_downKey = findViewById(R.id.button_downKey);
        Button button_leftKey = findViewById(R.id.button_leftKey);
        Button button_rightKey = findViewById(R.id.button_rightKey);

        Button button_plusKey = findViewById(R.id.button_plusKey);
        Button button_minusKey = findViewById(R.id.button_minusKey);

        Button button_layerUp = findViewById(R.id.button_layerUp);
        Button button_layerDown = findViewById(R.id.button_layerDown);

        Button button_enter = findViewById(R.id.button_enter);

        Button button_look = findViewById(R.id.button_look);
        Button button_status = findViewById(R.id.button_status);
        Button button_designations = findViewById(R.id.button_designations);
        Button button_build = findViewById(R.id.button_build);
        Button button_units = findViewById(R.id.button_units);
        Button button_buildings = findViewById(R.id.button_buildings);

        button_upKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatagramSender datagramSender = new DatagramSender("#UP",
            }
        });
    }
}
