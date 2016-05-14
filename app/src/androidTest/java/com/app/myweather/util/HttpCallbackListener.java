package com.app.myweather.util;

/**
 * Created by Administrator on 2016/5/14.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
