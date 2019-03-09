package com.example.lesson2002context;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    TextView textMassage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String secondTextLolo = getString(R.string.some_string);
        textMassage = findViewById(R.id.text);

        int id = R.string.some_string;
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.home:
                textMassage.setText(getString(R.string.home_text));
                return true;
            case R.id.search:
                textMassage.setText(getString(R.string.search_text));
                return true;
            case R.id.friends:
                textMassage.setText(getString(R.string.friends_text));
                return true;

        }

        return false;
    }
    @SuppressLint("CommitTranaction")
   protected void addFragment(Integer containerRes,
                               Fragment fragment,
                               boolean addToBackStack,
                               boolean animate) {
        FragmentTransaction transaction = this
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(containerRes, fragment, fragment.getClass().getSimpleName());
        if (addToBackStack) {
            transaction = transaction.addToBackStack(fragment.getClass().getSimpleName());
        }
        if (animate) {
            transaction = transaction.setTransition(
                    FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        }
        transaction.commitAllowingStateLoss();
    }
}
