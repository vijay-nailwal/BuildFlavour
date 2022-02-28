package com.example.buildflavours

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.buildflavours.util.LogUtil

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogUtil.d("FLAVOR ", BuildConfig.FLAVOR)
        LogUtil.d("TYPE ", BuildConfig.TYPE)
        LogUtil.d("VERSION_NAME", BuildConfig.VERSION_NAME)
        LogUtil.d("DEBUG", BuildConfig.DEBUG.toString())
        LogUtil.d("VERSION_CODE", BuildConfig.VERSION_CODE.toString())
        LogUtil.d("BUILD_TYPE", BuildConfig.BUILD_TYPE)
        LogUtil.d("APPLICATION_ID", BuildConfig.APPLICATION_ID)
    }
}