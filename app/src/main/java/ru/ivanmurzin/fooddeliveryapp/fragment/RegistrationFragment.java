package ru.ivanmurzin.fooddeliveryapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import ru.ivanmurzin.fooddeliveryapp.databinding.FragmentRegistrationBinding;

public class RegistrationFragment extends Fragment {
    private FragmentRegistrationBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentRegistrationBinding.inflate(inflater, container, false);
        binding.buttonEnter.setOnClickListener(view -> {
            final String email = binding.inputEmail.getInputText();
            final String password = binding.inputPassword.getInputText();
            final String repeatPassword = binding.inputRepeatPassword.getInputText();
            final String nickName = binding.inputNickName.getInputText();
            Toast.makeText(getContext(), email + " " + password + " " + nickName, Toast.LENGTH_SHORT).show();

        });
        return binding.getRoot();
    }
}