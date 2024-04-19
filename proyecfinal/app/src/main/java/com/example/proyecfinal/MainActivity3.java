package com.example.proyecfinal;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    private EditText editTextSearch;
    private Spinner spinnerGenre;
    private Button buttonSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        editTextSearch = findViewById(R.id.editTextSearch);
        spinnerGenre = findViewById(R.id.spinnerGenre);
        buttonSearch = findViewById(R.id.buttonSearch);



        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.genres, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerGenre.setAdapter(adapter);


        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performSearch();
            }
        });
    }


    private void performSearch() {
        String searchTerm = editTextSearch.getText().toString();
        String selectedGenre = spinnerGenre.getSelectedItem().toString();

        String message = "Búsqueda realizada:\nTérmino: " + searchTerm + "\nGénero: " + selectedGenre;
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}