package com.walmartlabs.ern.container.plugins;

import android.app.Application;
import android.support.annotation.NonNull;

import com.facebook.react.ReactInstanceManagerBuilder;
import com.facebook.react.ReactPackage;
import com.dylanvann.fastimage.FastImageViewPackage;

public class ReactNativeFastImagePlugin {
    public ReactPackage hook(@NonNull Application application,
                     @NonNull ReactInstanceManagerBuilder reactInstanceManagerBuilder) {
        FastImageViewPackage fastImageViewPackage = new FastImageViewPackage();
        reactInstanceManagerBuilder.addPackage(fastImageViewPackage);
        return fastImageViewPackage;
    }
}