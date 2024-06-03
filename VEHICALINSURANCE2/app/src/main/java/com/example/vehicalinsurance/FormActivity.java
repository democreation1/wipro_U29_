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
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FormActivity extends AppCompatActivity {

    private EditText editTextHolder;
    private EditText editTextDetailsOfIncident;
    private EditText editTextPoliceReport;
    private EditText editTextInjuryDetails;
    private EditText editTextDamageDetails;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.FormActivity);

        editTextHolder = findViewById(R.id.holder);
        editTextDetailsOfIncident = findViewById(R.id.DetailsofIncident);
        editTextPoliceReport = findViewById(R.id.report);
        editTextInjuryDetails = findViewById(R.id.injury);
        editTextDamageDetails = findViewById(R.id.damage);
        buttonSubmit = findViewById(R.id.btn2);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String holder = editTextHolder.getText().toString();
                String detailsOfIncident = editTextDetailsOfIncident.getText().toString();
                String policeReport = editTextPoliceReport.getText().toString();
                String injuryDetails = editTextInjuryDetails.getText().toString();
                String damageDetails = editTextDamageDetails.getText().toString();
                Toast.makeText(FormActivity.this, "Form submitted successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
