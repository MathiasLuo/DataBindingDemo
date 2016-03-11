package com.mathiasluo.databindingdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.mathiasluo.databindingdemo.databinding.ReItemBinding;

/**
 * Created by MathiasLuo on 2016/3/11.
 */
public class BindingHolder extends RecyclerView.ViewHolder {


    ReItemBinding binding;
    public BindingHolder(View itemView) {
        super(itemView);
        binding = ReItemBinding.bind(itemView);
    }

    public ReItemBinding getBinding() {
        return binding;
    }
}
