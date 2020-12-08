package cn.thismj.android.demo.lifecycle

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.lifecycle.ComputableLiveData
import cn.thismj.android.demo.R

/**
 * @author aero.tang
 * @since 2020/12/8 10:38
 */
@SuppressLint("RestrictedApi")
class MyComputableLiveData(private val context: Context) : ComputableLiveData<Bitmap>() {
    override fun compute(): Bitmap {
        return BitmapFactory.decodeResource(context.resources, R.mipmap.ic_launcher)
    }
}