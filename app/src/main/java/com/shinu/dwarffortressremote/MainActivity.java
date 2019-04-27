package com.shinu.dwarffortressremote;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //default address
    String global_string_address = "192.168.1.12";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                DatagramSender datagramSender = new DatagramSender("#UP", global_string_address);
                datagramSender.sendData();
            }
        });

        button_downKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatagramSender datagramSender = new DatagramSender("#DOWN", global_string_address);
                datagramSender.sendData();
            }
        });

        button_leftKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatagramSender datagramSender = new DatagramSender("#LEFT", global_string_address);
                datagramSender.sendData();
            }
        });

        button_rightKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatagramSender datagramSender = new DatagramSender("#RIGHT", global_string_address);
                datagramSender.sendData();
            }
        });

        button_plusKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatagramSender datagramSender = new DatagramSender("+", global_string_address);
                datagramSender.sendData();
            }
        });

        button_minusKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatagramSender datagramSender = new DatagramSender("-", global_string_address);
                datagramSender.sendData();
            }
        });

        button_layerUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatagramSender datagramSender = new DatagramSender(">", global_string_address);
                datagramSender.sendData();
            }
        });

        button_layerDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatagramSender datagramSender = new DatagramSender("<", global_string_address);
                datagramSender.sendData();
            }
        });

        button_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatagramSender datagramSender = new DatagramSender("#RETURN", global_string_address);
                datagramSender.sendData();
            }
        });

        button_look.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatagramSender datagramSender = new DatagramSender("k", global_string_address);
                datagramSender.sendData();
            }
        });

        button_status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatagramSender datagramSender = new DatagramSender("z", global_string_address);
                datagramSender.sendData();
            }
        });

        button_designations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatagramSender datagramSender = new DatagramSender("d", global_string_address);
                datagramSender.sendData();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_ipselector, menu);
        return true;
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.menu_item_selectip) {
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.layout_ipselector);
            final EditText editText_ipselector_ip = dialog.findViewById(R.id.editText_ipselector_ip);
            Button button_ipselector_setip = dialog.findViewById(R.id.button_ipselector_setip);
            button_ipselector_setip.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    global_string_address = editText_ipselector_ip.getText().toString();
                }
            });
            dialog.show();
        }
        return true;
    }
}
