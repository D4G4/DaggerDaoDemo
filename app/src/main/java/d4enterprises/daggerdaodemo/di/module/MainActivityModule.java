package d4enterprises.daggerdaodemo.di.module;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import d4enterprises.daggerdaodemo.di.ActivityContext;
import dagger.Module;
import dagger.Provides;

/**
 * Created by dennis
 */

//Currently, this module looks almost same as ApplicationModule, this is because we haven't used much in Activity class

@Module
public class MainActivityModule {

    private AppCompatActivity mActivity;

    public MainActivityModule(AppCompatActivity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }
}
