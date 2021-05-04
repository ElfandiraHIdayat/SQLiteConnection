package com.example.sqliteconnection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.sqliteconnection.database.DBController;


public class MenampilkanData  extends AppCompatActivity {

    DBController controller = new DBController(this);

    TextView tNama,tTelpon;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menampilkan_data);

        tNama = findViewById(R.id.textNama);
        tTelpon = findViewById(R.id.textTelpon);
    }

}
