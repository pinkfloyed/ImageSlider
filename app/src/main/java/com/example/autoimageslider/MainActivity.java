package com.example.autoimageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int arr[]={R.drawable.africa,R.drawable.fiji,R.drawable.french,R.drawable.greece,R.drawable.iceland,R.drawable.japan,R.drawable.maldives,R.drawable.sajek,R.drawable.seychels,R.drawable.thailand};
        view=(ViewFlipper)findViewById(R.id.flipper);
        for (int i=0;i<arr.length;i++)
        {
            showimage(arr[i]);
        }
    }
    public void showimage(int img)
    {
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(img);

        view.addView(imageView);
        view.setFlipInterval(2000);
        view.setAutoStart(true);

        view.setInAnimation(this,android.R.anim.slide_in_left);
        view.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}