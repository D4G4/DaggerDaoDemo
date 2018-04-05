package d4enterprises.daggerdaodemo.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by dakshgargas
 *
 * @Qualifier is used to distinguish b/w objects of same type but with different instances.
 * @interface is used to tell dagger that this is a custom annotation
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityContext {
}
