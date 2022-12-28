package com.example.samar_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ComputersActivity extends AppCompatActivity {
    ListView listpc;
    String[] a=new String[]{"ACER","LENOVO","ASUS","MSI","DELL"};
    int[] imag={R.drawable.acer,R.drawable.lenovo,R.drawable.asus,R.drawable.msi,R.drawable.dell};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computers);
        listpc=findViewById(R.id.pclist);
        registerForContextMenu(listpc);
        GridAdapter s=new GridAdapter(this,a,imag);
        listpc.setAdapter(s);
        listpc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ShowDialog(i);
            }
        });

    }
    private void ShowDialog(int pos) {
        Dialog dialog = new Dialog(ComputersActivity.this);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog);
        ImageView img=dialog.findViewById(R.id.img);
        TextView name=dialog.findViewById(R.id.name);
        TextView desc=dialog.findViewById(R.id.desc);
        TextView prix=dialog.findViewById(R.id.prix);
        Button annul=dialog.findViewById(R.id.annul);

        if (pos==0) {
            img.setImageResource(R.drawable.acer);
            name.setText("Acer Aspire A315 i3 10è Gen 4Go 1To");
            desc.setText("15.6'' HD, Intel Core i3 10 ème génération, 4Go, 1To, Intel HD Graphics");
            prix.setText("949,000 TND");
        }
        else if (pos==1){
            img.setImageResource(R.drawable.lenovo);
            name.setText("LENOVO IDEAPAD 5 15ITL05 I7 11È GÉN 8GO 512GO SSD - BLEU");
            desc.setText("Ecran 15.6\" FULL HD " +
                    " Processeur : Intel Core i7-1165G7 (2,80 GHz jusqu'à 4,70 GHz Turbo max, 12 Mo de mémoire cache, Quad-Core) " +
                    "Carte graphique : Intel Iris Xᵉ Graphics " +
                    "Mémoire RAM : 8Go DDR4-3200 " +
                    "Disque Dur: 512 Go SSD " +
                    "Système d'exploitation : FreeDos " +
                    "Couleur : bleu " +
                    "Garantie : 1an");
            prix.setText("2 159,000 TND");
        }
        else if (pos==2){
            img.setImageResource(R.drawable.asus);
            name.setText("ASUS X543 Celeron N4020 8Go / 1To");
            desc.setText("Ecran 15.6\" HD ;Intel Celeron N4020 (1,10 GHz up to 2.80 GHz ; 8 Go RAM ;1 To ; Intel HD Graphics ;Windows 10;Gris");
            prix.setText("679,000 TND");
        }
        else if (pos==3){
            img.setImageResource(R.drawable.msi);
            name.setText("MSI MODERN15-A10M-651XF");
            desc.setText("15.6\" FHD;Intel Core i3-10110U4;8 Go;256 Go SSD;Carte graphique Intel UHD Graphics;FreeDos");
            prix.setText("1 489,000 TND");
        }
        else {
            img.setImageResource(R.drawable.dell);
            name.setText("DELL PC PORTABLE INSPIRON 5570 I7 8è GéN 8GO 1TO NOIR");
            desc.setText("Ecran 15.6\"LED Full HD  (1920 x 1080 px) - Processeur: Intel® Core?   i7- 8550U 8ème Génération ( 1.80 GHz jusqu?à 4.00 GHz, 8 Mo Cache, Quad-core ) - Systéme d'exploitation:  FreeDos - Mémoire RAM: 8 Go DDR4 - Disque dur: 1 To  -  Carte Graphique:  AMD Radeon 530 (4 Go GDDR5  de mémoire dédiée) avec Lecteur de cartes - Wifi - Bluetooth - Webcam avec Micro -  Couleur: Noir");
            prix.setText("2 099,000 TND");
        }

        annul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.it1:{
                Intent a=new Intent(ComputersActivity.this,RechercheActivity.class);
                startActivity(a);
                break;}
            case R.id.it2:{
                Intent b=new Intent(ComputersActivity.this,RechercheActivity.class);
                startActivity(b);
                break;}

        }
        return super.onOptionsItemSelected(item);
    }

}