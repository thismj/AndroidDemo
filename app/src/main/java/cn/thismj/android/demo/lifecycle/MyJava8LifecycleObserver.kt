package cn.thismj.android.demo.lifecycle

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

/**
 * @author aero.tang
 * @since 2020/12/8 18:17
 */
class MyJava8LifecycleObserver : DefaultLifecycleObserver {
    companion object {
        const val TAG = "MyJava8LifecycleObserver"
    }
    
    override fun onCreate(owner: LifecycleOwner) {
        Log.d(TAG, "onCreate")
    }

    override fun onStart(owner: LifecycleOwner) {
        Log.d(TAG, "onStart")
    }

    override fun onResume(owner: LifecycleOwner) {
        Log.d(TAG, "onResume")
    }

    override fun onPause(owner: LifecycleOwner) {
        Log.d(TAG, "onPause")
    }

    override fun onStop(owner: LifecycleOwner) {
        Log.d(TAG, "onStop")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.d(TAG, "onDestroy")
    }
}