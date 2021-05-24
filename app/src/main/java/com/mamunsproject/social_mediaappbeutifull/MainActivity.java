package com.mamunsproject.social_mediaappbeutifull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.Notification;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import com.iammert.library.readablebottombar.ReadableBottomBar;
import com.mamunsproject.social_mediaappbeutifull.Fragment.AddFragment;
import com.mamunsproject.social_mediaappbeutifull.Fragment.HomeFragment;
import com.mamunsproject.social_mediaappbeutifull.Fragment.NoificationFragment;
import com.mamunsproject.social_mediaappbeutifull.Fragment.ProfileFragment;
import com.mamunsproject.social_mediaappbeutifull.Fragment.SearchFragment;
import com.mamunsproject.social_mediaappbeutifull.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        setSupportActionBar(binding.toolbar);
        MainActivity.this.setTitle("My Profile");

        binding.toolbar.setVisibility(View.GONE);
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container,new HomeFragment());
        transaction.commit();



        binding.readableBottomBar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
            @Override
            public void onItemSelected(int i) {

                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();

                switch (i){

                    case 0:

                        transaction.replace(R.id.fragment_container,new HomeFragment()  );
                        binding.toolbar.setVisibility(View.GONE);

                        break;

                    case 1:
                        transaction.replace(R.id.fragment_container,new NoificationFragment());
                        binding.toolbar.setVisibility(View.GONE);

                        break;


                    case 2:
                        transaction.replace(R.id.fragment_container,new AddFragment()  );
                        binding.toolbar.setVisibility(View.GONE);

                        break;

                    case 3:
                        transaction.replace(R.id.fragment_container,new SearchFragment()  );
                        binding.toolbar.setVisibility(View.GONE);

                        break;

                    case 4:
                        transaction.replace(R.id.fragment_container,new ProfileFragment()  );
                        binding.toolbar.setVisibility(View.VISIBLE);

                        break;

                }

                transaction.commit();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_item,menu);


        return true;
    }
}