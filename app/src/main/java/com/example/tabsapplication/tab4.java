package com.example.tabsapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class tab4 extends Fragment {

    String cancion []=new String[4];
    private ListView li;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.xml4,container,false);

        cancion[0]="Roto";
        cancion[1]="Aleluya";
        cancion[2]="Agnus Dei";
        cancion[3]="Majestuoso";
        li = v.findViewById(R.id.li);

        ArrayAdapter aa = new ArrayAdapter(v.getContext(),android.R.layout.simple_list_item_1,cancion);

        li.setAdapter(aa);
        li.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                Toast.makeText(v.getContext(), cancion[i], Toast.LENGTH_SHORT ).show();


                switch (cancion[i]){
                    case "Roto":
                        Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=VkFt1TCsLqI&ab_channel=GrupoElegidos"));
                        startActivity(a);
                        break;
                    case "Aleluya":
                        Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=wUv9-T5XcfM"));
                        startActivity(b);
                        break;
                    case "Agnus Dei":
                        Intent c = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Mekdq1MKrug"));
                        startActivity(c);
                        break;
                    case "Majestuoso":
                        Intent d = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Z5UiBleDnhY"));
                        startActivity(d);
                        break;
                }

            }
        });
        return v;
    }
}
