package cn.thismj.android.demo.lifecycle

import android.content.Intent
import android.os.Bundle
import cn.thismj.android.demo.R
import kotlinx.android.synthetic.main.activity_a.*

class AActivity : LifeCycleActivity("A") {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        btn.setOnClickListener {
            val intent = Intent(this, BActivity::class.java)
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }
    }
}