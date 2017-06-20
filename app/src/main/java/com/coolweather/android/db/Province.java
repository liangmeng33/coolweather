package com.coolweather.android.db;

/**
 * Created by liangmeng on 2017/6/18.
 */

public class Province {
    private int id;

    private String provinceName;

    private int provinceCode;

    private int getId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

}
