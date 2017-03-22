package i3solution.ebooks.Data.Local.DbHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import i3solution.ebooks.Data.Local.PersistenceContract.CategoriesPersistenceContract;

/**
 * Created by holengocson on 3/22/17.
 */

public class CategoriesDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;

    public static final String DATABASE_NAME = "Categories.db";

    private static final String TEXT_TYPE = " TEXT";

    private static final String COMMA_SEP = ",";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + CategoriesPersistenceContract.CatesEntry.TABLE_NAME + " (" +
                    CategoriesPersistenceContract.CatesEntry._ID + TEXT_TYPE + " PRIMARY KEY," +
                    CategoriesPersistenceContract.CatesEntry.COLUMN_NAME_ENTRY_ID + TEXT_TYPE + COMMA_SEP +
                    CategoriesPersistenceContract.CatesEntry.COLUMN_NAME_CATE_NAME + TEXT_TYPE + COMMA_SEP +
                    " ) " ;
    public CategoriesDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //not required at version 1
    }


}
