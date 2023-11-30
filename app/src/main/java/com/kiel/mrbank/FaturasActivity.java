package com.kiel.mrbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kiel.mrbank.databinding.ActivityFaturasBinding;
import com.vinaygaba.creditcardview.CardType;
import com.vinaygaba.creditcardview.CreditCardView;

public class FaturasActivity extends AppCompatActivity {

    private ActivityFaturasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFaturasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.toolbarFaturas.setNavigationOnClickListener(v -> {
            finish();
        });

        CreditCardView creditCard = binding.creditCard;

        creditCard.setCardNumber("4235 6477 2802 5682");
        creditCard.setCardName("Ezequiel Sousa Santos");
        creditCard.setExpiryDate("27/30");
        creditCard.setType(CardType.MASTERCARD);
    }
}