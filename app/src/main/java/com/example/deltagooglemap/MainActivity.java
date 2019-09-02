package com.example.deltagooglemap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.FragmentActivity;

public class MainActivity extends FragmentActivity {
    private Button SelectRoute;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        SelectRoute = (Button) findViewById(R.id.select_route);
        SelectRoute.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this , MapsActivity.class);
                startActivity(i);
            }
        });

}}
