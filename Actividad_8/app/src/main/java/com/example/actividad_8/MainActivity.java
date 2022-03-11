package com.example.actividad_8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView mRecyclerView;
    private ListViewAdaptor mAdapter;
    private List<Data> mDataList = new ArrayList<>();

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new ListViewAdaptor(mDataList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setClickable(true);
        prepareList();

    }

    public void prepareList(){
        Data data = new Data("Rokinon DS50M-C Cine DS 50 mm","$10,929.50",R.drawable.rokinon50,"https://www.amazon.com.mx/Rokinon-Lente-DS50M-C-c%C3%A1mara-Cameras/dp/B00N5TM2FY/ref=sr_1_10?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=37A4PCKQBS3TM&keywords=cine+lens+fujifilm&qid=1646841464&sprefix=cine+lens+fujifilm%2Caps%2C101&sr=8-10&ufe=app_do%3Aamzn1.fos.d6a47de5-06cb-4416-9abc-48deac71c815");
        mDataList.add(data);
        data = new Data("TTArtisan F1.4 APS-C de 35 mm","$2,063.72",R.drawable.ttartisan35,"https://www.amazon.com.mx/TTArtisan-enfoque-compatible-Fujifilm-X-Mount/dp/B091JYTHKP/ref=sr_1_4?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1BDV2OI0QXVXO&keywords=x+mount+lens&qid=1646846101&sprefix=x+mount+len%2Caps%2C94&sr=8-4&ufe=app_do%3Aamzn1.fos.d6a47de5-06cb-4416-9abc-48deac71c815");
        mDataList.add(data);
        data = new Data("Rokinon FE14M-FX 14mm F2.8","$8,468.30",R.drawable.rokinon14,"https://www.amazon.com.mx/Rokinon-FE14M-FX-Fujifilm-X-Mount-Cameras/dp/B00HAF16O2/ref=sr_1_5?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1BDV2OI0QXVXO&keywords=x+mount+lens&qid=1646846101&sprefix=x+mount+len%2Caps%2C94&sr=8-5&ufe=app_do%3Aamzn1.fos.d6a47de5-06cb-4416-9abc-48deac71c815");
        mDataList.add(data);
        data = new Data("VILTROX F1.4 STM APS-C ","$6,767.78",R.drawable.viltrox33,"https://www.amazon.com.mx/VILTROX-enfoque-apertura-Fujifilm-X-Mount/dp/B097P98FHH/ref=sr_1_6?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1BDV2OI0QXVXO&keywords=x+mount+lens&qid=1646846101&sprefix=x+mount+len%2Caps%2C94&sr=8-6&ufe=app_do%3Aamzn1.fos.d6a47de5-06cb-4416-9abc-48deac71c815");
        mDataList.add(data);
        data = new Data("Rokinon 35mm F1.2 High Speed ","$8,799.84",R.drawable.rokinon35,"https://www.amazon.com.mx/Rokinon-Speed-Angle-Fujifilm-Mount/dp/B01M4KMFYX/ref=sr_1_9?__mk_es_MX=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=1BDV2OI0QXVXO&keywords=x+mount+lens&qid=1646846101&sprefix=x+mount+len%2Caps%2C94&sr=8-9&ufe=app_do%3Aamzn1.fos.d6a47de5-06cb-4416-9abc-48deac71c815");
        mDataList.add(data);
    }


}