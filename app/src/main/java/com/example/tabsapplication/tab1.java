package com.example.tabsapplication;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class tab1 extends Fragment   {

    private Button Play;
    private TextView txt;
    private VideoView video;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.xml1,container,false);



        video = (VideoView) view.findViewById(R.id.videoView);
        txt=view.findViewById(R.id.info);
        Play = view.findViewById(R.id.play);
        txt.setText("App multiTabs \n creada 20/10/21 por JUAN GUZMAN\n Su funcion es mostar un video de bienvenida asi como lo ven arriba, tener un formulario para ingresar, debe contener mis tres canciones favoritas y mi descripcion");

        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reproducir();

            }
        });

        reproducir();

     return view;
    }

    public void reproducir(){
        Uri uri = Uri.parse("http://techslides.com/demos/sample-videos/small.mp4");
        // video.setMediaController(new MediaController(getContext()));
        video.setVideoURI(uri);
        video.requestFocus();
        video.start();
    }




}
