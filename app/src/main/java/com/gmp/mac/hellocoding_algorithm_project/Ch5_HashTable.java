package com.gmp.mac.hellocoding_algorithm_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Hashtable;

public class Ch5_HashTable extends AppCompatActivity {

    private Hashtable book = new Hashtable(), voted = new Hashtable(), cache = new Hashtable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //exampleBook();

/*
        check_voter("tom");
        check_voter("mike");
        check_voter("mike");
*/

       /* System.out.println(get_page("login"));
        System.out.println(get_page("login"));*/

    }

    private void exampleBook(){

        book.put("apple",new Float(0.67));
        book.put("milk",new Float(1.49));
        book.put("avocado",new Float(1.49));

        System.out.println(book);
        System.out.println(book.get("avocado"));
    }

    private void check_voter(String name){

        if(voted.get(name) != null && (boolean)voted.get(name) == true){
            System.out.println("돌려 보내세요!");
        }else{
            voted.put(name,true);
            System.out.println("투표하게 하세요!");
        }

    }

    private String get_page(String url){

        if(cache.get(url) != null){
            return (String)cache.get(url);
        }else{

            String data = "profile url";
            cache.put(url,data);

            return data;

        }

    }



}
