package ru.niceaska.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ImageView;

public class CustomViewAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view_animation);
        Speedometer speedometer = findViewById(R.id.speedometer);
        ObjectAnimator animator = ObjectAnimator.ofInt(speedometer, "speed", 0, 406);
        configure(animator).start();
    }


    private ObjectAnimator configure(ObjectAnimator animator) {
        animator.setDuration(1000);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        return animator;
    }
}
