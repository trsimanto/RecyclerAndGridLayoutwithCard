package com.example.towhid.recyclerandgridlayoutwithcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookActivity extends AppCompatActivity {

    private TextView tvtitle;
    private TextView tvdiscreption;
    private TextView tvcatagory;
    private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        tvtitle=(TextView)findViewById(R.id.txTitle);
        tvdiscreption=(TextView)findViewById(R.id.txdispription);
        tvcatagory=(TextView)findViewById(R.id.txcatagory);
        img=(ImageView)findViewById(R.id.bookthumbnail);


        //recive data
        Intent intent=getIntent();
        String Title=intent.getExtras().getString("Title");
        String Discription=intent.getExtras().getString("Discription");
        String catagory=intent.getExtras().getString("catagory");
        int image =intent.getExtras().getInt("Thumbnail");

        //settings values

        tvtitle.setText(Title);
        tvdiscreption.setText(Discription);
        tvcatagory.setText(catagory);
        img.setImageResource(image);



    }
}
