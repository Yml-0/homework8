package ru.ivanmurzin.fooddeliveryapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import ru.ivanmurzin.fooddeliveryapp.databinding.FragmentLoginBinding;

public class LoginFragment extends Fragment {

    private FragmentLoginBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(inflater, container, false);
        binding.buttonEnter.setOnClickListener(view -> {
            final String email = binding.inputEmail.getInputText();
            final String password = binding.inputPassword.getInputText();
            Toast.makeText(getContext(), email + " " + password, Toast.LENGTH_SHORT).show();
        });
        return binding.getRoot();
    }
}