package com.example.moein.fragmentall;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentB.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentB#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentB extends Fragment {

    @Override
    public void onAttach(Context context) {
        Log.d("Moein", "Fragment B onAttach");
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.d("Moein", "Fragment B onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        Log.d("Moein", "Fragment B onCreateView");
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Moein", "Fragment B onActivityCreated");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Moein", "Fragment B onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Moein", "Fragment B onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Moein", "Fragment B onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Moein", "Fragment B onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Moein", "Fragment B onDetach");
    }


}
