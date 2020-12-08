package cn.thismj.android.demo.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import cn.thismj.android.demo.R
import kotlinx.android.synthetic.main.activity_a.*

class AActivity : LifeCycleActivity("A") {
    private val lifecycleOwner = MyLifecycleOwner()
    private val observer = MyLifecycleObserver()
    private val java8Observer = MyJava8LifecycleObserver()
    private val viewModel by lazy {
        ViewModelProvider(this).get<MyViewModel>()
    }
    private val savedStateViewModel by lazy {
        ViewModelProvider(this).get<MySavedStateViewModel>()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        lifecycle.addObserver(observer)
        lifecycle.addObserver(java8Observer)

        lifecycleOwner.onCreate()
        lifecycleOwner.lifecycle.addObserver(observer)

        viewModel.myLiveData.observe(this) {
            Log.d(TAG, "observer $it")
        }
        savedStateViewModel.nameLiveData.observe(this) {

        }
        savedStateViewModel.ageLiveData.observe(this) {

        }

        btn.setOnClickListener {
            val intent = Intent(this, BActivity::class.java)
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }
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