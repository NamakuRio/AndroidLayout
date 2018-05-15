package com.qtaplus.androidlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv_goride, iv_gofood, iv_gomart, iv_gosend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_goride = (ImageView) findViewById(R.id.iv_goride);
        iv_gomart = (ImageView) findViewById(R.id.iv_gomart);
        iv_gofood = (ImageView) findViewById(R.id.iv_gofood);
        iv_gosend = (ImageView) findViewById(R.id.iv_gosend);

        iv_goride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this
                        , GorideActivity.class);
                startActivity(intent);
            }
        });

    }
}
