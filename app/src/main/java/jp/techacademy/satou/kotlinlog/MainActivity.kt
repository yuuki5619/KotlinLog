package jp.techacademy.satou.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val human = Human("佐藤", 26, "Kotlin")
        human.say()

        val humanthink= Human("佐藤",26,"Kotlin")
        humanthink.think()


    }
}