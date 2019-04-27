package com.shinu.dwarffortressremote;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
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

        final DatagramSender datagramSender = new DatagramSender();

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
                datagramSender.setAddr(global_string_address);
                datagramSender.setMessage("#UP");
                datagramSender.sendData();
            }
        });

        button_downKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datagramSender.setAddr(global_string_address);
                datagramSender.setMessage("#DOWN");
                datagramSender.sendData();
            }
        });

        button_leftKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datagramSender.setAddr(global_string_address);
                datagramSender.setMessage("#LEFT");
                datagramSender.sendData();
            }
        });

        button_rightKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datagramSender.setAddr(global_string_address);
                datagramSender.setMessage("#RIGHT");
                datagramSender.sendData();
            }
        });

        button_plusKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datagramSender.setAddr(global_string_address);
                datagramSender.setMessage("#PLUS");
                datagramSender.sendData();
            }
        });

        button_minusKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datagramSender.setAddr(global_string_address);
                datagramSender.setMessage("#MINUS");
                datagramSender.sendData();
            }
        });

        button_layerUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datagramSender.setAddr(global_string_address);
                datagramSender.setMessage("#GREATER");
                datagramSender.sendData();
            }
        });

        button_layerDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datagramSender.setAddr(global_string_address);
                datagramSender.setMessage("#LESS");
                datagramSender.sendData();
            }
        });

        button_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datagramSender.setAddr(global_string_address);
                datagramSender.setMessage("#RETURN");
                datagramSender.sendData();
            }
        });

        button_look.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datagramSender.setAddr(global_string_address);
                datagramSender.setMessage("k");
                datagramSender.sendData();
            }
        });

        button_status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datagramSender.setAddr(global_string_address);
                datagramSender.setMessage("z");
                datagramSender.sendData();
            }
        });

        button_designations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datagramSender.setAddr(global_string_address);
                datagramSender.setMessage("d");
                datagramSender.sendData();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_ipselector, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Log.d("LOG", "ITEM SELECT DETECTION");
        if(id == R.id.menu_item_selectip) {
            Log.d("LOG", "ITEM SELECTED");
            Dialog dialog = new Dialog(MainActivity.this);
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
        return super.onOptionsItemSelected(item);
    }

}
