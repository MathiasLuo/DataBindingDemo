package com.mathiasluo.databindingdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.mathiasluo.databindingdemo.databinding.MainActivityBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = getLayoutInflater().inflate(R.layout.activity_main, null);
        setContentView(view);
        //    MainActivityBinding mainBinding  =  DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityBinding mainBinding = MainActivityBinding.bind(view);
        User user = new User("MathiasLuo", "Chiongqing");
        mainBinding.setUser(user);
        mainBinding.setMyHandler(new ViewModel());
        
        mainBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mainBinding.recyclerView.setAdapter(new MyAdapter());
    }
}
