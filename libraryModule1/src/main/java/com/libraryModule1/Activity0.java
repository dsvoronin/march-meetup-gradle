package com.libraryModule1;

import android.widget.ImageView;

import io.reactivex.rxjava3.plugins.RxJavaPlugins;

public class Activity0 extends android.app.Activity {
    ImageView imageView0;

    @Override
    public void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new libraryModule1packageKt0.Foo0().foo9();
        setContentView(R.layout.librarymodule1activity_main0);

        RxJavaPlugins.lockdown();
    }
}
