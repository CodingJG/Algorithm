package com.gmp.mac.hellocoding_algorithm_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private int[] intArray = {5,3,1,7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=0;i<intArray.length;i++)
            Log.d("main","Array Sort Asc "+i+" : "+selectionSortAsc(intArray)[i]);

        for(int i=0;i<intArray.length;i++)
            Log.d("main","Array Sort Desc "+i+" : "+selectionSortDesc(intArray)[i]);


    }

    //오름차순 선택 정렬
    private int[] selectionSortAsc(int[] arr){

        int smallest_index,temp;

        for(int i=0;i<arr.length-1;i++){
            smallest_index  = i;
            for(int j=i+1;j<arr.length;j++){

                //오름차순 조건을 위한 조건문
                if(arr[j] < arr[smallest_index]){
                    smallest_index = j;
                }
            }

            temp = arr[smallest_index];
            arr[smallest_index] = arr[i];
            arr[i] = temp;

        }

        return arr;
    }

    //내림차순 선택 정렬
    private int[] selectionSortDesc(int[] arr){

        int smallest_index,temp;

        for(int i=0;i<arr.length-1;i++){
            smallest_index  = i;
            for(int j=i+1;j<arr.length;j++){

                //내림차순 조건을 위한 조건문
                if(arr[j] > arr[smallest_index]){
                    smallest_index = j;
                }
            }

            temp = arr[smallest_index];
            arr[smallest_index] = arr[i];
            arr[i] = temp;

        }

        return arr;
    }

}
