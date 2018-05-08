package com.gmp.mac.hellocoding_algorithm_project;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class Ch1_Binary_Search extends AppCompatActivity{

    private int[] intArray = {1,3,5,7,9,11,13,15};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("main","찾는 숫자는 "+findNumber(1)+"자리에 있습니다.");
        Log.d("main","찾는 숫자는 "+findNumber(3)+"자리에 있습니다.");
        Log.d("main","찾는 숫자는 "+findNumber(5)+"자리에 있습니다.");
        Log.d("main","찾는 숫자는 "+findNumber(7)+"자리에 있습니다.");
        Log.d("main","찾는 숫자는 "+findNumber(9)+"자리에 있습니다.");
        Log.d("main","찾는 숫자는 "+findNumber(11)+"자리에 있습니다.");
        Log.d("main","찾는 숫자는 "+findNumber(13)+"자리에 있습니다.");
        Log.d("main","찾는 숫자는 "+findNumber(15)+"자리에 있습니다.");
        Log.d("main","찾는 숫자는 "+findNumber(2)+"자리에 있습니다.");

    }

    //Binary Search Code
    private int findNumber(int findNum){

        int low =0;
        int high = intArray.length;
        int mid =0;
        int guess =0;
        int count = 1;

        while (low <= high){

            Log.d("main",count+"번 째 찾는 중");
            count++;

            mid = (low+high)/2;
            guess = intArray[mid];

            if(guess == findNum){
                return mid+1;
            } else if (guess > findNum) {
                high = mid -1;
            }else{
                low = mid +1;
            }
        }

        return 0;
    }
}
