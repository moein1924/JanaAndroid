package com.example.moein.fragmentall;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FragmentManager FM;
    FragmentA f1;
    FragmentB f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FM = getFragmentManager();
    }

    public void addA(View view){

        // creating an object of the fragment
        f1 = new FragmentA();

        //with the help of transaction, add, remove, replace .....happen
        FragmentTransaction transaction = FM.beginTransaction();

        transaction.add(R.id.myLayout, f1, "A");
        transaction.addToBackStack("addA");
        transaction.commit();

    }
    public void removeA(View view){

        Fragment f1 = (FragmentA) FM.findFragmentByTag("A");
        FragmentTransaction transaction = FM.beginTransaction();
        if(f1 != null){
            transaction.remove(f1);
            transaction.addToBackStack("removeA");
            transaction.commit();
        }
        else{
            Toast.makeText(this,"Fragment A was not added before",Toast.LENGTH_SHORT).show();
        }

    }
    public void replaceAwB(View view){

        FragmentB f2 = new FragmentB();
        FragmentTransaction transaction = FM.beginTransaction();
        transaction.replace(R.id.myLayout, f2, "B");
        transaction.addToBackStack("replaceAwB");
        transaction.commit();

    }
    public void addB(View view){

        f2 = new FragmentB();
        FragmentTransaction transaction = FM.beginTransaction();

        transaction.add(R.id.myLayout, f2, "B");
        transaction.addToBackStack("addB");
        transaction.commit();

    }
    public void removeB(View view) {

        Fragment f2 = (FragmentB) FM.findFragmentByTag("B");
        FragmentTransaction transaction = FM.beginTransaction();
        if (f2 != null) {
            transaction.remove(f2);
            transaction.addToBackStack("removeB");
            transaction.commit();
        }
        else{
            Toast.makeText(this,"Fragment B was not added before",Toast.LENGTH_SHORT).show();
        }
    }
    public void replaceBwA(View view){
        FragmentA f1 = new FragmentA();
        FragmentTransaction transaction = FM.beginTransaction();
        transaction.replace(R.id.myLayout, f1, "A");
        transaction.addToBackStack("replaceBwA");
        transaction.commit();
    }
    public void attachA(View view){
        FragmentA f1 = (FragmentA) FM.findFragmentByTag("A");
        FragmentTransaction transaction = FM.beginTransaction();
        if(f1 != null){
            transaction.attach(f1);
            transaction.addToBackStack("attachA");
            transaction.commit();
        }

    }
    public void detachA(View view) {
        FragmentA f1 = (FragmentA) FM.findFragmentByTag("A");
        FragmentTransaction transaction = FM.beginTransaction();
        if (f1 != null) {
            transaction.detach(f1);
            transaction.addToBackStack("detachA");
            transaction.commit();
        }
    }
    public void backButton (View view){
        FM.popBackStack();
    }



}
