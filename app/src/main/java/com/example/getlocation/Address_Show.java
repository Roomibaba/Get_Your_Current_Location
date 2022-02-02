package com.example.getlocation;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Address;
import android.os.Bundle;

import com.example.getlocation.databinding.ActivityAddressShowBinding;

import java.util.ArrayList;
import java.util.List;

public class Address_Show extends AppCompatActivity {
    ActivityAddressShowBinding binding;

    List<Address> addresses=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAddressShowBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        addresses= (List<Address>) getIntent().getSerializableExtra("location");

        binding.addres.setText(addresses.get(0).getLocality());
        binding.contry.setText(addresses.get(0).getAddressLine(0));
        binding.longt.setText(String.valueOf(addresses.get(0).getLongitude()));
        binding.loti.setText(String.valueOf(addresses.get(0).getLatitude()));


    }
}