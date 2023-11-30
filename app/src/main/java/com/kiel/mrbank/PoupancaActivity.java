package com.kiel.mrbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kiel.mrbank.databinding.ActivityPoupancaBinding;

public class PoupancaActivity extends AppCompatActivity {

    private ActivityPoupancaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPoupancaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.toolbarPoupanca.setNavigationOnClickListener(v -> {
            finish();
        });
    }
}