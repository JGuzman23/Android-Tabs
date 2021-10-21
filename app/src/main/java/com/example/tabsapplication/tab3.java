package com.example.tabsapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class tab3 extends Fragment {

    private TextView txt;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.xml3,container,false);

        txt = v.findViewById(R.id.txt_contact);
        txt.setText("JUAN RENE GUZMAN \n Soy estudiante del ITLA \n Me desempeño en la creacion de Software \n Tengo 21 año y me gusta la musica");

        return v;
    }
}
