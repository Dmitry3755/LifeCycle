package com.example.lifecycleapplication.ui.auth.auth;

import androidx.navigation.Navigation;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.example.lifecycleapplication.R;
import com.example.lifecycleapplication.ui.base.BaseFragment;

public class AuthFragment extends BaseFragment {

    public AuthFragment() {
        super(R.layout.fmt_auth, "AuthFragment");
    }

    @Override
    public void initializeComponent(View view) {

        Button enterPinButton = view.findViewById(R.id.enter_pin_button);
        Button createPinButton = view.findViewById(R.id.create_pin_button);

        createPinButton.setOnClickListener(clickListener -> {
            Navigation.findNavController(view).navigate(R.id.action_authFragment_to_registrationFragment);
        });
        enterPinButton.setOnClickListener(clickListener -> {
            Navigation.findNavController(view).navigate(R.id.action_registrationFragment_to_secondActivity);
        });

        Log.i("AuthFragment", "initializeComponent");
    }

}