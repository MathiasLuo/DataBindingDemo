package com.mathiasluo.databindingdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by MathiasLuo on 2016/3/11.
 */
public class MyAdapter extends RecyclerView.Adapter<BindingHolder> {


    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //装逼写法
        View view = ((LayoutInflater) parent
                .getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE)
        ).inflate(R.layout.re_item, parent, false);
        return new BindingHolder(view);
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        holder.getBinding().setVariable(com.mathiasluo.databindingdemo.BR.data, new User("LuoWUixa", "Congqing"));
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return 100;
    }


}
