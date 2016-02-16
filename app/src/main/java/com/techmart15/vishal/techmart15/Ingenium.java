package com.techmart15.vishal.techmart15;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Vishal Anand on 11-Oct-15.
 */
public class Ingenium extends Fragment {
    public static Ingenium newInstance() {
        Ingenium fragment = new Ingenium();
        return fragment;
    }
    public Ingenium(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.ingenium,container,false);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        ((MainActivity) activity).onSectionAttached(8);

    }
}
