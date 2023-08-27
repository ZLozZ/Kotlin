package com.example.bai8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(),OnClickListener {
    lateinit var editA: EditText;
    lateinit var editB: EditText;
    lateinit var btnSum: Button;
    lateinit var btnSub: Button;
    lateinit var btnMul: Button;
    lateinit var btnDiv: Button;
    lateinit var btnExit: Button;
    lateinit var textResult: TextView;
    val myClickListener = View.OnClickListener {
        handelDiv();
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bai8)
        editA = findViewById(R.id.soa);
        editB = findViewById(R.id.sob);
        handelSub();
        //Activity is listener
        btnMul = findViewById(R.id.mul);
        btnMul .setOnClickListener(this);
        btnDiv = findViewById(R.id.div);
        btnDiv.setOnClickListener(myClickListener);
    }

    //Onclick In XML
    fun handelSum(view: View) {
        btnSum = findViewById(R.id.sum);
        textResult = findViewById(R.id.text_result);
        val soA = editA.text.toString().toInt();
        val soB = editB.text.toString().toInt();
        val resultSum: Int = soA + soB;
        textResult.text = resultSum.toString();
    }

    //Inline anonymous listener
    public fun handelSub(){
        btnSub = findViewById(R.id.sub);
        textResult = findViewById(R.id.text_result);
        btnSub.setOnClickListener{
            val soA = editA.text.toString().toInt();
            val soB = editB.text.toString().toInt();
            val resultSub: Int = soA - soB;
            textResult.text = resultSub.toString();
        }
    }
    override fun onClick(v: View){
        textResult = findViewById(R.id.text_result);
        btnMul.setOnClickListener(){
            val soA = editA.text.toString().toInt();
            val soB = editB.text.toString().toInt();
            val resultMul: Int = soA*soB;
            textResult.text = resultMul.toString();
        }
    }

    public fun handelDiv(){
        textResult = findViewById(R.id.text_result);
        btnDiv.setOnClickListener(){
            val soA = editA.text.toString().toInt();
            val soB = editB.text.toString().toInt();
            val resultDiv: Double = (soA/soB).toDouble();
            textResult.text = resultDiv.toString();
        }
    }

    //Explicit listener class

//    class MyClickListener2 : View.OnClickListener, AppCompatActivity() {
//        override fun onClick(v: View?) {//co thể null hoặc không
//            ucln()
//        }

//        public fun ucln() {
//            var editA = findViewById(R.id.soa);
//            var editB = findViewById(R.id.sob);
//            var textResult = findViewById(R.id.text_result);
//            var soA: Int = editA.text.toString().toInt();
//            var soB: Int = editB.text.toString().toInt();
//            while(true){
//                if(soA>soB){
//                    soA = soA-soB;
//                }else if(soA<soB){
//                    soB = soB-soA;
//                }else{
//                    break;
//                }
//            }
//            val resultUCLN = soA;
//            textResult.text = resultUCLN.toString();
//        }
//
//    }


    public fun handelExit(v: View){
        finish()
    }

}