package com.example.jokerandroidlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ricardo.nakayama on 12/21/2017.
 */

public class JokerActivity extends AppCompatActivity{
    public static final String EXTRA_JOKER = "EXTRA_JOKER";
    private TextView mTVJoker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joker);
        mTVJoker = (TextView) findViewById(R.id.ac_main_tv_joker);

        if (getIntent().hasExtra(EXTRA_JOKER)) {
            mTVJoker.setText(getIntent().getStringExtra(EXTRA_JOKER));
        }
    }
}
