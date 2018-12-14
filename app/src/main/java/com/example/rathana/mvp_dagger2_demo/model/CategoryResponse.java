package com.example.rathana.mvp_dagger2_demo.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public abstract class CategoryResponse {


    @SerializedName("data")
    public List<DataEntity> data;
    @SerializedName("msg")
    public String msg;
    @SerializedName("status")
    public boolean status;
    @SerializedName("code")
    public String code;

    public List<DataEntity> getData() {
        return data;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "CategoryResponse{" +
                "data=" + data +
                ", msg='" + msg + '\'' +
                ", status=" + status +
                ", code='" + code + '\'' +
                '}';
    }

    public static class DataEntity {
        @SerializedName("sub_cate")
        public List<String> subCate;
        @SerializedName("icon_name")
        public String iconName;
        @SerializedName("des")
        public String des;
        @SerializedName("cate_name")
        public String cateName;
        @SerializedName("status")
        public boolean status;
        @SerializedName("id")
        public int id;

        public List<String> getSubCate() {
            return subCate;
        }

        public void setSubCate(List<String> subCate) {
            this.subCate = subCate;
        }

        public String getIconName() {
            return iconName;
        }

        public void setIconName(String iconName) {
            this.iconName = iconName;
        }

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }

        public String getCateName() {
            return cateName;
        }

        public void setCateName(String cateName) {
            this.cateName = cateName;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "DataEntity{" +
                    "subCate=" + subCate +
                    ", iconName='" + iconName + '\'' +
                    ", des='" + des + '\'' +
                    ", cateName='" + cateName + '\'' +
                    ", status=" + status +
                    ", id=" + id +
                    '}';
        }
    }
}
