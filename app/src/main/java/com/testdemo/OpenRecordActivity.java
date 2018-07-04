package com.testdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.testdemo.adapter.OpenRecordAddapter;

public class OpenRecordActivity extends AppCompatActivity {

    private RecyclerView mOpenRecordRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_record);
        initView();

    }

    /**
     * 初始化recyclerview，设置adapter，加载模拟数据
     */
    private void initView() {
        mOpenRecordRv = (RecyclerView) findViewById(R.id.open_record_rv);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mOpenRecordRv.setLayoutManager(manager);
        OpenRecordAddapter addapter = new OpenRecordAddapter();
        mOpenRecordRv.setAdapter(addapter);
        addapter.setDate(new OpenRecordModel().getData());
    }
}
