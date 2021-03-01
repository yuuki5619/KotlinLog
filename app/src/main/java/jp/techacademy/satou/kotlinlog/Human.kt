package jp.techacademy.satou.kotlinlog
import android.util.Log
class Human: Animal,Thinkable{
    val hobby:String
    constructor(name: String,age: Int,hobby: String) :super(name,age){
        this.name=name
        this.age=age
        this.hobby=hobby
    }

    override fun say() {
        Log.d("KotlinTest","私の名前は"+this.name+"です。"+"年は"+this.age+"歳です。")
    }

    override fun think() {
        Log.d("KotlinTest","私は"+this.hobby+"について考える。")

    }
}
