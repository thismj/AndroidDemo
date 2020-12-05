package cn.thismj.android.demo.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.thismj.android.demo.R
import kotlinx.android.synthetic.main.activity_a.*

class CActivity : LifeCycleActivity("C") {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        btn.setOnClickListener {
            val intent = Intent(this, AActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            applicationContext.startActivity(intent)
        }
    }
}