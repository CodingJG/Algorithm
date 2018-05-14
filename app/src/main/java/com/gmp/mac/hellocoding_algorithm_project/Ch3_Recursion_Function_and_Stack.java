package com.gmp.mac.hellocoding_algorithm_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class Ch3_Recursion_Function_and_Stack extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      returnMethod(3);

      greet("JG");

    }

    //재귀 함수
    private void returnMethod(int i){


        //기본 단계 -> 무한반복을 제한할 조건
        if( i < 1){
            return;
        }
        //재귀 단계 -> 반복
        else{

            Log.d("main","count : "+i);
            returnMethod(i-1);
        }

    }

    //스택 LIFO
    private void greet(String name){

        //처음 출력.
        Log.d("main","Hello, "+name+"!");

        //greet 정지, greet2 log 출력(push).
        greet2("JG");

        //greet로 복귀후(pop), bye log 실행(push).
        bye();

        //greet 모든 동작 완료(pop).
    }

    private void greet2(String name){

        Log.d("main","How are you, "+name+"?");


    }

    private void bye(){

        Log.d("main","Ok, Bye ~");


    }

}
