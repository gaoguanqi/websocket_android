package com.maple.websocket.utils

import android.util.Log
import com.maple.websocket.BuildConfig

class LogUtils {
    companion object {
        @JvmStatic
        fun logGGQ(s: String?) {
            if (BuildConfig.DEBUG) {
                Log.i("GGQ", s)
            }
        }
    }
}