package com.example.samar_project;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class AjoutActivity extends AppCompatActivity {

    String[] myData={"Les Ordinateurs","Le Composants","Le Stockage","Les Moniteurs","Les Accessoires"};
    Spinner mySpinner;
    Button valid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout);
        mySpinner =(Spinner) findViewById(R.id.spinner);
        valid=findViewById(R.id.valid);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item,myData);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(adapter);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        valid.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent a=new Intent(AjoutActivity.this,ComputersActivity.class);
                                startActivity(a);
                            }
                        });
                        break;
                    case 1:
                        valid.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent b=new Intent(AjoutActivity.this,ComponentsActivity.class);
                                startActivity(b);
                            }
                        });
                        break;
                    case 2:
                        valid.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent c=new Intent(AjoutActivity.this,StockageActivity.class);
                                startActivity(c);
                            }
                        });
                        break;
                    case 3:
                        valid.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent d=new Intent(AjoutActivity.this,MonitorsActivity.class);
                                startActivity(d);
                            }
                        });
                        break;
                    case 4:
                        valid.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent e=new Intent(AjoutActivity.this,AccessoiresActivity.class);
                                startActivity(e);
                            }
                        });
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(AjoutActivity.this, "Selectionner une catégorie", Toast.LENGTH_SHORT).show();
            }
        });
    }
}