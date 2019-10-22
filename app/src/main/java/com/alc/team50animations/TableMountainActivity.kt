package com.alc.team50animations

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class TableMountainActivity : AppCompatActivity() {

    lateinit var tableMountainAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table_mountain)


    }

    override fun onStart() {
        super.onStart()

        targetImage.setBackgroundResource(R.drawable.table_mountain_list)
        tableMountainAnimation = targetImage.background as AnimationDrawable
        tableMountainAnimation.start()
    }

    //Button Click event handler
    fun startStopAnimation(view: View){
        if(tableMountainAnimation.isRunning)
            tableMountainAnimation.stop()
        else
            tableMountainAnimation.start()
    }

}
