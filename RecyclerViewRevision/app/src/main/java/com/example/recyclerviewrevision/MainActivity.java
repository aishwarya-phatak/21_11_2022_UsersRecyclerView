package com.example.recyclerviewrevision;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerUsers;
    ArrayList<User> users;
    UsersAdapter usersAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUser();
        initRecylcerView();
    }

    private void initUser(){
        users = new ArrayList<>();
        for(int i=0; i<20;i++){
            users.add(new User(
                    i,
                    R.mipmap.ic_launcher,
                    "User"+i
            ));
        }
    }

    private void initRecylcerView(){
        recyclerUsers = findViewById(R.id.recyclerUsers);
        recyclerUsers.setLayoutManager(new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        ));
        usersAdapter = new UsersAdapter(users);
        recyclerUsers.setAdapter(usersAdapter);
    }
}