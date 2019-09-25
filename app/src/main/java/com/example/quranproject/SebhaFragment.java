package com.example.quranproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class SebhaFragment extends Fragment {
    View view;
    int total_count=0;
    int once_count=0;
    TextView Count;
    TextView Total;
    Spinner spinner;
    ImageView sync;
    ImageView Sebha;
    public SebhaFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.fragment_sebha, container, false);
        spinner=view.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getContext(),R.array.azkar, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        Count=view.findViewById(R.id.Count_Tasbeha);
        Total=view.findViewById(R.id.Total_Count_Tasbeha);
        Count.setText(once_count+"");
        Total.setText(total_count+"");
        sync=view.findViewById(R.id.sync);
        Sebha=view.findViewById(R.id.Sebha);
        sync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                once_count=0;
                total_count=0;
                Count.setText(once_count+"");
                Total.setText(total_count+"");


            }
        });

        Sebha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                once_count++;
                total_count++;
                Count.setText(once_count+"");
                Total.setText(total_count+"");
            }
        });
        return view ;

    }

}
