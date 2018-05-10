package com.gmp.mac.hellocoding_algorithm_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class Ch4_QuickSort extends AppCompatActivity {

    private int[] intArray = {5,1,3,7,10,14,11,12,20,17};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        euclidean_Algorithm(1680,640);

        
        quickSort(intArray,0,intArray.length-1);

        for(int i=0; i<intArray.length; i++){
            System.out.println("intArray["+i+"] : "+intArray[i]);
        }


    }


    private void euclidean_Algorithm(int row,int column){

        int num;

        if(row == 0){

            Log.d("main","Euclidean Algorithm 나눌 수 있는 가장 큰 정사각형 한 변은 "
                    +column+" 입니다.");
            return;

        }else if(column == 0){

            Log.d("main","Euclidean Algorithm 나눌 수 있는 가장 큰 정사각형 한 변은 "
                    +row+" 입니다.");
            return;

        }else if( row < column){

            num = column%row;
            Log.d("main","case 1 row :"+row+" column :"+column+" num :"+num);

            euclidean_Algorithm(row-num,num);
        }else{

            num = row%column;

            Log.d("main","case 2 row :"+row+" column :"+column+" num :"+num);

            euclidean_Algorithm(num,column-num);
        }

        
    }


    private void quickSort(int[] data, int l, int r){
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2];

        do{
            while(data[left] < pivot) left++;
            while(data[right] > pivot) right--;
            if(left <= right){
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);

        if(l < right) quickSort(data, l, right);
        if(r > left) quickSort(data, left, r);
    }


}
