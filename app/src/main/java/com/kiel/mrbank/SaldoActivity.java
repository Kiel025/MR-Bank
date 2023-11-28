package com.kiel.mrbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kiel.mrbank.databinding.ActivitySaldoBinding;

public class SaldoActivity extends AppCompatActivity {

    private ActivitySaldoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySaldoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.toolbarSaldo.setNavigationOnClickListener(v -> {
            finish();
        });
    }
}