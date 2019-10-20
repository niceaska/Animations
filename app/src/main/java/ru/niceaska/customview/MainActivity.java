package ru.niceaska.customview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        handleClick(R.id.button_anim_drawable, DrawableAnimationActivity.class);
        handleClick(R.id.button_view_anim, ViewAnimationActivity.class);
        handleClick(R.id.button_value_view_anim, ValueAnimationActivity.class);
        handleClick(R.id.button_objact_anim, ObjectAnimationActivity.class);
        handleClick(R.id.button_custom_view_anim, CustomViewAnimationActivity.class);
    }

    private void handleClick(int viewid, final Class <? extends Activity> activityClass) {
        findViewById(viewid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, activityClass));
            }
        });
    }
}
