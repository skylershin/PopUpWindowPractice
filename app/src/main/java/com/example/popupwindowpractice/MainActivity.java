package com.example.popupwindowpractice;

import android.support.v4.content.ContextCompat;
import android.support.v4.widget.PopupWindowCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View popUpView = LayoutInflater.from(MainActivity.this).inflate(R.layout.view_pop_up, null);

                PopupWindow popupWindow = new PopupWindow(popUpView,
                        RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
                popupWindow.showAtLocation(popUpView, Gravity.CENTER, 0, 0);

                popupWindow.setBackgroundDrawable(ContextCompat.getDrawable(MainActivity.this, R.drawable.background_gradient));

            }
        });
    }
}
