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

public class AccessoiresActivity extends AppCompatActivity {

    ListView listaccess;
    String[] a=new String[]{"Clavier","Souris","Haut-Parleurs","Microphone","Webcam"};
    int[] imag={R.drawable.clavier,R.drawable.souris,R.drawable.hautparleurs,R.drawable.microphones,R.drawable.webcam};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessoires);
        listaccess=findViewById(R.id.acceslist);
        Intent b=getIntent();
        registerForContextMenu(listaccess);
        GridAdapter s=new GridAdapter(this,a,imag);
        listaccess.setAdapter(s);
        listaccess.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ShowDialog(i);
            }
        });

    }
    private void ShowDialog(int pos) {
        Dialog dialog = new Dialog(AccessoiresActivity.this);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.dialog);
        ImageView img=dialog.findViewById(R.id.img);
        TextView name=dialog.findViewById(R.id.name);
        TextView desc=dialog.findViewById(R.id.desc);
        TextView prix=dialog.findViewById(R.id.prix);
        Button annul=dialog.findViewById(R.id.annul);

        if (pos==0) {
            name.setText("CLAVIER SEMI-MÉCANIQUE REDRAGON CENTAUR 2 K506-1 (AZERTY)");
            desc.setText("Type de clavier: Membrane - Type de commutateur: Mem-Chanical - Touches multimédia: Oui, via la touche FN - Taille du clavier: Taille réelle - Rétro-éclairé: Oui, RGB 7 couleurs - Câble: caoutchouc renforcé. Prend en charge 12 kg et 10000 pompes. Filtre USB et anti-interférence plaqués");
            prix.setText("59,000 TND");
            img.setImageResource(R.drawable.clavier);
        }
        else if (pos==1){
            name.setText("Souris Gaming T-DAGGER Brigadier T-TGM206");
            desc.setText("1200/2400/3500/5500/7200 DPI - 10G ACC, 4000FPS - Taux d' interrogation : 125/250/500 / 1000HZ - 50 millions de clics de touches Rétroéclairage RVB - 7 boutons programmables - Câble tressé USB haute vitesse 180cm - Taille: 123x72x33mm");
            prix.setText("29,000 TND");
            img.setImageResource(R.drawable.souris);
        }
        else if (pos==2){
            name.setText("HAUT-PARLEURS LOGITECH STÉRÉO Z200");
            desc.setText("Puissance totale (watts RMS): 5 W - Entrée 3,5 mm: 2 - Prise casque: 1 - Commandes: Commandes de mises sous/hors tension, de volume et de tonalité sur le haut-parleur droit -  Hauteur x Largeur x Épaisseur: 241.2 mm x 90 mm x 124.07 mm - Poids: 1 Kg");
            prix.setText("195,000 TND");
            img.setImageResource(R.drawable.hautparleurs);
        }
        else if (pos==3){
            name.setText("MicroPhone HyperX QuadCast");
            desc.setText("Microphone Consommation d'énergie: 5V 125mA - Fréquence d'échantillonage/débit binaire: 48kHz/16-bit - Élément: microphone électrostatique à électret - Type de condensateur: trois condensateur de 14mm - Diagramme polaire: stéréo, omnidirectionnel, cardioïde, bidirectionnel - Réponse en fréquence: 20Hz–20kHz - Sensibilité: -36dB (1V/Pa à 1kHz) - Longueur du câble: 3m - Poids: Microphone : 254g - Pied amortisseur : 364g - Total avec cordon USB : 710g - Sortie casque Impédance: 32 Ω - Réponse en fréquence: de 20Hz à 20kHz - Puissance maximale: 7mW - THD: ≤ 0.05% (1kHz/0dBFS) - SNR: ≥ 90dB (1kHZ, RL=∞)");
            prix.setText("589,000 TND");
            img.setImageResource(R.drawable.microphones);
        }
        else {
            name.setText("Webcam Logitech HD Pro Webcam C920 Refresh");
            desc.setText("DIMENSIONS Hauteur x Largeur x Épaisseur: 29 mm x 94 mm x 24 mm - Longueur du câble: 1,5 m - Hauteur x Largeur x Épaisseur: 43,3 mm x 94 mm x 71 mm - CARACTÉRISTIQUES TECHNIQUES Résolution max: 1080p/30 ips - 720p/30 ips - Type de mise au point: mise au point automatique - Microphone intégré: stéréo - Clip universel pour ordinateurs portables et écrans LCD et CRT adaptable aux trépieds ");
            prix.setText("379,000 TND");
            img.setImageResource(R.drawable.webcam);
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
                Intent a=new Intent(AccessoiresActivity.this,RechercheActivity.class);
                startActivity(a);
                break;}
            case R.id.it2:{
                Intent b=new Intent(AccessoiresActivity.this,RechercheActivity.class);
                startActivity(b);
                break;}

        }
        return super.onOptionsItemSelected(item);
    }


}