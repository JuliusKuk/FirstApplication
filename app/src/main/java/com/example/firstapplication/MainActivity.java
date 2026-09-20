package com.example.firstapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(
                    systemBars.left,
                    systemBars.top,
                    systemBars.right,
                    systemBars.bottom
            );

            return insets;
        });

        Random r = new Random();

        Button button = findViewById(R.id.button);
        TextView tekstas = findViewById(R.id.textView);
        EditText editintasTekstas = findViewById(R.id.editTextText);
        Button button1 = findViewById(R.id.button2);
        button.setOnClickListener(v -> {

            tekstas.setText(editintasTekstas.getText());
        });
        button1.setOnClickListener(v -> {
            tekstas.setTextColor(Color.rgb(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
        });
    }

}