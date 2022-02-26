package com.example.android3lessson6;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android3lessson6.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initListeners();

    }

    private void initListeners() {
        binding.btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Mathematics mathematics = new Mathematics();
                String num1 = binding.etFirst.getText().toString();
                String num2 = binding.etSecond.getText().toString();
                String result = mathematics.add(num1, num2);
                binding.tvResult.setText(result);

            }
        });

    }
}