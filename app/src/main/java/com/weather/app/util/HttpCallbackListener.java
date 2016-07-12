package com.weather.app.util;

/**
 * Created by Administrator on 2016/7/12.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
