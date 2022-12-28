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

public class ComponentsActivity extends AppCompatActivity {
    ListView listcomp;
    String[] a=new String[]{"Processeur","Carte Graphique","Barette memoire RAM","Carte Mère","Boite d'alimentation"};
    int[] imag={R.drawable.processeur,R.drawable.cartegraphique,R.drawable.ram,R.drawable.caretmere,R.drawable.alimentation};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_components);
        listcomp=findViewById(R.id.composlist);
        registerForContextMenu(listcomp);
        GridAdapter s=new GridAdapter(this,a,imag);
        listcomp.setAdapter(s);
        listcomp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ShowDialog(i);
            }
        });

    }

    private void ShowDialog(int pos) {
        Dialog dialog = new Dialog(ComponentsActivity.this);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog);
        ImageView img=dialog.findViewById(R.id.img);
        TextView name=dialog.findViewById(R.id.name);
        TextView desc=dialog.findViewById(R.id.desc);
        TextView prix=dialog.findViewById(R.id.prix);
        Button annul=dialog.findViewById(R.id.annul);

        if (pos==0) {
            img.setImageResource(R.drawable.processeur);
            name.setText("Processeur Intel Core I5-10400F (2.9 GHz / 4.3 GHz)");
            desc.setText("Intel Core i5-10400F (2.9 GHz / 4.3 GHz) - Modèle de processeur: Intel Core i5 - Support du processeur: Intel 1200 - Fréquence CPU: 2.9 GHz - Fréquence en mode Turbo: 4.3 GHz - Fréquence du bus: DMI 8.0 GT/s - Nombre de core: 6 - Nombre de Threads: 12 - Plateforme (Proc.): Intel Comet Lake-S - Nom du core: Comet Lake - Finesse de gravure: 0.014 Micron - TDP: 65 W - Cache L3: 12 Mo - Compatibilité chipset carte mère: Intel B460 Express / Intel H410 Express / Intel H470 Express / Intel Q470 Express / Intel Z490 Express - Chipset graphique: Aucun - Contrôleur mémoire: DDR4 - Type de contrôleur mémoire: Dual Channel - Fréquence(s) Mémoire : DDR4 2133 MHz / DDR4 2400 MHz / DDR4 2666 MHz - Utilisation type: Ordinateur de bureau - Gamer: Oui");
            prix.setText("459,000 TND");
        }
        else if (pos==1){
            img.setImageResource(R.drawable.cartegraphique);
            name.setText("Carte Graphique ZOTAC GAMING GeForce GTX 1650 OC GDDR6");
            desc.setText("GeForce® GTX 1650 - Cœurs CUDA 896 - Mémoire vidéo 4 Go de GDDR6 - Bus mémoire 128 bits - Horloge du moteur Boost: 1620 MHz - Horloge mémoire 12 Gbit / s - PCI Express 3.0 - Affichage des sorties DisplayPort 1.4, HDMI 2.0b, DVI-D double liaison - Prise en charge HDCP - Capacité d'affichage multiple Affichage triple - Alimentation recommandée 350 W - Consommation d'énergie 75 W - DirectX 12 Niveau de fonctionnalité API 12_1 - OpenGL 4.6 - Refroidissement Ventilateur unique - Taille de la fente Double emplacement - Système d'Exploitation pris en charge Windows 10/7 64 bits - Longueur de la carte 151 mm x 111,15 mm x 38,8 mm");
            prix.setText("629,000 TND");
        }
        else if (pos==2){
            img.setImageResource(R.drawable.ram);
            name.setText("Kit De Mémoire GSkill Trident Z Royal Gold DDR4-3000MHz 16GB (2x8GB)");
            desc.setText("Type de mémoire DDR4 - Capacité 16 Go (8 Go x 2) - Kit multicanal Kit double canal - Vitesse testée 3000 MHz - Latence testée 16-18-18-38 - Tension testée 1,35 V - Enregistré / sans tampon Sans tampon - Vérification des erreurs Non-ECC - Vitesse SPD 2133 MHz - Tension SPD 1,20 V - Ventilateur inclus Non - traits Compatible avec Intel XMP 2.0 (profil de mémoire extrême)");
            prix.setText("419,000 TND");
        }
        else if (pos==3){
            img.setImageResource(R.drawable.caretmere);
            name.setText("CARTE MÈRE MSI H110I PRO AC");
            desc.setText("Format de Carte Mère: Micro ATX - Chipset: Intel H110 Express - Support du processeur: Intel 1151 - Format de mémoire: 2 x DIMM 288 pins DDR4 - Fréquence(s) Mémoire: 2133 MHz -  Type de mémoire: DDR4 - Capacité maximale de RAM: 32 Go (2 Slots x 16Go (max) - Connecteur(s) graphique: 1 x PCI Express 3.0 16x - Nombre de connecteurs pour ventilateurs: 2 - Connecteurs Disques: 4 x Serial ATA 6Gb/s (SATA 3) - Connecteurs panneau arrière: 3 x Jack 3,5mm Femelle Stéréo, 1 x MiniDin 6 Femelle (PS/2), 1 x RJ45 Femelle, 4 x USB 2.0, 2 x USB 3.0, 1 x DVI Femelle");
            prix.setText("259,000 TND");
        }
        else {
            img.setImageResource(R.drawable.alimentation);
            name.setText("ALIMENTATION COOLER MASTER MWE White 230V 750W");
            desc.setText("VERSION ATX 12V V2.52 - PFC actif - TENSION D'ENTRÉE 200 à 240V - COURANT D'ENTRÉE 10-6A - FRÉQUENCE D'ENTRÉE 50 à 60Hz - DIMENSIONS 140 x 150 x 86mm - TAILLE VENTIL. 120mm - ROULEMENT VENTIL. HDB - VITESSE VENTIL. 2400 tr/min - NIVEAU SONORE À 20% 11,69dBA - NIVEAU SONORE À 50% 21,6dBA - NIVEAU SONORE À 100% 40,2dBA - EFFICACITÉ 80% de charge typique - CLASSEMENT 80 PLUS Standard - ERP 2014 LOT 3 - TEMPÉRATURE FONCTIONNEMENT 40°C - BON SIGNAL PUISSANCE 100 à 500ms - TEMPS D'ATTENTE > 14ms à 100% pleine charge à 230Vac - MTBF >100 000 H - PROTECTIONS OVP, OPP, OTP, SCP, UVP - RÉGLEMENTAIRE CB, TUV, cTUVus, CE, FCC, CCC, EAC, RCM, BSMI, KC - ATX 24 BROCHES 1 - EPS 4 + 4 BROCHES 1 - EPS 8 BROCHES 1 - SATA 6 - PÉRIPHÉRIQUES À 4 BROCHES 3 - PCI-E 6 + 2 BROCHES 4 - MODULAIRE Non modulaire");
            prix.setText("209,000 TND");
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
                Intent a=new Intent(ComponentsActivity.this,AjoutActivity.class);
                startActivity(a);
                break;}
            case R.id.it2:{
                Intent b=new Intent(ComponentsActivity.this,RechercheActivity.class);
                startActivity(b);
                break;}
        }
        return super.onOptionsItemSelected(item);
    }



}