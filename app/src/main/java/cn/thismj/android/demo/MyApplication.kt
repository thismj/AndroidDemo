package cn.thismj.android.demo

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner
import cn.thismj.android.demo.lifecycle.MyProcessObserver

/**
 * @author aero.tang
 * @since 2020/12/8 10:00
 */
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        ProcessLifecycleOwner.get().lifecycle.addObserver(MyProcessObserver())
    }
}