package com.example.act_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button zoomIn = (Button) findViewById(R.id.zoomIn);
        Button zoomOut = (Button) findViewById(R.id.zoomOut);
        ImageView aesthetic = (ImageView) findViewById(R.id.aesthetic);
        zoomIn.setOnClickListener(new View.OnClickListener(){
          public void onClick(View v)  {
              float relativeScalex = aesthetic.getScaleX();
              float relativeScaley = aesthetic.getScaleX();
              aesthetic.setScaleX(relativeScalex+1);
              aesthetic.setScaleY(relativeScaley+1);

          }
        });

        zoomOut.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)  {
                float relativeScalex = aesthetic.getScaleX();
                float relativeScaley = aesthetic.getScaleX();
                aesthetic.setScaleX(relativeScalex-1);
                aesthetic.setScaleY(relativeScaley-1);

                if (relativeScalex == 1){
                   relativeScalex = 1;
                   relativeScaley = 1;
                    aesthetic.setScaleX(relativeScalex);
                    aesthetic.setScaleY(relativeScaley);
                    Toast.makeText(getApplicationContext(),"Ya no se puede hacer mas pequeña la imagen",Toast.LENGTH_SHORT).show();


                }
            }
        });
    }
}