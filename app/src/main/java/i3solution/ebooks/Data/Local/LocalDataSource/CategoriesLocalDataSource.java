package i3solution.ebooks.Data.Local.LocalDataSource;

import android.content.Context;
import android.support.annotation.NonNull;

import i3solution.ebooks.Data.Local.DbHelper.CategoriesDbHelper;
import i3solution.ebooks.Model.Category;
import i3solution.ebooks.UnitofWork.DataSource.CategoryDataSource;
/**
 * Created by holengocson on 3/22/17.
 */

public class CategoriesLocalDataSource implements CategoryDataSource {

    public CategoriesDbHelper mDbHelper;

    public CategoriesLocalDataSource(@NonNull Context context){
        checkNotNull(context);
        mDbHelper = new CategoriesDbHelper(context);
    }

    private void checkNotNull(Context context) {
    }


    @Override
    public void getCates(@NonNull LoadCatesCallback callback) {


    }

    @Override
    public void getCate(@NonNull int cateId, @NonNull Category category) {

    }

    @Override
    public void saveCate(@NonNull Category category) {

    }

    @Override
    public void deleteAllCates() {

    }

    @Override
    public void deleteCate(@NonNull int cateID) {

    }

    @Override
    public void refreshCates() {

    }
}
