package com.example.helloandroid;

public class NativeWrapper {

    public native String GetBackgroundText();

    static {
        System.loadLibrary("native");
    }

}
