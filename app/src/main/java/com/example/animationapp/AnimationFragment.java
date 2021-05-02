package com.example.animationapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class AnimationFragment extends Fragment {

    private ImageView image;
    private Button button;
    private TextView text;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_animation, container, false);

        image = (ImageView) view.findViewById(R.id.imageView);
        image.setOnClickListener(this::onClick);

        text = (TextView) view.findViewById(R.id.textView);
        text.setOnClickListener(this::onClick);

        button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(this::onClick);

        return view;
    }

    public void onClick(View v){

        Animation anim = null;

        switch (v.getId()){
            case R.id.imageView:
                anim = AnimationUtils.loadAnimation(v.getContext(), R.anim.rotate);
                image.startAnimation(anim);
                break;
            case R.id.textView:
                anim = AnimationUtils.loadAnimation(v.getContext(), R.anim.scale);
                text.startAnimation(anim);
                break;
            case R.id.button:
                anim = AnimationUtils.loadAnimation(v.getContext(), R.anim.alpha);
                button.startAnimation(anim);
                break;
        }
    }
}