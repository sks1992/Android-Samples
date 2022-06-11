package sk.sandeep.androidsampels.ui.activity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import sk.sandeep.androidsampels.R

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        Log.d("TAG", "ThirdActivity: onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "ThirdActivity: onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "ThirdActivity: onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "ThirdActivity: onResume ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "ThirdActivity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "ThirdActivity: onDestroy")
    }
}