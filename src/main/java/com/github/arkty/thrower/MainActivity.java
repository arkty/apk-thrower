package com.github.arkty.thrower;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView label = new TextView(this);
        label.setTextSize(48f);
        label.setTextColor(Color.BLACK);
        label.setGravity(Gravity.CENTER);
        label.setTypeface(null, Typeface.BOLD);

        FrameLayout f = new FrameLayout(this);
        label.setText(BuildConfig.VERSION_NAME + "\n(" + BuildConfig.VERSION_CODE + ")");
        f.addView(label, new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT, Gravity.CENTER
        ));
        setContentView(f);
    }
}