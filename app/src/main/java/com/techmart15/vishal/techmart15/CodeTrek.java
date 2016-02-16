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
public class CodeTrek extends Fragment {
    public static CodeTrek newInstance() {
        CodeTrek fragment = new CodeTrek();
        return fragment;
    }
    public CodeTrek(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.codetrek,container,false);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        ((MainActivity) activity).onSectionAttached(3);

    }
}
