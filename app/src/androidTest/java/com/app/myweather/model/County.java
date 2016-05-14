package com.app.myweather.model;

/**
 * Created by Administrator on 2016/5/13.
 */
public class County {
    private int id;
    private String countyName;
    private String countyCode;
    private int cityId;
    private int getId(){
        return id;
    }
    public   void setId(int id){
        this.id=id;
    }
    public   String getCountyName(){
        return countyName=countyName;
    }
    private  void setCountyName(String countyName){
        this.countyName=countyName;
    }
    public  String getCountyCode(){
        return countyCode;
    }
    public void setCountyCode(String countyCode){
        this.countyCode=countyCode;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId=cityId;
    }



}
