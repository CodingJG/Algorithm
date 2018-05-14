package com.gmp.mac.hellocoding_algorithm_project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Hashtable;

public class Ch6_Breadth_FirstSearch extends AppCompatActivity {


    private Hashtable<String,String[]> graph = new Hashtable<String, String[]>();

    private ArrayList<String[]> search_queue = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setPerson();

        search("you");
    }


    //graph setting
    private void setPerson(){

        graph.put("you", new String[]{"alice", "bob", "claire"});
        graph.put("bob", new String[]{"anuj", "peggy"});
        graph.put("alice", new String[]{"peggy"});
        graph.put("claire", new String[]{"thom", "jonny"});
        graph.put("anuj", new String[]{"mark"});
        graph.put("peggy", new String[]{});
        graph.put("thom", new String[]{});
        graph.put("jonny", new String[]{});

    }


    private void search(String name){

        search_queue.add(graph.get(name));

        String person;
        int search_count =0;
        ArrayList<String> searched = new ArrayList<>();

        for(int i=0;i< search_queue.size();i++){

            //Log.d("main","size : "+search_queue.size());
            for(int j=0; j < search_queue.get(i).length;j++){

                //Log.d("main","person : "+search_queue.get(i)[j]);


                person = search_queue.get(i)[j];

                if(searched != null && searched_check(searched,person) == true){

                    break;

                }else{

                    searchResult(person,search_count,searched);

                }


                search_count++;

            }

        }



    }

    //search Result
    private void searchResult(String person,int search_count,ArrayList<String> searched){

        if(person_is_seller(person).equals("m")){
            System.out.println(person+" is a Mango Seller! serach_count : "+search_count);
            return;
        }else{
            searched.add(person);
            search_queue.add(graph.get(person));
        }
    }


    //seller Check
    private String person_is_seller(String person){

        if(person.substring(0,1).equals("m")){
            return "m";
        }else{
            return person;
        }

    }

    //중복 search 체크.
    private boolean searched_check(ArrayList<String> searched, String person){

        for(int i=0; i<searched.size();i++){

            if(searched.get(i).equals(person)){
                return true;
            }
        }

        return false;
    }


}
