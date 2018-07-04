package com.testdemo;

import com.testdemo.bean.OpenRecordBean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Author:wang_sir
 * Time:2018/7/4 20:02
 * Description:This is OpenRecordModel
 */
public class OpenRecordModel {
    public OpenRecordModel() {

    }

    public  List<Object> getData() {
        //模拟一组数据
        OpenRecordBean bean = new OpenRecordBean();
        bean.setCode(1000);
        bean.setMessage("成功");
        bean.setData(getDateBeans());
        return sortData(bean);
    }

    /**
     * 重新整理数据
     *
     * @param bean
     */
    private List<Object> sortData(OpenRecordBean bean) {
        List<OpenRecordBean.DataBean> arrays = bean.getData();
        List<Object> arrays_obj = new ArrayList<>();
        for (OpenRecordBean.DataBean array : arrays) {
            List<OpenRecordBean.DataBean.LogDOListBean> logs = array.getLogDOList();
            arrays_obj.add(array.getDateTitle());
            if (logs != null && logs.size() > 0) {
                for (OpenRecordBean.DataBean.LogDOListBean log : logs) {
                    arrays_obj.add(log);
                }
            }
        }

        return arrays_obj;
    }

    private List<OpenRecordBean.DataBean> getDateBeans() {
        List<OpenRecordBean.DataBean> dataBeans = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH) + 1;
            int day = calendar.get(Calendar.DATE);
            day += i;
            OpenRecordBean.DataBean dataBean = new OpenRecordBean.DataBean();
            dataBean.setDateTitle(String.valueOf(year) + "-" + String.valueOf(month) + "-" + String.valueOf(day));
            dataBean.setLogDOList(getLogLists(i+1));
            dataBeans.add(dataBean);
        }


        return dataBeans;
    }

    private List<OpenRecordBean.DataBean.LogDOListBean> getLogLists(int size) {
        List<OpenRecordBean.DataBean.LogDOListBean> logs = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            OpenRecordBean.DataBean.LogDOListBean logDOListBean = new OpenRecordBean.DataBean.LogDOListBean();
            int a = i + 1;
            logDOListBean.setUpdateTime("10:22");
            logDOListBean.setDeviceName("东大门" + a);
            logDOListBean.setOpenType(a);
            logDOListBean.setFullName("张三" + a);
            logs.add(logDOListBean);
        }
        return logs;
    }


}
