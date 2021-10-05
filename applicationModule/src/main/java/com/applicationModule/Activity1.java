package com.applicationModule;

import android.widget.ImageView;
import java.lang.Override;

public class Activity1 extends android.app.Activity {
  ImageView imageView0;

  @Override
  public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    new applicationModulepackageKt0.Foo0().foo9();
    com.applicationModule.databinding.ApplicationmoduleactivityMain1Binding binding = androidx.databinding.DataBindingUtil.setContentView(this, R.layout.applicationmoduleactivity_main1);
    binding.setFoo1(new applicationModulepackageKt0.Foo1());
    binding.setFoo8(new applicationModulepackageKt0.Foo8());
  }
}
