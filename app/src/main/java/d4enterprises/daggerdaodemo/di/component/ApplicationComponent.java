package d4enterprises.daggerdaodemo.di.component;

import android.content.Context;

import javax.inject.Singleton;

import d4enterprises.daggerdaodemo.MvpApp;
import d4enterprises.daggerdaodemo.di.AppContext;
import d4enterprises.daggerdaodemo.di.module.ApplicationModule;
import dagger.Component;

/**
 * Created by dennis
 * <p>
 * This component will be used by Dagger2 and will act as a interface/link b/w
 * {@link d4enterprises.daggerdaodemo.MvpApp} and
 * {@link ApplicationModule}
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    //Read the comment on MvpApp.java
    //Why needs instance of Application Class? -> Because the provider in our Module needs ApplicationContext (refer to the graph in documentation)
    void inject(MvpApp mvpApp);

    @AppContext
    Context getContext();
}
