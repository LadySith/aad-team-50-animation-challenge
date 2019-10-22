package com.moeketsi.androidanimationsproject

import android.os.Bundle
import android.transition.*
import android.view.Gravity
import android.view.View
import android.view.animation.OvershootInterpolator
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.transitions_combined_layout.*

class BlydeTransitionActivity : AppCompatActivity() {
    private lateinit var scene1: Scene
    private lateinit var scene2: Scene
    private lateinit var currentScene: Scene
    private lateinit var transitionSet: TransitionSet

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.transitions_combined_layout)

        scene1 = Scene.getSceneForLayout(sceneRoot, R.layout.blyde_activity_one, this)
        scene2 = Scene.getSceneForLayout(sceneRoot, R.layout.blyde_activity_two, this)

        val explodeTransition = Explode()
        explodeTransition.duration = 500
        explodeTransition.interpolator = OvershootInterpolator()

        val slideInTransition = Slide(Gravity.RIGHT)
        slideInTransition.duration = 250
        slideInTransition.startDelay = 400
        slideInTransition.addTarget(R.id.blyde_content)
        slideInTransition.addTarget(R.id.blyde_info)

        val slideOutTransition = Slide(Gravity.LEFT)
        slideOutTransition.duration = 250
        slideOutTransition.addTarget(R.id.blyde_content)
        slideOutTransition.addTarget(R.id.blyde_info)

        transitionSet = TransitionSet()
        transitionSet.ordering = TransitionSet.ORDERING_SEQUENTIAL

        transitionSet.addTransition(explodeTransition)
        transitionSet.addTransition(slideInTransition)
        transitionSet.addTransition(slideOutTransition)

        scene1.enter()
        currentScene = scene1
    }

    fun onClick(view: View) {

        currentScene = if (currentScene === scene1) {
            TransitionManager.go(scene2, transitionSet)
            scene2
        } else {
            TransitionManager.go(scene1, transitionSet)
            scene1
        }

    }

}