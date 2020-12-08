package cn.thismj.android.demo.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

/**
 * 测试生命周期
 *
 * @author aero.tang
 * @since 2020/11/13 10:45
 */
open class LifeCycleActivity(private val name: String) : AppCompatActivity() {
    companion object {
        internal const val TAG = "LifeCycle"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "$name onCreate")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d(TAG, "$name onNewIntent $intent")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "$name onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "$name onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "$name onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "$name onPause")
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        Log.d(TAG, "$name onWindowFocusChanged hasFocus=$hasFocus")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "$name onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "$name onDestroy")
    }
}