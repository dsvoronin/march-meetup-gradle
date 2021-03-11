package com.applicationModule;

import android.widget.ImageView;
import java.lang.Override;

public class Activity2 extends android.app.Activity {
  ImageView imageView0;

  @Override
  public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    new applicationModulepackageKt0.Foo0().foo9();
    com.applicationModule.databinding.ApplicationmoduleactivityMain2Binding binding = android.databinding.DataBindingUtil.setContentView(this, R.layout.applicationmoduleactivity_main2);
    binding.setFoo2(new applicationModulepackageKt0.Foo2());
    binding.setFoo9(new applicationModulepackageKt0.Foo9());
  }
}
