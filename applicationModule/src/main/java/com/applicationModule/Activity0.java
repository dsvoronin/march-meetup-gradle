package com.applicationModule;

import android.widget.ImageView;
import java.lang.Override;

public class Activity0 extends android.app.Activity {
  ImageView imageView0;

  @Override
  public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    new applicationModulepackageKt0.Foo0().foo9();
    com.applicationModule.databinding.ApplicationmoduleactivityMain0Binding binding = androidx.databinding.DataBindingUtil.setContentView(this, R.layout.applicationmoduleactivity_main0);
    binding.setFoo0(new applicationModulepackageKt0.Foo0());
    binding.setFoo7(new applicationModulepackageKt0.Foo7());
  }
}
