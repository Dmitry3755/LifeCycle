package com.example.lifecycleapplication.ui.auth.registration;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.example.lifecycleapplication.R;
import com.example.lifecycleapplication.ui.base.BaseFragment;

public class RegistrationFragment extends BaseFragment {

    public RegistrationFragment() {
        super(R.layout.fmt_registration, "RegistrationFragment");
    }
    @Override
    public void initializeComponent(@NonNull View view) {

        Button createPinButton = view.findViewById(R.id.create_pin_button);
        Button havePinButton = view.findViewById(R.id.have_pin_button);

        havePinButton.setOnClickListener(clickListener -> {
            Navigation.findNavController(view).navigate(R.id.action_registrationFragment_to_authFragment);
        });
        createPinButton.setOnClickListener(clickListener -> {
            Navigation.findNavController(view).navigate(R.id.action_registrationFragment_to_secondActivity);
        });

        Log.i("RegistrationFragment", "initializeComponent");
    }

}