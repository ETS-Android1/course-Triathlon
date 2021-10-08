package com.example.triathlonapp;

 import android.content.Intent;
 import android.net.Uri;
 import android.os.Bundle;
 import android.view.MenuItem;
 import android.view.View;
import android.view.Menu;

import com.google.android.material.bottomnavigation.BottomNavigationView;
 import com.google.android.material.navigation.NavigationView;

 import androidx.annotation.NonNull;
 import androidx.core.view.GravityCompat;
 import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home,R.id.nav_admin)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        BottomNavigationView bottom_nav_view= findViewById(R.id.bottom_nav_view);
        NavigationUI.setupWithNavController(bottom_nav_view , navController);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
    public  void  inscription(View view)
    {
        Intent it=new Intent(this , InscriptionMain.class )  ;
        startActivity(it);
    }



 /*   public boolean onNavigationItemSelected(MenuItem item) {

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);

        int id = item.getItemId();
        Bundle bundle = new Bundle();

        if (id == R.id.fb1) {
            bundle.putString("url", "https://www.facebook.com/androidhungerAH");

        } else if (id == R.id.insta) {
            bundle.putString("url", "https://www.facebook.com/androidhungerAH");}

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;

    }*/


   /* public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.fb1:
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.facebook.com/C4utcho"));
                startActivity(i);
                break;
            case R.id.insta:
                Intent il = new Intent(Intent.ACTION_VIEW);
                il.setData(Uri.parse("https://www.instagram.com/"));
                startActivity(il);
                break;
        }
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }*/

   /* public  void  LoginAdmin(View view)
    {

        Intent it=new Intent(this , LoginAdmin.class )  ;
        startActivity(it);
    }*/
}