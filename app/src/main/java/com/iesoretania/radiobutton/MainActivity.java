package com.iesoretania.radiobutton;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.iesoretania.radiobutton.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String num1 = binding.editTextText2.getText().toString();
        String num2 = binding.editTextText3.getText().toString();

        int valor1 = Integer.parseInt(num1);
        int valor2 = Integer.parseInt(num2);

        int suma = valor1 + valor2;
        int resta = valor1 - valor2;
        int multipliacion = valor1 * valor2;
        int division = valor1 / valor2;

        binding.radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvsuma = binding.editTextText;
                tvsuma.setText(String.valueOf(suma));
            }
        });

        binding.radioButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvresta = binding.editTextText;
                tvresta.setText(String.valueOf(resta));
            }
        });

        binding.radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvmultplicacion = binding.editTextText;
                tvmultplicacion.setText(String.valueOf(multipliacion));
            }
        });

        binding.radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvdivision = binding.editTextText;
                tvdivision.setText(String.valueOf(division));
            }
        });

    }


}