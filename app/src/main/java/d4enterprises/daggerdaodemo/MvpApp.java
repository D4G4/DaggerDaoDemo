package d4enterprises.daggerdaodemo;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import d4enterprises.daggerdaodemo.data.DataManager;
import d4enterprises.daggerdaodemo.di.component.ApplicationComponent;
import d4enterprises.daggerdaodemo.di.component.DaggerApplicationComponent;
import d4enterprises.daggerdaodemo.di.module.ApplicationModule;

/**
 * Created by dennis
 */

public class MvpApp extends Application {

    protected ApplicationComponent applicationComponent;

    //we have to tell the Dagger to scan this class through the implementation of ApplicationComponent.
    @Inject
    DataManager dataManager;


    public static MvpApp getMvpApp(Context context) {
        return (MvpApp) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        //Building the component link between MvpApp and ApplicationModule
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        //this is done to use it so Dagger can provide DataManager components from ApplicationModule
        applicationComponent.inject(this);
    }

    //We'll be using this method for activity classes
    public ApplicationComponent getApplicationComponent(){
        return applicationComponent;
    }
}
