package sg.edu.rp.c346.p13problemstatement

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val arrayList = ArrayList<Double>()
    var op = ""
    var number = 0.0
    var firstno = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonequals.setOnClickListener {

        if(arrayList.count() <3){
            if(op == "/"){
                firstno = arrayList.get(0)/arrayList.get(1)
            }else if(op == "*"){
                firstno = arrayList.get(0)*arrayList.get(1)
            }else if(op == "-"){
                firstno = arrayList.get(0)-arrayList.get(1)
            }else{
                firstno = arrayList.get(0)+arrayList.get(1)
            }

        }else{
                if(op == "/"){
                    firstno = firstno/arrayList.get(arrayList.count()-1)
                }else if(op == "*"){
                    firstno = firstno*arrayList.get(arrayList.count()-1)
                }else if(op == "-"){
                    firstno = firstno-arrayList.get(arrayList.count()-1)
                }else if (op == "+"){
                    firstno = firstno+arrayList.get(arrayList.count()-1)
                }

        }
            textView.text=firstno.toString()
        }


        buttonAC.setOnClickListener {
            arrayList.clear()
            textView.text = "0"
        }

    }
    fun btnOnnumber(view: View){

        val btnSelected = view as Button
        when(btnSelected.id) {
            button0.id -> number =  0.0
            button1.id -> number =  1.0
            button2.id -> number =  2.0
            button3.id -> number = 3.0
            button4.id -> number =   4.0
            button5.id -> number = 5.0
            button6.id -> number =  6.0
            button7.id -> number =  7.0
            button8.id -> number = 8.0
            button9.id -> number =  9.0

        }
        textView.text=number.toString()
        arrayList.add(number)
    }
    fun btnOnop(view: View){

        val btnSelected = view as Button
        when(btnSelected.id) {
            buttonSlash.id -> op = "/"
            buttontimes.id -> op = "*"
            buttonminus.id -> op = "-"
            buttonplus.id -> op = "+"
        }

    }



}
