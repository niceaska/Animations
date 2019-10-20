package ru.niceaska.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ImageView;

public class ValueAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_anim);

        final ImageView imageView = findViewById(R.id.value_scale);

        ValueAnimator alfaAnimator = ValueAnimator.ofFloat(0f, 1f);
        configureAnimaton(alfaAnimator);
        alfaAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                imageView.setAlpha((Float) animation.getAnimatedValue());
            }
        });
        alfaAnimator.start();

        ValueAnimator translationYnimator = ValueAnimator.ofFloat(0f, -100f);
        configureAnimaton(translationYnimator);
        translationYnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                imageView.setTranslationY((Float) animation.getAnimatedValue());
            }
        });
        translationYnimator.start();
    }

    private void configureAnimaton(ValueAnimator animator) {
        animator.setRepeatMode(ValueAnimator.RESTART);
        animator.setRepeatCount(10);
        animator.setDuration(500);
    }
}
