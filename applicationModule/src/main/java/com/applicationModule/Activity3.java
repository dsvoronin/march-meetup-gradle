package com.applicationModule;

import android.widget.ImageView;
import java.lang.Override;

public class Activity3 extends android.app.Activity {
  ImageView imageView0;

  @Override
  public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    new applicationModulepackageKt0.Foo0().foo9();
    com.applicationModule.databinding.ApplicationmoduleactivityMain3Binding binding = androidx.databinding.DataBindingUtil.setContentView(this, R.layout.applicationmoduleactivity_main3);
    binding.setFoo3(new applicationModulepackageKt0.Foo3());
  }
}
