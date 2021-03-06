package com.example.appnewst3h;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.appnewst3h.fragment.FragmentPage;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    ImageView imageViewBar;
    DrawerLayout drawerLayout;
    NavigationView nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init() {
        imageViewBar = findViewById(R.id.img_bar);
        nav = findViewById(R.id.navigationView);
        drawerLayout = findViewById(R.id.drawable);
        imageViewBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(nav);
            }
        });
        getSupportFragmentManager().beginTransaction()
            .replace(R.id.content_,new FragmentPage()).commit();//phien de tao fragment
    }
}
