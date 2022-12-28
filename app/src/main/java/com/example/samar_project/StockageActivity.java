package com.example.samar_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class StockageActivity extends AppCompatActivity {
    ListView liststock;
    String[] a=new String[]{"Disque Dur SSD","Disque Dur Interne","Disque Dur Externe","Clé USB","Carte Mémoire"};
    int[] imag={R.drawable.disqueportatif,R.drawable.disqueinterne,R.drawable.dusqueexterne,R.drawable.cleusb,R.drawable.cartememoie};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stockage);
        liststock=findViewById(R.id.stocklist);
        registerForContextMenu(liststock);
        GridAdapter s=new GridAdapter(this,a,imag);
        liststock.setAdapter(s);
        liststock.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ShowDialog(i);
            }
        });
    }
    private void ShowDialog(int pos) {
        Dialog dialog = new Dialog(StockageActivity.this);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog);
        ImageView img=dialog.findViewById(R.id.img);
        TextView name=dialog.findViewById(R.id.name);
        TextView desc=dialog.findViewById(R.id.desc);
        TextView prix=dialog.findViewById(R.id.prix);
        Button annul=dialog.findViewById(R.id.annul);

        if (pos==0) {
            img.setImageResource(R.drawable.disqueportatif);
            name.setText("Disque Dur SSD HP EX900 Pro M.2 512GB PCIe 3.0 X4 NVMe");
            desc.setText("EX900 Pro - Disque SSD interne (SSD) - Facteur de forme M.2 2280  - Capacité 512 Go - Composants de la mémoire NAND 3D - Interface PCI-Express 3.0 x4 - Lecture séquentielle maximale Jusqu'à 2050 Mbps - Écriture séquentielle max. Jusqu'à 1800 Mbps - Lecture aléatoire de 4 Ko Jusqu'à 190 000 IOPS - MTBF 2000000 heures  -Température de fonctionnement 0 ° C à + 70 ° C - Température de stockage -40 ° C à + 85 ° C");
            prix.setText("249,000 TND");
        }
        else if (pos==1){
            img.setImageResource(R.drawable.disqueinterne);
            name.setText("Disque Dur Toshiba P300 4To 3.5");
            desc.setText("Disque dur HDD de 3.5 avec interface SATA III Mémoire tampon de 128 Mo Version bulk Dimensions : 147 x 101.6 x 26.1 mm Poids : 680 g");
            prix.setText("329,000 TND");
        }
        else if (pos==2){
            img.setImageResource(R.drawable.dusqueexterne);
            name.setText("DISQUE DUR EXTERNE ADATA HV300 USB 3.1 / 1 TO / BLANC");
            desc.setText("Disque Dur Externe Adata HV300 - Capacité 1 To - Interface USB 3.1, rétrocompatible avec USB 2.0 - Texture Plastique - Température de fonctionnement: 5–50 °C/41–121 °F - Tension de fonctionnement: 5 V CC, 900 mA - Accessoires: Câble USB 3.1 - Dimensions: 125.7 x 80.5 x 10.3 mm - Poids: 139.8 g - Couleur Blanc - Garantie 3 ans");
            prix.setText("149,000 TND");
        }
        else if (pos==3){
            img.setImageResource(R.drawable.cleusb);
            name.setText("Clé USB 3.1 TeamGroup C188 - 64 Go - Bleu");
            desc.setText("Conception sans capuchon minimaliste et rationalisée - Performances de transfert de données puissantes - Conception rétractable facile - Interface prête à l'emploi - Interface USB 3.2 Gen1 - Capacité 64 Go - Couleur Bleu - Tension DC + 5 V - Poids 9g - Taux de transfert des données R / W: jusqu'à 130/50 Mo/s - Dimensions 78,2 (L) x 20,5 (L) x 12,2 (H) mm - Système opérateur Windows, OS Mac OS X v.10.6.x +, Linux v.2.6.x +");
            prix.setText("28,000 TND");
        }
        else {
            img.setImageResource(R.drawable.cartememoie);
            name.setText("CARTE MÉMOIRE TEAMGROUP MICRO SDHC CLASS10 AVEC ADAPTATEUR 32GO");
            desc.setText("Capacité de stockage: 32GB - Class10 - Vitesse de Lecture Jusqu'à 20Mb/s - Vitesse d'écriture Jusqu'à 14Mb/s - Dimensions : 15.0 x 11.0 x 1.0 mm");
            prix.setText("8,900 TND");
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
            case R.id.it1:
                Intent a=new Intent(StockageActivity.this,AjoutActivity.class);
                startActivity(a);
                break;
            case R.id.it2:
                Intent b=new Intent(StockageActivity.this,RechercheActivity.class);
                startActivity(b);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}