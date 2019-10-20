package ru.niceaska.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.zip.Inflater;

public class ObjectAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animation);

        ImageView imageView = findViewById(R.id.obj);
        ObjectAnimator scaleXanimator = ObjectAnimator.ofFloat(imageView, "scaleX", 0.5f, 1f);
        ObjectAnimator scaleYanimator = ObjectAnimator.ofFloat(imageView, "scaleY", 0.5f, 1f);
        configure(scaleXanimator).start();
        configure(scaleYanimator).start();

    }


    private ObjectAnimator configure(ObjectAnimator animator) {
        animator.setDuration(1000);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        return animator;
    }
}
