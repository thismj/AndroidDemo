package cn.thismj.android.demo.lifecycle

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

/**
 * @author aero.tang
 * @since 2020/12/8 20:19
 */
class MySavedStateViewModel(savedStateHandle: SavedStateHandle) : ViewModel() {
    val nameLiveData = savedStateHandle.getLiveData<String>("key")
    val ageLiveData = MutableLiveData<Int>()
}