package com.example.weatheraapi_arsencs12;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.weatheraapi_arsencs12.databinding.ActivityMainBinding;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private BottomSheetBehavior sheetBehavior;
    private ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(R.layout.activity_main);
    }
}