package cn.thismj.android.demo.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.thismj.android.demo.R
import kotlinx.android.synthetic.main.activity_a.*

class BActivity : LifeCycleActivity("B") {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        btn.setOnClickListener {
            startActivity(Intent(this, CActivity::class.java))
        }
    }
}