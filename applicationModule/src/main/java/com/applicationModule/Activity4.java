package com.applicationModule;

import android.widget.ImageView;
import java.lang.Override;

public class Activity4 extends android.app.Activity {
  ImageView imageView0;

  ImageView imageView1;

  ImageView imageView2;

  @Override
  public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    new applicationModulepackageKt0.Foo0().foo9();
    com.applicationModule.databinding.ApplicationmoduleactivityMain4Binding binding = android.databinding.DataBindingUtil.setContentView(this, R.layout.applicationmoduleactivity_main4);
    binding.setFoo4(new applicationModulepackageKt0.Foo4());
    binding.setFoo5(new applicationModulepackageKt0.Foo5());
    binding.setFoo6(new applicationModulepackageKt0.Foo6());
  }
}
