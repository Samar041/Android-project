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

public class MonitorsActivity extends AppCompatActivity {
    ListView listmon;
    String[] a=new String[]{"Philips","Basic","Asus","BenQ","BenQ Zowie"};
    int[] imag={R.drawable.philips,R.drawable.basic,R.drawable.asusmoniteur,R.drawable.benq,R.drawable.benqzowie};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitors);
        listmon=findViewById(R.id.monlist);
        registerForContextMenu(listmon);
        GridAdapter s=new GridAdapter(this,a,imag);
        listmon.setAdapter(s);
        listmon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ShowDialog(i);
            }
        });

    }
    private void ShowDialog(int pos) {
        Dialog dialog = new Dialog(MonitorsActivity.this);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog);
        ImageView img=dialog.findViewById(R.id.img);
        TextView name=dialog.findViewById(R.id.name);
        TextView desc=dialog.findViewById(R.id.desc);
        TextView prix=dialog.findViewById(R.id.prix);
        Button annul=dialog.findViewById(R.id.annul);

        if (pos==0) {
            img.setImageResource(R.drawable.philips);
            name.setText("Ecran Philips 271V8 27\" IPS 75Hz");
            desc.setText("Type d'écran LCD Technologie IPS - Synchronisation adaptative - Type de rétroéclairage Système W-LED - Taille du panneau 27 pouces / 68,6 cm - Revêtement de l'écran d'affichage Anti-éblouissant, 3H, Brume 25% - Zone de visualisation efficace 597,9 (H) x 336,3 (V) - Ratio d'aspect 16:9 - Résolution maximale 1920 x 1080 à 75 Hz - Temps de réponse (typique) 4 ms - Luminosité 250 cd/m² - Rapport de contraste (typique) 1000:1 - Contraste intelligent Mega Infinity DCR - Pas de pixel 0,311 x 0,311 mm - Angle de vue 178º (H) / 178º (V) - Sans scintillement - Couleurs d'affichage 16,7 millions - Mode LowBlue - Lecture facile - sRVB - Connectivité VGA (analogique) / HDMI (numérique, HDCP) - Taille 613 x 456 x 231 mm - Poids 3,75 kg");
            prix.setText("499,000 TND");
        }
        else if (pos==1){
            img.setImageResource(R.drawable.basic);
            name.setText("Ecran Mirror Basic 23.8 IPS FULL HD 75Hz ");
            desc.setText("Taille : 23.8 pouces " +
                    "Type de panneau : IPS " +
                    "Résolution : 1920x1080 " +
                    "Rapport d'écran : 16:9 " +
                    "Contraste : 1000:1 " +
                    "Taux de rafraîchissement : 75Hz " +
                    "Écran luminosité : 250 nits " +
                    "Affichage Couleurs : 16.7 millions de couleurs " +
                    "Gamme de couleurs : 90% P3 (typique) / 100% sRGB couverture");
            prix.setText("399,000 TND");
        }
        else if (pos==2){
            img.setImageResource(R.drawable.asusmoniteur);
            name.setText("Ecran Gaming ASUS 24 LED - VG248QG - 165 Hz - 0.5 Ms");
            desc.setText("Taille 24\" - Format de l'écran 16/9 - Type Dalle TN - Technologie LCD TN - Résolution Max 1920 x 1080 pixels - Dot Pitch 0.276 mm - Luminosité 350 cd/m² - Contraste 100000000 /1 - Temps de réponse 0.5 ms - Angle de vision H 170° - Angle de vision V 160° - Dalle mate/antireflets - NVIDIA G-SYNC - G-SYNC - Adaptive-Sync - Flicker-Free - Anti-lumière bleue - Type d'écran LED - Fréquence verticale maxi 165 Hz - Pied réglable en hauteur - Pied amovible - Angle inclinaison vers l'arrière H 33° - Angle inclinaison vers l'avant B 5° - Entrées vidéo 1 X DisplayPort - 1 X DVI - 1 X HDMI - Entrées DVI DVI-D Dual Link - Entrée audio 1 X Line IN - Sorties audio Casque - H.P. Intégrés - Puissance sonore 2 X 2 W - Largeur 561 mm - Hauteur 489 mm - Profondeur 211 mm - Poids 5.2 kg - Consommation 65 W");
            prix.setText("779,000 TND");
        }
        else if (pos==3){
            img.setImageResource(R.drawable.benq);
            name.setText("Ecran Gaming BenQ MOBIUZ EX2510 25'' FHD IPS 1 Ms 144 Hz FreeSync");
            desc.setText("Taille de l’écran 24.5 - Dalle de l'écran IPS - Technologie de rétro-éclairage LED - Résolution (max.) 1920x1080  -  Luminosité 400- Contraste natif 1000:1 - Angle de vue (gauche/droite, haut/bas) (CR ≥ 10) 178/178 - Temps de réponse 1ms - Taux de rafraîchissement 144Hz - Format de l'image 16:9 - Couleurs d’affichage 16 millions de couleurs - Gammes de couleurs 99% sRGB - Zone d’affichage 543.744x 302.616 mm - PPP 90 - Haut-parleur intégré 2.5Wx2 - Prise casque - Technologie Anti-scintillements - Lumière bleue faible - Brightness Intelligence Plus (B.I.+) - HDMI HDMI (v2.0)x2 - DisplayPort DisplayPort (v1.2)x1 - Dimensions 521.47x557.59x216.65 mm - Poids net 5.6 kg - Inclinaison (bas/haut) -5˚ - 20˚ - Rotation (gauche/droite) 20˚/ 20˚ - Ajustement en hauteur 130 mm");
            prix.setText("889,000 TND");
        }
        else {
            img.setImageResource(R.drawable.benqzowie);
            name.setText("Ecran Gaming BenQ Zowie XL2411K 24\" 144Hz 1ms");
            desc.setText("Taille de l'écran 24\" - Format de l'écran 16/9 - Type de Dalle Dalle TN - Technologie LCD TN - Résolution Max 1920 x 1080 pixels - Dot Pitch 0.276 mm - Luminosité 320 cd/m² - Contraste 1000 /1 -Temps de réponse 1 ms - Dalle mate/antireflets - FreeSync AMD FreeSync Premium - Flicker-Free - Anti-lumière bleue - Type d'écran LED - Fréquence verticale maxi 144 Hz - Pivot - Pied réglable en hauteur - Pied amovible - Entrées vidéo 1 X DisplayPort Femelle, 3 X HDMI Femelle, Entrées DVI, DVI-I Dual-Link (24+5) - Entrée audio Micro (Jack 3.5mm Femelle) -Sorties audio 1 X Casque (Jack 3.5mm Femelle) - Connecteur(s) additionnels 2 X USB 3.0 - Largeur 571 mm - Hauteur 525 mm - Profondeur 200 mm - Poids 5.9 kg");
            prix.setText("699,000 TND");
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
                Intent a=new Intent(MonitorsActivity.this,AjoutActivity.class);
                startActivity(a);
                break;
            case R.id.it2:
                Intent b=new Intent(MonitorsActivity.this,RechercheActivity.class);
                startActivity(b);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}