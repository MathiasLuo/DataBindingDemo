package com.mathiasluo.databindingdemo;

import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by MathiasLuo on 2016/3/11.
 */
public class ViewModel {
    ObservableField<String> string = new ObservableField<>();

    public void onClickFriend(View view) {
        Toast.makeText(view.getContext(), "点击了TextView", Toast.LENGTH_SHORT).show();
    }

    public void onClickButton(View view) {
        Toast.makeText(view.getContext(), "点击了Button", Toast.LENGTH_SHORT).show();
        Log.e("sdhklasdfhali", "dkaodfyhasoifhasop");
    }
}
