package ru.niceaska.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ImageView;

public class CustomViewAnimationActivity extends AppCompatActivity {

    private ObjectAnimator animator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_view_animation);
        Speedometer speedometer = findViewById(R.id.speedometer);
        animator = ObjectAnimator.ofInt(speedometer, "speed", 0, 406);
        configure(animator);
    }


    private ObjectAnimator configure(ObjectAnimator animator) {
        animator.setDuration(1000);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        return animator;
    }

    @Override
    protected void onStart() {
        super.onStart();
        animator.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        animator.end();
    }
}
