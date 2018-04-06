package d4enterprises.daggerdaodemo.data;

import android.content.Context;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import d4enterprises.daggerdaodemo.data.db.DatabaseHelper;
import d4enterprises.daggerdaodemo.data.db.model.User;
import d4enterprises.daggerdaodemo.di.AppContext;

/**
 * Created by dennis
 * <p>
 * This class expresses the dependencies of Application's (tells us that it needs)
 * {@link Context},
 * {@link d4enterprises.daggerdaodemo.data.db.DatabaseHelper}
 * in it's constructor. It provides all the apis to access the data in the application.
 */

@Singleton
public class DataManager {

    private static final String TAG = "DataManager";

    private final Context context;
    private final DatabaseHelper databaseHelper;

    @Inject
    public DataManager(@AppContext Context context,
                       DatabaseHelper databaseHelper) {
        this.context = context;
        this.databaseHelper = databaseHelper;
    }

    public Long createUser(User user) {
        return databaseHelper.insertUser(user);
    }

    public List<User> getAllUser() {
        return databaseHelper.getAllUsers();
    }
}
