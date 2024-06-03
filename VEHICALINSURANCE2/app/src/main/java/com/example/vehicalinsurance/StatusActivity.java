package com.example.vehicalinsurance;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StatusActivity extends AppCompatActivity {

    private TextView textViewClaimNumber;
    private TextView textViewDateYear;
    private TextView textViewStatus;
    private Button buttonClaimStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        // Initialize views
        textViewClaimNumber = findViewById(R.id.claim);
        textViewDateYear = findViewById(R.id.DY);
        textViewStatus = findViewById(R.id.stat);
        buttonClaimStatus = findViewById(R.id.cs);


        // Set onClickListener for the button
        buttonClaimStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

    }
}
