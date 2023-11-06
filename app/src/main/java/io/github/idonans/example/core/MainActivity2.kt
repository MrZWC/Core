package io.github.idonans.example.core

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import io.github.idonans.core.util.ProcessUtil
import io.github.idonans.core.util.ProcessUtil.getCurrentProcessNameByActivityThread

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findViewById<View>(R.id.edit).setOnClickListener {
            val processName = ProcessUtil.getCurrentProcessName(this)
            Log.i("mainactivity2", processName!!)
        }
    }
}