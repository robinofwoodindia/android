package com.robinofwoodindia.learning;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MenuStart extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_start);
        
        final TextView $MonTexte = (TextView) findViewById(R.id.textview01MenuStart);
        final Button $Bouton01MenuStart = (Button) findViewById(R.id.bouton01MenuStart);
        final Button $Bouton02MenuStart = (Button) findViewById(R.id.bouton02MenuStart);
        
        $Bouton01MenuStart.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				$MonTexte.setText("Test Affichage sur click et c'est nouveau et good sur les 2 postes");
			}
		});
        
        $Bouton02MenuStart.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				$MonTexte.setText("C'est le Bouton 2");
			}
		});
        
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu_start, menu);
        return true;
    }
}
