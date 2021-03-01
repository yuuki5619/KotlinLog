package jp.techacademy.satou.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val dog = Dog("ポチ",3)
        //dog.say()
        //Log.d("KotlinTest","犬の名前は"+dog.name+"です。")
        //Log.d("KotlinTest","犬の年齢は"+dog.age+"です。")

        val dog2 = Dog("ハチ",10)
        dog2.say()
        Log.d("KotlinTest","犬の名前は"+dog2.name+"です。")
        Log.d("KotlinTest","犬の年齢は"+dog2.age+"です。")

        val bigdog = BigDog("ヨーゼフ",15)

        bigdog.say()
        Log.d("KotlinTest","犬の名前は"+bigdog.name+"です。")
        Log.d("KotlinTest","犬の年齢は"+bigdog.age+"です。")

        Log.d("KotlinTest","ログへの出力テスト")

        var num = 10
        Log.d("KotlinTest",Integer.toString(num))

        num = 50
        Log.d("KotlinTest",num.toString())

        val num1 = 10+5-2*4/2
        Log.d("KotlinTest","10+5-2*4/2="+num1)

        val flag1 = true
        val flag2 = false
        Log.d("KotlinTest","flag1 && flag2 = " + (flag1 && flag2))
        Log.d("KotlinTest","flag1 || flag2 = " + (flag1 || flag2))

        val dog = Dog("ポチ",3)
        dog.move()


        val human = Human("佐藤",26,"Kotlin")
        human.say()
        human.think()


        val num2 = 10
        val num3 = 20
        Log.d("KotlinTest","num2 < num = "+ (num2 < num3))


        num = 60
        if ( num >= 90 ) {
            Log.d("KotlinTest", "優")
        }else if ( num >= 75 ) {
            Log.d("Kotlin","良")
        }else if (num >= 60 ) {
            Log.d("KotlinTest","可")
        }else {
            Log.d("KotlinTest","不可")
        }

        val drank = 1
        when (drank) {
            0 -> {
                Log.d("KotlinTest","コーヒーを入れました")
            }
            1 -> Log.d("KotlinTest","!紅茶を注文しました")
            2 -> Log.d("KotlinTest","ミルクを注文しました")
            else -> Log.d("KotlinTest","オーダーミスです")
        }
        for ( i in 1 until 6 ) {
            Log.d("KotlinTest","for文の"+ i + "回目")
        }
         num = 1
        while ( num < 6 ) {
            Log.d("KotlinTest","while文の"+ num + "回目")
            num++
        }
        for ( i in 1..3 ){
            Log.d("KotlinTest","..演算の" + i + "の回")
        }
        for (i in 6 downTo 0 step 2 ) {
            Log.d("KotlinTest","downTo関数の" + i + "の回")
        }

        val points = arrayOf(10,6,15,23,17)

        for ( i in points ){
            Log.d("KotlinTest",i.toString())
        }
        val numA = 100
        val numB = 0
        var ans = 0
        try {
            ans = numA / numB
        } catch (e : Exception) {
            Log.d("KotlinTest", "0で割ろうとしました")
            Log.d("KotlinTest", e.message.toString())
        } finally {
            Log.d("KotlinTest","ans = " + ans.toString())
        }

       // total(50,1000)

       // total(1,1111)
        val t = total(50,1000)
        Log.d("KotlinTest",t.toString())
    }
    //private fun total(first: Int,last: Int){
     //   var sum = 0
       // for (i in first..last){
       //     sum += i
       // }
       // Log.d("KotlinTest",sum.toString())
    //}

    private fun total(first: Int,last: Int): Int{
        var sum = 0
        for  (i in first..last) {
            sum += i
        }
        return sum
    }


}