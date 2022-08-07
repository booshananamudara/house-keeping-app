package com.example.homekeeping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private Button findHouseKeeperButton;
    private Button beHouseKeeperButton;
    private Button loginButton;
    private TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Find House Keeper button click function start
        findHouseKeeperButton = (Button)findViewById(R.id.findButton);
        findHouseKeeperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityFindHouseKeeper();
            }
        });
        //Find House Keeper button click function end

        //signup text function start
        signup = (TextView)findViewById(R.id.home_sign_button);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitySignup();
            }
        });
        //signup text function end

        //login button function start
        loginButton = (Button)findViewById(R.id.homelogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityLogin();
            }
        });
        //login button function end

        //beHouseKeeper Button function start
        beHouseKeeperButton = (Button)findViewById(R.id.beButton);
        beHouseKeeperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityBeHouseKeeper();
            }
        });
        //beHouseKeeper Button function end
    }

    private void openActivityBeHouseKeeper() {
        Intent intent = new Intent(this,BeHouseKeeper.class);
        startActivity(intent);
    }

    private void openActivityLogin() {
        Intent intent = new Intent(this,LoginPage.class);
        startActivity(intent);
    }

    private void openActivitySignup() {
        Intent intent = new Intent(this,SignUpPage.class);
        startActivity(intent);
    }

    public void openActivityFindHouseKeeper() {
        Intent intent = new Intent(this,FindHouseKeeper.class);
        startActivity(intent);

    }


}