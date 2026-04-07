 package com.mary.chui_wellnessapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        Healthy recipe intent
//        finding the views from the layout using their ids

//        create a variable to store the  buttons
        val recipe=findViewById<Button>(R.id.recipes)

//        set on click listener
        recipe.setOnClickListener {
//            write your intents

            val recipeIntent= Intent(applicationContext,HealthyRecipes::class.java)
            startActivity(recipeIntent)
        }


//       nutrition intent

        val nutrition=findViewById<Button>(R.id.nutrition)
//        set on click listener
        nutrition.setOnClickListener {
            val nutritionIntent= Intent(applicationContext, NutritionAdvice::class.java)
            startActivity(nutritionIntent)
        }


//        meditation intent
        val meditation=findViewById<Button>(R.id.meditation)
        meditation.setOnClickListener {
            val meditationIntent= Intent(applicationContext, Meditation::class.java)
            startActivity(meditationIntent)
        }

//        hydration alert
        val hydration=findViewById<Button>(R.id.hydration)
//        SET ONCLICK LISENER
        hydration.setOnClickListener {
            val hydrationIntent= Intent(applicationContext,HydrationAlert::class.java)
            startActivity(hydrationIntent)
        }

//        start activity intent
        val exercise=findViewById<Button>(R.id.exercise)
        exercise.setOnClickListener {
            val exerciseIntent= Intent(applicationContext, StartExercise::class.java)
            startActivity(exerciseIntent)
        }

//        daily motivation intent
        val motivation=findViewById<Button>(R.id.motivation)
        motivation.setOnClickListener {
            val motivationIntent= Intent(applicationContext,DailyMotivation::class.java)
            startActivity(motivationIntent)
        }

//        weekly goals intent
        val goals=findViewById<Button>(R.id.goals)
        goals.setOnClickListener {
            val goalsIntent= Intent(applicationContext,WeeklyGoals::class.java)
            startActivity(goalsIntent)
        }

//        check progress intent
        val check =findViewById<Button>(R.id.check)
        check.setOnClickListener {
            val checkIntent= Intent(applicationContext,CheckProgress::class.java)
            startActivity(checkIntent)
        }

    }
}