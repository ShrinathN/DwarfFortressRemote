package com.shinu.dwarffortressremote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BuildMenuActivity extends AppCompatActivity {

    //macros
    final int REQUEST_CODE_BUILD_RESULT = 1;

    //global variables
    static String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build_menu);
        
    }

    public void resultMethod() {
        Intent intent = new Intent();
        intent.putExtra("message", msg);
        setResult(REQUEST_CODE_BUILD_RESULT, intent);
        finish();
    }
}
