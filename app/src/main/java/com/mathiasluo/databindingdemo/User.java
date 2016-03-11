package com.mathiasluo.databindingdemo;

import android.databinding.BaseObservable;

/**
 * Created by MathiasLuo on 2016/3/11.
 */
public class User extends BaseObservable {

    public final String name;
    public final String adress;

    public User(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
}
