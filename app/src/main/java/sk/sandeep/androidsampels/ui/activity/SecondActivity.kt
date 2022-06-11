package sk.sandeep.androidsampels.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import sk.sandeep.androidsampels.R
import sk.sandeep.androidsampels.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)

        //TODO: Get data from main activity
        val name =intent.getStringExtra("name")
        "get data from Main:: $name".also { binding.textView2.text = it }

        binding.btnGoToMain.setOnClickListener {
            val intent1 = Intent(this, MainActivity::class.java)
            startActivity(intent1)
        }

        binding.btnGoToThird.setOnClickListener {
            val intent2 = Intent(this, ThirdActivity::class.java)
            startActivity(intent2)
        }

        Log.d("TAG", "SecondActivity: onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TAG", "SecondActivity: onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "SecondActivity: onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "SecondActivity: onResume ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "SecondActivity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "SecondActivity: onDestroy")
    }
}