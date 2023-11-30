package com.kiel.mrbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.kiel.mrbank.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imgSaldo.setOnClickListener( v -> {
            startActivity(new Intent(this, SaldoActivity.class));
        });

        binding.imgFaturas.setOnClickListener(v -> {
            startActivity(new Intent(this, FaturasActivity.class));
        });

        binding.imgTransferencia.setOnClickListener(v -> {
            startActivity(new Intent(this, TransferenciaActivity.class));
        });

        binding.imgPoupanca.setOnClickListener(v -> {
            startActivity(new Intent(this, PoupancaActivity.class));
        });
    }
}