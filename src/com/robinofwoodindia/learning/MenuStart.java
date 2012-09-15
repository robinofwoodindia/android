package com.robinofwoodindia.learning;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MenuStart extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_start);
        
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu_start, menu);
        return true;
    }
}
