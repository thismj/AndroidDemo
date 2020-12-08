package cn.thismj.android.demo.lifecycle

import android.app.Application
import androidx.annotation.StringRes
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * ViewModel Demo
 *
 * @author aero.tang
 * @since 2020/12/4 20:30
 */
class MyViewModel : ViewModel() {
    val myLiveData: MutableLiveData<Int> = MutableLiveData()

    init {
        myLiveData.value = 520
    }
}

class MyAndroidViewModel(application: Application): AndroidViewModel(application) {

}