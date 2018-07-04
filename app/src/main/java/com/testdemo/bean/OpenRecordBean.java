package com.testdemo.bean;

import java.util.List;

/**
 * Author:wang_sir
 * Time:2018/7/4 18:24
 * Description:This is OpenRecordBean
 */
public class OpenRecordBean {


    /**
     * code : 1000
     * data : [{"dateTitle":"2018-06-14","logDOList":[{"cellId":0,"deviceName":"东大门1","deviceType":0,"fullName":"张三1","ghsUserId":0,"id":0,"openState":0,"openType":1,"roomId":0,"updateTime":"10:22","villageId":0},{"cellId":0,"deviceName":"东大门2","deviceType":0,"fullName":"张三2","ghsUserId":0,"id":0,"openState":0,"openType":2,"roomId":0,"updateTime":"10:22","villageId":0},{"cellId":0,"deviceName":"东大门3","deviceType":0,"fullName":"张三3","ghsUserId":0,"id":0,"openState":0,"openType":3,"roomId":0,"updateTime":"10:22","villageId":0}]},{"dateTitle":"2018-06-10","logDOList":[{"cellId":0,"deviceName":"南大门1","deviceType":0,"fullName":"李四1","ghsUserId":0,"id":0,"openState":0,"openType":1,"roomId":0,"updateTime":"10:22","villageId":0},{"cellId":0,"deviceName":"南大门2","deviceType":0,"fullName":"李四2","ghsUserId":0,"id":0,"openState":0,"openType":2,"roomId":0,"updateTime":"10:22","villageId":0},{"cellId":0,"deviceName":"南大门3","deviceType":0,"fullName":"李四3","ghsUserId":0,"id":0,"openState":0,"openType":3,"roomId":0,"updateTime":"10:22","villageId":0}]}]
     * message : 成功
     */

    private int code;
    private String message;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * dateTitle : 2018-06-14
         * logDOList : [{"cellId":0,"deviceName":"东大门1","deviceType":0,"fullName":"张三1","ghsUserId":0,"id":0,"openState":0,"openType":1,"roomId":0,"updateTime":"10:22","villageId":0},{"cellId":0,"deviceName":"东大门2","deviceType":0,"fullName":"张三2","ghsUserId":0,"id":0,"openState":0,"openType":2,"roomId":0,"updateTime":"10:22","villageId":0},{"cellId":0,"deviceName":"东大门3","deviceType":0,"fullName":"张三3","ghsUserId":0,"id":0,"openState":0,"openType":3,"roomId":0,"updateTime":"10:22","villageId":0}]
         */

        private String dateTitle;
        private List<LogDOListBean> logDOList;

        public String getDateTitle() {
            return dateTitle;
        }

        public void setDateTitle(String dateTitle) {
            this.dateTitle = dateTitle;
        }

        public List<LogDOListBean> getLogDOList() {
            return logDOList;
        }

        public void setLogDOList(List<LogDOListBean> logDOList) {
            this.logDOList = logDOList;
        }

        public static class LogDOListBean {
            /**
             * cellId : 0
             * deviceName : 东大门1
             * deviceType : 0
             * fullName : 张三1
             * ghsUserId : 0
             * id : 0
             * openState : 0
             * openType : 1
             * roomId : 0
             * updateTime : 10:22
             * villageId : 0
             */

            private int cellId;
            private String deviceName;
            private int deviceType;
            private String fullName;
            private int ghsUserId;
            private int id;
            private int openState;
            private int openType;
            private int roomId;
            private String updateTime;
            private int villageId;

            public int getCellId() {
                return cellId;
            }

            public void setCellId(int cellId) {
                this.cellId = cellId;
            }

            public String getDeviceName() {
                return deviceName;
            }

            public void setDeviceName(String deviceName) {
                this.deviceName = deviceName;
            }

            public int getDeviceType() {
                return deviceType;
            }

            public void setDeviceType(int deviceType) {
                this.deviceType = deviceType;
            }

            public String getFullName() {
                return fullName;
            }

            public void setFullName(String fullName) {
                this.fullName = fullName;
            }

            public int getGhsUserId() {
                return ghsUserId;
            }

            public void setGhsUserId(int ghsUserId) {
                this.ghsUserId = ghsUserId;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getOpenState() {
                return openState;
            }

            public void setOpenState(int openState) {
                this.openState = openState;
            }

            public int getOpenType() {
                return openType;
            }

            public void setOpenType(int openType) {
                this.openType = openType;
            }

            public int getRoomId() {
                return roomId;
            }

            public void setRoomId(int roomId) {
                this.roomId = roomId;
            }

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public int getVillageId() {
                return villageId;
            }

            public void setVillageId(int villageId) {
                this.villageId = villageId;
            }
        }
    }
}
