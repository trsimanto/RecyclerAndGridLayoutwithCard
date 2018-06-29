package com.example.towhid.recyclerandgridlayoutwithcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Book> lstBook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook= new ArrayList<>();
        lstBook.add(new Book("The Vegitariar","Categories Book","Discription",R.drawable.download));
        lstBook.add(new Book("The KopaSamsu","Categories Book","Discription",R.drawable.download1));
        lstBook.add(new Book("So what","Categories Book","Discription",R.drawable.download2));
        lstBook.add(new Book("K bolse ","Categories Book","Discription",R.drawable.download3));
        lstBook.add(new Book("Aber jegay","Categories Book","Discription",R.drawable.download4));
        lstBook.add(new Book("Tore koese ","Categories Book","Discription",R.drawable.download5));
        lstBook.add(new Book("Mor ga Tue","Categories Book","Discription",R.drawable.download6));
        lstBook.add(new Book("Ok Jaiga","Categories Book","Discription",R.drawable.images));
        lstBook.add(new Book("Bal Bal Bal","Categories Book","Discription",R.drawable.images1));
        lstBook.add(new Book("Bal Bal Bal","Categories Book","Discription",R.drawable.images2));
        lstBook.add(new Book("Bal Bal Bal","Categories Book","Discription",R.drawable.images3));
        lstBook.add(new Book("The KopaSamsu","Categories Book","Discription",R.drawable.download1));
        lstBook.add(new Book("So what","Categories Book","Discription",R.drawable.download2));
        lstBook.add(new Book("K bolse ","Categories Book","Discription",R.drawable.download3));
        lstBook.add(new Book("Aber jegay","Categories Book","Discription",R.drawable.download4));
        lstBook.add(new Book("Tore koese ","Categories Book","Discription",R.drawable.download5));
        lstBook.add(new Book("Mor ga Tue","Categories Book","Discription",R.drawable.download6));
        lstBook.add(new Book("Ok Jaiga","Categories Book","Discription",R.drawable.images));
        lstBook.add(new Book("The KopaSamsu","Categories Book","Discription",R.drawable.download1));
        lstBook.add(new Book("So what","Categories Book","Discription",R.drawable.download2));
        lstBook.add(new Book("K bolse ","Categories Book","Discription",R.drawable.download3));
        lstBook.add(new Book("Aber jegay","Categories Book","Discription",R.drawable.download4));
        lstBook.add(new Book("Tore koese ","Categories Book","Discription",R.drawable.download5));
        lstBook.add(new Book("Mor ga Tue","Categories Book","Discription",R.drawable.download6));
        lstBook.add(new Book("Ok Jaiga","Categories Book","Discription",R.drawable.images));
        lstBook.add(new Book("The KopaSamsu","Categories Book","Discription",R.drawable.download1));
        lstBook.add(new Book("So what","Categories Book","Discription",R.drawable.download2));
        lstBook.add(new Book("K bolse ","Categories Book","Discription",R.drawable.download3));
        lstBook.add(new Book("Aber jegay","Categories Book","Discription",R.drawable.download4));
        lstBook.add(new Book("Tore koese ","Categories Book","Discription",R.drawable.download5));
        lstBook.add(new Book("Mor ga Tue","Categories Book","Discription",R.drawable.download6));
        lstBook.add(new Book("Ok Jaiga","Categories Book","Discription",R.drawable.images));

        RecyclerView myrv=(RecyclerView)findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter=new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}
