package com.example.anggaa2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

public class OnBoardActivity extends TutorialActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // slide 1
        addFragment(new Step.Builder().setTitle("This is header 1 ")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#171743")) // int background color
                .setDrawable(R.drawable.image1) // int top drawable
                .setSummary("This is summary")
                .build());

        // slide 2
        addFragment(new Step.Builder().setTitle("This is header 2")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#171743")) // int background color
                .setDrawable(R.drawable.image2) // int top drawable
                .setSummary("This is summary")
                .build());

        // slide 3
        addFragment(new Step.Builder().setTitle("This is header 3")
                .setContent("This is content")
                .setBackgroundColor(Color.parseColor("#171743")) // int background color
                .setDrawable(R.drawable.image3) // int top drawable
                .setSummary("This is summary")
                .build());
    }
}
