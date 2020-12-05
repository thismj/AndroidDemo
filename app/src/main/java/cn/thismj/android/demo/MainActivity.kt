package cn.thismj.android.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import cn.thismj.android.demo.lifecycle.MyLifecycleObserver
import cn.thismj.android.demo.lifecycle.MyLifecycleOwner
import cn.thismj.android.demo.lifecycle.MyViewModel

class MainActivity : AppCompatActivity() {
    private val lifecycleOwner = MyLifecycleOwner()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(MyLifecycleObserver())

        val ViewModel = ViewModelProvider(this).get<MyViewModel>()
        val ViewModel = ViewModelProvider(this).get("",MyViewModel::class.java)
    }

    override fun onStart() {
        super.onStart()
        lifecycleOwner.onStart()
    }

    override fun onResume() {
        super.onResume()
        lifecycleOwner.onResume()
    }

    override fun onPause() {
        super.onPause()
        lifecycleOwner.onPause()
    }

    override fun onStop() {
        super.onStop()
        lifecycleOwner.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        lifecycleOwner.onDestroy()
    }
}