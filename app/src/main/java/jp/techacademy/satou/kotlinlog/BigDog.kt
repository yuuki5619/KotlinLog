package jp.techacademy.satou.kotlinlog
import android.util.Log

class BigDog: Dog{
    constructor(name: String, age: Int): super(name,age){
    }
    override fun say(){
        super.say()
        Log.d("KotlinTest","大きな犬です。")
    }
}