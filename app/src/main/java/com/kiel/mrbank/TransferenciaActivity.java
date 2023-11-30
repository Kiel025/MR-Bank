package com.kiel.mrbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kiel.mrbank.databinding.ActivityTransferenciaBinding;

public class TransferenciaActivity extends AppCompatActivity {

    private ActivityTransferenciaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTransferenciaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.toolbarTransferencias.setNavigationOnClickListener(v -> {
            finish();
        });
    }
}