package d4enterprises.daggerdaodemo.di.module;

import android.app.Application;
import android.content.Context;

import d4enterprises.daggerdaodemo.Utils.Constants;
import d4enterprises.daggerdaodemo.di.AppContext;
import d4enterprises.daggerdaodemo.di.DatabaseInfo;
import dagger.Provides;

/**
 * Created by dennis
 * <p>
 * DEPENDENCY PROVIDER
 * It will provide all the required things to Application class with the help of
 * {@link d4enterprises.daggerdaodemo.di.component.ApplicationComponent}
 */


/*
* Application.class has
*                       DataManager
*                               -> ApplicationContext
*                               -> DatabaseHelper
* */

@dagger.Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @AppContext
    Context provideApplicationContext() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return Constants.DB_NAME;
    }


}
