package com.beingteach.materialloginsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import me.everything.android.ui.overscroll.OverScrollDecoratorHelper;

public class LoginActivity extends AppCompatActivity {

    TextView tvNewAccount, tvMobileNumber, tvPassword, tvMain;
    EditText etEmailLogin, etPasswordLogin;
    Button btnSignin;
    LinearLayout llMain;
    ScrollView svLogin;
    ImageView dot;
    String text = "<font color=#CC000000>Not connected with us? </font> <font color=#9CCC65>Join.</font>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvNewAccount = (TextView) findViewById(R.id.tvNewAccount);
        etEmailLogin = (EditText) findViewById(R.id.etEmailLogin);
        etPasswordLogin = (EditText) findViewById(R.id.etPasswordLogin);
        btnSignin = (Button) findViewById(R.id.btnSignin);
        tvMobileNumber = (TextView) findViewById(R.id.tvMobileNumber);
        tvPassword = (TextView) findViewById(R.id.tvPassword);
        svLogin = (ScrollView) findViewById(R.id.svLogin);
        dot = (ImageView) findViewById(R.id.dot);
        tvMain = (TextView) findViewById(R.id.tvMain);
        llMain = (LinearLayout) findViewById(R.id.llMain);
        OverScrollDecoratorHelper.setUpOverScroll(svLogin);
        tvNewAccount.setText(Html.fromHtml(text));

        tvNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pair p1 = Pair.create(etEmailLogin, "etEmailId");
                Pair p2 = Pair.create(etPasswordLogin, "etPassword");
                Pair p3 = Pair.create(btnSignin, "btnSumbit");
                Pair p4 = Pair.create(tvNewAccount, "tvSigninSignup");
                Pair p5 = Pair.create(tvMobileNumber, "tvEmailId");
                Pair p6 = Pair.create(tvPassword, "tvPassword");
                Pair p7 = Pair.create(dot, "dot");
                Pair p8 = Pair.create(tvMain, "tvMain");
                Pair p9 = Pair.create(llMain, "llMain");

                ActivityOptions transitionActivityOptions = null;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(LoginActivity.this, p1, p2, p3, p4, p5, p6, p9);
                }
                startActivity(new Intent(LoginActivity.this, SignupActivity.class), transitionActivityOptions.toBundle());
            }
        });
    }
}
