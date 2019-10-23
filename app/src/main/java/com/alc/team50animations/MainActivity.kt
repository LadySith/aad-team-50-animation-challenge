package com.alc.team50animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.animation.AnimatorInflater
import android.content.Intent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun rotateAnimation(view: View) {

        val rotateAnimator = AnimatorInflater.loadAnimator(this, R.animator.rotate)
        rotateAnimator?.apply {
            setTarget(targetImage)
            start()
        }
    }

    fun startScenario1(view: View) {
        val intent = Intent(this, AnimConstraintActivity::class.java)
        startActivity(intent)
    }

    fun startScenario2(view: View) {
        val intent = Intent(this, BlydeTransitionActivity::class.java)
        startActivity(intent)
    }

    fun startScenario3(view: View) {
        val intent = Intent(this, BlydeTransitionActivity::class.java)
        startActivity(intent)
    }


    fun startScenario4(view: View){
        val intent = Intent(this,TableMountainActivity::class.java)
        startActivity(intent)
    }
}

