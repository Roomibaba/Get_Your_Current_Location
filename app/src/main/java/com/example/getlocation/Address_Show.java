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
        binding.contuary.setText(addresses.get(0).getCountryName());
        binding.loaclity.setText(addresses.get(0).getLocality());
        binding.punjab.setText(addresses.get(0).getAdminArea());
        binding.adds.setText(addresses.get(0).getSubLocality());
        binding.longt.setText(String.valueOf(addresses.get(0).getLongitude()));
        binding.loti.setText(String.valueOf(addresses.get(0).getLatitude()));


    }
}