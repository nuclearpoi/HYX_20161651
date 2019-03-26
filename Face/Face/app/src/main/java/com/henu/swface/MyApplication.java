package com.henu.swface;

import android.app.Application;
import android.util.Log;

import cn.bmob.v3.Bmob;

/**
 */

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		//第一：默认初始化
		Bmob.initialize(this, "23d1d082727721a9af94703f190976eb");
		Log.i("onCreate: ","bmob!!!!");
	}
}
