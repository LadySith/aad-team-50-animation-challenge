package com.moeketsi.androidanimationsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.*
import android.view.View
import android.view.animation.LinearInterpolator
import android.view.animation.ScaleAnimation
import kotlinx.android.synthetic.main.activity_main.*
import android.R.attr.visible
import android.R.id.text2
import android.content.Intent
import android.transition.TransitionManager
import androidx.interpolator.view.animation.FastOutLinearInInterpolator
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator
import android.transition.Fade
import android.transition.TransitionSet
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.Gravity
import android.view.animation.OvershootInterpolator
import android.widget.Button


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.es_button)
        button.setOnClickListener {
            openBlydeActivity()
        }

    }



}
