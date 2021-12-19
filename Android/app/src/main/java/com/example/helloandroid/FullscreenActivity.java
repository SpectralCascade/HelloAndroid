package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.helloandroid.databinding.ActivityFullscreenBinding;

///
/// Not really fullscreen any more, but demos C++ code usage via JNI.
///
public class FullscreenActivity extends AppCompatActivity {

    private View mContentView;

    private boolean mVisible;

    private ActivityFullscreenBinding binding;

    private NativeWrapper jni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFullscreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mVisible = true;
        mContentView = binding.fullscreenContent;
        jni = new NativeWrapper();

        // Set up the user interaction to toggle the text.
        mContentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggle();
            }
        });

    }

    private void toggle() {
        mVisible = !mVisible;
        binding.fullscreenContent.setText(mVisible ? jni.GetBackgroundText() : getResources().getString(R.string.dummy_content));
    }

}