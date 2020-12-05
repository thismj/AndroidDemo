package cn.thismj.android.demo.lifecycle

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import androidx.lifecycle.ViewModelProvider

/**
 * @author aero.tang
 * @since 2020/12/2 10:19
 */
class MyLifecycleOwner : LifecycleOwner {

    private val lifecycle: LifecycleRegistry = LifecycleRegistry(this)

    override fun getLifecycle(): Lifecycle {
        return lifecycle
    }

    fun onCreate() {
        lifecycle.currentState = Lifecycle.State.CREATED
    }

    fun onStart() {
        lifecycle.currentState = Lifecycle.State.STARTED
    }

    fun onResume() {
        lifecycle.currentState = Lifecycle.State.RESUMED
    }

    fun onPause() {
        lifecycle.currentState = Lifecycle.State.STARTED
    }

    fun onStop() {
        lifecycle.currentState = Lifecycle.State.CREATED
    }

    fun onDestroy() {
        lifecycle.currentState = Lifecycle.State.DESTROYED
    }
}