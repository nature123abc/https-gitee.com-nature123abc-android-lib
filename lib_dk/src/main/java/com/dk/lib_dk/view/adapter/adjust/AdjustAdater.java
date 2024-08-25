package com.dk.lib_dk.view.adapter.adjust;


import android.content.Context;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chad.library.adapter4.BaseQuickAdapter;
import com.chad.library.adapter4.viewholder.QuickViewHolder;
import com.dk.common.DoubleUtils;
import com.dk.lib_dk.R;

/**
 * @ProjectName: ControlPlatform
 * @Desc:
 * @Author: hq
 * @Date: 2023/4/11
 */
public class AdjustAdater extends BaseQuickAdapter<AdjustItem, QuickViewHolder> {


    @Override
    protected void onBindViewHolder(@NonNull QuickViewHolder holder, int i, @Nullable AdjustItem item) {
        ((CheckBox) holder.findView(R.id.cbSelect)).setChecked(item.select);
        ((TextView) holder.findView(R.id.txtName)).setText(item.adjustPoint.name);
        String x = "--";
        String y = "--";
        String z = "--";
        if (null != item.adjustPoint) {
            if (null != item.adjustPoint.deltX)
                x = DoubleUtils.formatStr(item.adjustPoint.deltX * 1000, 2);

            if (null != item.adjustPoint.detlY)
                y = DoubleUtils.formatStr(item.adjustPoint.detlY * 1000, 2);

            if (null != item.adjustPoint.detlZ)
                z = DoubleUtils.formatStr(item.adjustPoint.detlZ * 1000, 2);
        }
        ((CheckBox) holder.findView(R.id.cbSelect)).setOnCheckedChangeListener((buttonView, isChecked) -> item.select = isChecked);
        ((TextView) holder.findView(R.id.txtDetlZ)).setText(z);
        ((TextView) holder.findView(R.id.txtDetlX)).setText(x);
        ((TextView) holder.findView(R.id.txtDetlY)).setText(y);
    }

    @NonNull
    @Override
    protected QuickViewHolder onCreateViewHolder(@NonNull Context context, @NonNull ViewGroup viewGroup, int i) {
        return new QuickViewHolder(com.dk.lib_dk.R.layout.item_adjust_point, viewGroup);
    }
}
