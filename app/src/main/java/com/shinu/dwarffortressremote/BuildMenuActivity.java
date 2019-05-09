package com.shinu.dwarffortressremote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BuildMenuActivity extends AppCompatActivity {

    //macros
    final int REQUEST_CODE_BUILD_RESULT = 1;

    //global variables
    static String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build_menu);

        //widget elements
        Button button_build_armorStand = findViewById(R.id.button_build_armorStand);
        Button button_build_bed = findViewById(R.id.button_build_bed);
        Button button_build_seat = findViewById(R.id.button_build_seat);
        Button button_build_burial = findViewById(R.id.button_build_burial);
        Button button_build_door = findViewById(R.id.button_build_door);
        Button button_build_floodgate = findViewById(R.id.button_build_floodgate);
        Button button_build_floorHatch = findViewById(R.id.button_build_floorHatch);
        Button button_build_wallGrate = findViewById(R.id.button_build_wallGrate);
        Button button_build_floorGrate = findViewById(R.id.button_build_floorGrate);
        Button button_build_verticalBars = findViewById(R.id.button_build_verticalBars);
        Button button_build_floorBars = findViewById(R.id.button_build_floorBars);
        Button button_build_cabinet = findViewById(R.id.button_build_cabinet);
        Button button_build_container = findViewById(R.id.button_build_container);
        Button button_build_kennels = findViewById(R.id.button_build_kennels);
        Button button_build_farmPlot = findViewById(R.id.button_build_farmPlot);
        Button button_build_weaponRack = findViewById(R.id.button_build_weaponRack);
        Button button_build_statue = findViewById(R.id.button_build_statue);
        Button button_build_slab = findViewById(R.id.button_build_slab);
        Button button_build_table = findViewById(R.id.button_build_table);
        Button button_build_pavedRoad = findViewById(R.id.button_build_pavedRoad);
        Button button_build_dirtRoad = findViewById(R.id.button_build_dirtRoad);
        Button button_build_bridge = findViewById(R.id.button_build_bridge);
        Button button_build_well = findViewById(R.id.button_build_well);
        Button button_build_siegeEngines = findViewById(R.id.button_build_siegeEngines);
        Button button_build_workshops = findViewById(R.id.button_build_workshops);
        Button button_build_furnaces = findViewById(R.id.button_build_furnaces);
        Button button_build_glassWindow = findViewById(R.id.button_build_glassWindow);
        Button button_build_gemWindow = findViewById(R.id.button_build_gemWindow);
        Button button_build_wall = findViewById(R.id.button_build_wall);
        Button button_build_tradeDepot = findViewById(R.id.button_build_tradeDepot);
        Button button_build_traps = findViewById(R.id.button_build_traps);
        Button button_build_machineComponents = findViewById(R.id.button_build_machineComponents);
        Button button_build_instrument = findViewById(R.id.button_build_instrument);
        Button button_build_support = findViewById(R.id.button_build_support);
        Button button_build_animalTrap = findViewById(R.id.button_build_animalTrap);
        Button button_build_restraint = findViewById(R.id.button_build_restraint);
        Button button_build_cage = findViewById(R.id.button_build_cage);
        Button button_build_archeryTarget = findViewById(R.id.button_build_archeryTarget);
        Button button_build_tractionBench = findViewById(R.id.button_build_tractionBench);
        Button button_build_nestBox = findViewById(R.id.button_build_nestBox);
        Button button_build_hive = findViewById(R.id.button_build_hive);
        Button button_build_bookcase = findViewById(R.id.button_build_bookcase);
        Button button_build_displayFurniture = findViewById(R.id.button_build_displayFurniture);

        button_build_armorStand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "ba";
                resultMethod();
            }
        });

        button_build_bed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bb";
                resultMethod();
            }
        });

        button_build_seat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bc";
                resultMethod();
            }
        });

        button_build_burial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bn";
                resultMethod();
            }
        });

        button_build_door.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bd";
                resultMethod();
            }
        });

        button_build_floodgate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bx";
                resultMethod();
            }
        });

        button_build_floorHatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bH";
                resultMethod();
            }
        });

        button_build_wallGrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bW";
                resultMethod();
            }
        });

        button_build_floorGrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bG";
                resultMethod();
            }
        });

        button_build_verticalBars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bB";
                resultMethod();
            }
        });

        button_build_floorBars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "b!Alt+b";
                resultMethod();
            }
        });

        button_build_cabinet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bf";
                resultMethod();
            }
        });

        button_build_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bh";
                resultMethod();
            }
        });

        button_build_kennels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bk";
                resultMethod();
            }
        });

        button_build_farmPlot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bp";
                resultMethod();
            }
        });

        button_build_weaponRack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "br";
                resultMethod();
            }
        });

        button_build_statue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bs";
                resultMethod();
            }
        });

        button_build_slab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "b!Alt+s";
                resultMethod();
            }
        });

        button_build_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bt";
                resultMethod();
            }
        });

        button_build_pavedRoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bo";
                resultMethod();
            }
        });

        button_build_dirtRoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bO";
                resultMethod();
            }
        });

        button_build_bridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bg";
                resultMethod();
            }
        });

        button_build_well.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bl";
                resultMethod();
            }
        });

        button_build_siegeEngines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        button_build_workshops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bw";
                resultMethod();
            }
        });

        button_build_furnaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        button_build_glassWindow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "by";
                resultMethod();
            }
        });

        button_build_gemWindow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bY";
                resultMethod();
            }
        });

        button_build_wall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        button_build_tradeDepot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bD";
                resultMethod();
            }
        });

        button_build_traps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });


        button_build_machineComponents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        button_build_instrument.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bI";
                resultMethod();
            }
        });

        button_build_support.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bS";
                resultMethod();
            }
        });

        button_build_animalTrap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bm";
                resultMethod();
            }
        });

        button_build_restraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bv";
                resultMethod();
            }
        });

        button_build_cage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bj";
                resultMethod();
            }
        });

        button_build_archeryTarget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bA";
                resultMethod();
            }
        });

        button_build_tractionBench.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bR";
                resultMethod();
            }
        });

        button_build_nestBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bN";
                resultMethod();
            }
        });

        button_build_hive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "b!Alt+h";
                resultMethod();
            }
        });

        button_build_bookcase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "b!Alt+c";
                resultMethod();
            }
        });

        button_build_displayFurniture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = "bF";
                resultMethod();
            }
        });
    }

    public void resultMethod() {
        Intent intent = new Intent();
        intent.putExtra("message", msg);
        setResult(REQUEST_CODE_BUILD_RESULT, intent);
        finish();
    }
}