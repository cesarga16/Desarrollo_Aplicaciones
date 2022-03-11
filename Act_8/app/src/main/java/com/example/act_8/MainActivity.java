package com.example.act_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

//public ImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void website(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.amazon.com.mx/Rokinon-FE14M-FX-Fujifilm-X-Mount-Cameras/dp/B00HAF16O2/ref=sr_1_5?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1BDV2OI0QXVXO&keywords=x+mount+lens&qid=1646846101&sprefix=x+mount+len%2Caps%2C94&sr=8-5&ufe=app_do%3Aamzn1.fos.d6a47de5-06cb-4416-9abc-48deac71c815"));
        startActivity(intent);    }
    public void website1(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.amazon.com.mx/Rokinon-Speed-Angle-Fujifilm-Mount/dp/B01M4KMFYX/ref=sr_1_9?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1BDV2OI0QXVXO&keywords=x+mount+lens&qid=1646846101&sprefix=x+mount+len%2Caps%2C94&sr=8-9&ufe=app_do%3Aamzn1.fos.d6a47de5-06cb-4416-9abc-48deac71c815"));
        startActivity(intent);    }
    public void website2(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.amazon.com.mx/Rokinon-Lente-DS50M-C-c%C3%A1mara-Cameras/dp/B00N5TM2FY/ref=sr_1_10?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=37A4PCKQBS3TM&keywords=cine+lens+fujifilm&qid=1646841464&sprefix=cine+lens+fujifilm%2Caps%2C101&sr=8-10&ufe=app_do%3Aamzn1.fos.d6a47de5-06cb-4416-9abc-48deac71c815"));
        startActivity(intent);    }
    public void website3(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.amazon.com.mx/TTArtisan-enfoque-compatible-Fujifilm-X-Mount/dp/B091JYTHKP/ref=sr_1_4?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1BDV2OI0QXVXO&keywords=x+mount+lens&qid=1646846101&sprefix=x+mount+len%2Caps%2C94&sr=8-4&ufe=app_do%3Aamzn1.fos.d6a47de5-06cb-4416-9abc-48deac71c815"));
        startActivity(intent);    }
    public void website4(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.amazon.com.mx/VILTROX-Fujifilm-AF-F1-4-XF/dp/B087G4G7QJ/ref=sr_1_3?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=2BATTDWFCNKKW&keywords=viltrox+33&qid=1646934876&sprefix=viltrox+3%2Caps%2C106&sr=8-3&ufe=app_do%3Aamzn1.fos.d6a47de5-06cb-4416-9abc-48deac71c815"));
        startActivity(intent);    }
}