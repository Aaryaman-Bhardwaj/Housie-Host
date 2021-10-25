package com.aaryaman.housiehost

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.speech.tts.TextToSpeech
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import tambolaRecyclerAdapter
import java.lang.Exception
import java.util.*
import kotlin.concurrent.thread
import kotlin.random.Random

//var arr: Array<TambolaNumber> = arrayOf(TambolaNumber(1), TambolaNumber(2), TambolaNumber(3), TambolaNumber(4), TambolaNumber(5), TambolaNumber(6), TambolaNumber(7), TambolaNumber(8), TambolaNumber(9), TambolaNumber(10), TambolaNumber(11), TambolaNumber(12), TambolaNumber(13), TambolaNumber(14), TambolaNumber(15), TambolaNumber(16), TambolaNumber(17), TambolaNumber(18), TambolaNumber(19), TambolaNumber(20), TambolaNumber(21), TambolaNumber(22), TambolaNumber(23), TambolaNumber(24), TambolaNumber(25), TambolaNumber(26), TambolaNumber(27), TambolaNumber(28), TambolaNumber(29), TambolaNumber(30),
//                                        TambolaNumber(31), TambolaNumber(32), TambolaNumber(33), TambolaNumber(34), TambolaNumber(35), TambolaNumber(36), TambolaNumber(37), TambolaNumber(38), TambolaNumber(39), TambolaNumber(40), TambolaNumber(41), TambolaNumber(42), TambolaNumber(43), TambolaNumber(44), TambolaNumber(45), TambolaNumber(46), TambolaNumber(47), TambolaNumber(48), TambolaNumber(49), TambolaNumber(50), TambolaNumber(51), TambolaNumber(52), TambolaNumber(53), TambolaNumber(54), TambolaNumber(55), TambolaNumber(56), TambolaNumber(57), TambolaNumber(58), TambolaNumber(59), TambolaNumber(60),
//                                        TambolaNumber(61), TambolaNumber(62), TambolaNumber(63), TambolaNumber(64), TambolaNumber(65), TambolaNumber(66), TambolaNumber(67), TambolaNumber(68), TambolaNumber(69), TambolaNumber(70), TambolaNumber(71), TambolaNumber(72), TambolaNumber(73), TambolaNumber(74), TambolaNumber(75), TambolaNumber(76), TambolaNumber(77), TambolaNumber(78), TambolaNumber(79), TambolaNumber(80), TambolaNumber(81), TambolaNumber(82), TambolaNumber(83), TambolaNumber(84), TambolaNumber(85), TambolaNumber(86), TambolaNumber(87), TambolaNumber(88), TambolaNumber(89), TambolaNumber(90))


var arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90)
var arr2 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90)
var tr: Int= 0

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    private var tts: TextToSpeech? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tts = TextToSpeech(this, this)

        reset.setOnClickListener {
            arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90)
            arr2 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90)

            recyycler_view.apply {
                layoutManager = GridLayoutManager(this@MainActivity, 10)
//                addItemDecoration(RvDecor(30))
                adapter = tambolaRecyclerAdapter()
            }

            button.text = ""
        }

        button.setOnClickListener {
            try {
                val n= nextHouseNumber()
                button.text= n.toString()
                tr=n
                arr2[n-1]= 0
                recyycler_view.adapter!!.notifyItemChanged(n-1)
            }
            catch (e: Exception){
                tts!!.speak("House is already filled", TextToSpeech.QUEUE_FLUSH, null, "")
                Log.e("TAG", e.toString())
            }

        }

        recyycler_view.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 10)
//                addItemDecoration(RvDecor(30))
            adapter = tambolaRecyclerAdapter()
        }
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            // set US English as language for tts
            val result = tts!!.setLanguage(Locale.US)

            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS","The Language specified is not supported!")
            }


        }
        else {
            Log.e("TTS", "Initilization Failed!")
        }
    }

    fun remove(arr: IntArray, index: Int): IntArray {
        return if (index < 0 || index >= arr.size) {
            arr
        } else (arr.indices)
                .filter { i: Int -> i != index }
                .map { i: Int -> arr[i] }
                .toIntArray()
    }

    fun nextHouseNumber(): Int{

        var x: Int
        if (arr.size > 5) {

            val index = Random.nextInt(0, arr.size)
            x = arr[index]
            arr2[x-1] = 0
            arr = remove(arr, index)
            tts!!.speak(x.toString(), TextToSpeech.QUEUE_FLUSH, null, "")
            Log.e("TAG", x.toString())

        }
        else {
            x= arr[0]
            arr2[x-1] = 0
            tts!!.speak(arr[0].toString(), TextToSpeech.QUEUE_FLUSH, null, "")
            Log.e("TAG", arr[0].toString())
            arr = remove (arr, 0)

        }

        return x
    }
}