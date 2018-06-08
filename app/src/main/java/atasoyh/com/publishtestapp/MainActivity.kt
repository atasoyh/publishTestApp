package atasoyh.com.publishtestapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import atasoyh.com.testmodule.Logger

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Logger.logv("asd","message")
    }
}
