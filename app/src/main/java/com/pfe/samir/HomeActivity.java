package com.pfe.samir;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void ecriture(View view) {
        Intent intent = new Intent(HomeActivity.this, EcritureActivity.class);
        startActivity(intent);

    }

    public void historique(View view) {
        Intent intent = new Intent(HomeActivity.this, HistoriqueActivity.class);
        startActivity(intent);
    }

    public void scanner(View view) {
        Intent intent = new Intent(HomeActivity.this, ScannerActivity.class);
        startActivity(intent);
    }

}