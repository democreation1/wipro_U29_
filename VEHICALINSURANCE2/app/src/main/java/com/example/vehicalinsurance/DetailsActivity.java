package com.example.vehicalinsurance;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    private EditText editTextCarModel;
    private EditText editTextPurchaseYear;
    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        editTextCarModel = findViewById(R.id.model);
        editTextPurchaseYear = findViewById(R.id.year);
        buttonNext = findViewById(R.id.btn);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String carModel = editTextCarModel.getText().toString();
                String purchaseYear = editTextPurchaseYear.getText().toString();

                if (carModel.isEmpty() || purchaseYear.isEmpty()) {
                    Toast.makeText(DetailsActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(DetailsActivity.this, StatusActivity.class);

                    intent.putExtra("CAR_MODEL", carModel);
                    intent.putExtra("PURCHASE_YEAR", purchaseYear);

                    startActivity(intent);
                }
            }
        });
    }
}
