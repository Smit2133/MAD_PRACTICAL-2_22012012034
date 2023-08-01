package com.smitpatel.mad_practical_2_22012012034

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var TAG:String="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        showmsg("onStart is called")

    }

    override fun onResume() {
        super.onResume()
        showmsg("onResume() is called")
    }

    override fun onPause() {
        super.onPause()
        showmsg("onPause() is called")
    }

    override fun onStop() {
        super.onStop()
        showmsg("onStop()  is called")
    }

    override fun onRestart() {
        super.onRestart()
        showmsg("onRestart() is called")

    }

    override fun onDestroy() {
        super.onDestroy()
        showmsg("onRestart() is called")
    }

   fun showmsg(msg:String){
         Log.i(TAG, "$msg ")

       Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
       }

}