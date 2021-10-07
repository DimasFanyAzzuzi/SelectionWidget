package com.example.selectionwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Actv extends AppCompatActivity {
    private static final String[] KAMAR = new String[]{
      "Bantal", "Guling", "Kasur", "Meja", "Kursi", "Lemari"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actv);

        AutoCompleteTextView editText = findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, KAMAR);
        editText.setAdapter(adapter);
    }
}