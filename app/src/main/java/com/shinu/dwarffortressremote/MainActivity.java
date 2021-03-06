package com.shinu.dwarffortressremote;

import android.app.Dialog;
import android.content.Intent;
import android.support.annotation.Nullable;
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
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {

    //macros
    final int REQUEST_CODE_BUILD_RESULT = 1;

    //global objects
    DatagramSender datagramSender = null;

    //default address
    String global_string_address = "192.168.1.12";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datagramSender = new DatagramSender();

        //getting all the buttons
        final Button button_upKey = findViewById(R.id.button_upKey);
        final Button button_downKey = findViewById(R.id.button_downKey);
        final Button button_leftKey = findViewById(R.id.button_leftKey);
        final Button button_rightKey = findViewById(R.id.button_rightKey);

        final Button button_plusKey = findViewById(R.id.button_plusKey);
        final Button button_minusKey = findViewById(R.id.button_minusKey);

        final Button button_layerUp = findViewById(R.id.button_layerUp);
        final Button button_layerDown = findViewById(R.id.button_layerDown);

        final Button button_enter = findViewById(R.id.button_enter);

        final Button button_spaceKey = findViewById(R.id.button_spaceKey);
        final Button button_escapeKey = findViewById(R.id.button_escapeKey);
        final Button button_resetViewKey = findViewById(R.id.button_resetViewKey);

        final Button button_look = findViewById(R.id.button_look);
        final Button button_status = findViewById(R.id.button_status);
        final Button button_designations = findViewById(R.id.button_designations);
        final Button button_build = findViewById(R.id.button_build);
        final Button button_units = findViewById(R.id.button_units);
        final Button button_buildings = findViewById(R.id.button_buildings);

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

        button_spaceKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datagramSender.setAddr(global_string_address);
                datagramSender.setMessage("#SPACE");
                datagramSender.sendData();
            }
        });

        button_escapeKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datagramSender.setAddr(global_string_address);
                datagramSender.setMessage("#ESCAPE");
                datagramSender.sendData();
            }
        });

        button_resetViewKey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datagramSender.setAddr(global_string_address);
                datagramSender.setMessage("#F1");
                datagramSender.sendData();
            }
        });

        //==============BUILD BUTTON SECTION==============
        button_build.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, BuildMenuActivity.class);
                startActivityForResult(intent, REQUEST_CODE_BUILD_RESULT);
            }
        });
    }

    //========================================================

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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE_BUILD_RESULT) {
            if(resultCode != RESULT_CANCELED)
            datagramSender.setAddr(global_string_address);
            datagramSender.setMessage(data.getStringExtra("message"));
            datagramSender.sendData();
        }
    }
}
