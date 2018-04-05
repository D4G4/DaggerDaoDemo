package d4enterprises.daggerdaodemo.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by dakshgargas
 *
 * @Scope is used to so each instance of a class whose members are injected with a class annotated
 * with scope will get it's own set of member variables.
 * @interface is used to tell dagger that this is a custom annotation
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
