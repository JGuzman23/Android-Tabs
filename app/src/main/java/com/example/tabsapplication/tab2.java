package com.example.tabsapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

public class tab2 extends Fragment {

    private EditText email;
    private  EditText pass;
    private Button logIn;
    String user ="juang";
    String pas="1234";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.xml2,container,false);
//
        email = v.findViewById(R.id.et_email);
        pass = v.findViewById(R.id.et_pass);
//
        logIn = v.findViewById(R.id.ing);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(email.getText().toString().equals(user) && pass.getText().toString().equals(pas)){
                    Toast.makeText(v.getContext(), "registro exitoso", Toast.LENGTH_SHORT ).show();

                }
                else{
                    Toast.makeText(v.getContext(), "Email o contraseña incorrecta!", Toast.LENGTH_SHORT ).show();
                }
            }
        });



        return v;

    }


}
