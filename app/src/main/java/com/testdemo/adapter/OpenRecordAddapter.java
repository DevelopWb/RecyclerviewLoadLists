package com.testdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.testdemo.R;
import com.testdemo.bean.OpenRecordBean;

import java.util.List;


/**
 * Author:wang_sir
 * Time:2018/6/29 11:16
 * Description:This is HomeAddapter
 */

public class OpenRecordAddapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private int ITEM_TITLE = 1;
    private int ITEM_CONTENT = 2;
    private List<Object> objects;

    /**
     * 传入数据
     * @param objects
     */
    public void setDate(List<Object> objects) {
        this.objects = objects;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        RecyclerView.ViewHolder holder = null;
        if (viewType == ITEM_TITLE) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.open_record_title, parent, false);
            holder = new ViewHolderTitle(view);
        } else if (viewType == ITEM_CONTENT) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.open_record_content, parent, false);
            holder = new ViewHolderContent(view);

        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolderTitle) {
            String title = (String) objects.get(position);
            ((ViewHolderTitle) holder).mOpenRecordDateTv.setText(title);
        }else if (holder instanceof ViewHolderContent) {
            OpenRecordBean.DataBean.LogDOListBean bean = (OpenRecordBean.DataBean.LogDOListBean) objects.get(position);

        ((ViewHolderContent) holder).mOpenRecordTimeTv.setText(bean.getUpdateTime());
        ((ViewHolderContent) holder).mOpenRecordDoorNOTv.setText(String.valueOf(bean.getOpenType()));
        ((ViewHolderContent) holder).mOpenRecordNameTv.setText(bean.getFullName());
        ((ViewHolderContent) holder).mOpenRecordTerminalTv.setText(bean.getDeviceName());
        }

    }

    @Override
    public int getItemViewType(int position) {
        if (objects.get(position) instanceof String) {
            return ITEM_TITLE;
        } else if (objects.get(position) instanceof OpenRecordBean.DataBean.LogDOListBean) {
            return ITEM_CONTENT;
        }
        return super.getItemViewType(position);
    }


    @Override
    public int getItemCount() {
        return objects == null ? 0 : objects.size();
    }


}

