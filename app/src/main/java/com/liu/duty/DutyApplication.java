package com.liu.duty;

import android.app.Application;

import org.litepal.LitePal;

/**
 * @author liuzhenrong@huobi.com
 * @date 2018/7/21 下午5:50
 * @desc
 */
public class DutyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
