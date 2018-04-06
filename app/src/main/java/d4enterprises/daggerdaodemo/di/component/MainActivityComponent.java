package d4enterprises.daggerdaodemo.di.component;

import d4enterprises.daggerdaodemo.MainActivity;
import d4enterprises.daggerdaodemo.di.PerActivity;
import d4enterprises.daggerdaodemo.di.module.MainActivityModule;
import dagger.Component;

/**
 * Created by dennis
 * <p>
 * Here we are using custom {@link javax.inject.Scope} i.e. {@link d4enterprises.daggerdaodemo.di.PerActivity}
 * to tell Dagger that the Context and the
 * Activity provided by {@link d4enterprises.daggerdaodemo.di.module.MainActivityModule}
 * will be instantiated each time the Activity is created.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity activity);
}
