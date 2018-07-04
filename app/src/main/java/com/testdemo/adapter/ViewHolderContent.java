package com.testdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.testdemo.R;


/**
 * Author:wang_sir
 * Time:2018/7/4 17:06
 * Description:This is ViewHolderTitle
 */
public class ViewHolderContent extends RecyclerView.ViewHolder {
    ImageView mOpenRecordMarkIv;
    TextView mOpenRecordTimeTv;
    TextView mOpenRecordTerminalTv;
    TextView mOpenRecordNameTv;
    TextView mOpenRecordDoorNOTv;
    public ViewHolderContent(View view) {
        super(view);
        mOpenRecordMarkIv = (ImageView) view.findViewById(R.id.open_record_mark_iv);
        mOpenRecordTimeTv = (TextView) view.findViewById(R.id.open_record_time_tv);
        mOpenRecordTerminalTv = (TextView) view.findViewById(R.id.open_record_terminal_tv);
        mOpenRecordNameTv = (TextView) view.findViewById(R.id.open_record_name_tv);
        mOpenRecordDoorNOTv = (TextView) view.findViewById(R.id.open_record_door_NO_tv);

    }
}
