package d4enterprises.daggerdaodemo.data.db;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import d4enterprises.daggerdaodemo.data.db.model.DaoMaster;
import d4enterprises.daggerdaodemo.data.db.model.DaoSession;
import d4enterprises.daggerdaodemo.data.db.model.User;


/**
 * Created by dennis
 */

@Singleton
public class DatabaseHelper {

    public static final boolean ENCRYPTED = true;

    private final DaoSession mDaoSession;

    @Inject
    public DatabaseHelper(DbOpenHelper dbOpenHelper) {
        mDaoSession = new DaoMaster(ENCRYPTED
                ? dbOpenHelper.getEncryptedWritableDb("dennis18") : dbOpenHelper.getWritableDb()).
                newSession();
    }

    //Todo: We'll start returning observables here
    public Long insertUser(final User user) {
        return mDaoSession.getUserDao().insert(user);
    }

    public List<User> getAllUsers(){
        return mDaoSession.getUserDao().loadAll();
    }

}
