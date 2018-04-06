package d4enterprises.daggerdaodemo.data.db;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

import d4enterprises.daggerdaodemo.data.db.model.DaoMaster;
import d4enterprises.daggerdaodemo.di.AppContext;
import d4enterprises.daggerdaodemo.di.DatabaseInfo;

/**
 * Created by dennis
 */
@Singleton
public class DbOpenHelper extends DaoMaster.OpenHelper {

    @Inject
    public DbOpenHelper(@AppContext Context context, @DatabaseInfo String name) {
        super(context, name);
    }
}
