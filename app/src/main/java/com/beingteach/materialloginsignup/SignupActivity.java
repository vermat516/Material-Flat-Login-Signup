package com.beingteach.materialloginsignup;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

public class SignupActivity extends AppCompatActivity {

    TextView tvAlreadyUser;
    ScrollView svSignup;
    String text = "<font color=#CC000000>Already a user? </font> <font color=#9CCC65>Signin.</font>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        tvAlreadyUser = (TextView) findViewById(R.id.tvAlreadyUser);
        svSignup = (ScrollView) findViewById(R.id.svSignup);
        OverScrollDecoratorHelper.setUpOverScroll(svSignup);
        tvAlreadyUser.setText(Html.fromHtml(text));
        tvAlreadyUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    finishAfterTransition();
                }
            }
        });
    }
}
