package i3solution.ebooks.Data.Local.PersistenceContract;

import android.provider.BaseColumns;

/**
 * Created by holengocson on 3/22/17.
 */

public class CategoriesPersistenceContract  {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public CategoriesPersistenceContract() {}

    /* Inner class that defines the table contents */
    public static abstract class  CatesEntry implements BaseColumns {
        public static final String TABLE_NAME = "cate";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COLUMN_NAME_CATE_NAME = "catename";
    }


}
