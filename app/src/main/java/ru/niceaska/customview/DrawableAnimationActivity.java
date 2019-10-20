package ru.niceaska.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DrawableAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable);

        final ImageView imageView = findViewById(R.id.image_view);
        imageView.post(new Runnable() {
            @Override
            public void run() {
                ((AnimationDrawable) imageView.getDrawable()).start();
            }
        });
    }
}
