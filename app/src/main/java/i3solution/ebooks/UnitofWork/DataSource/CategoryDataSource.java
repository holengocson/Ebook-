package i3solution.ebooks.UnitofWork.DataSource;

import android.support.annotation.NonNull;

import java.util.List;

import i3solution.ebooks.Model.Category;

/**
 * Created by holengocson on 3/22/17.
 */

public interface CategoryDataSource {
    interface LoadCatesCallback {

        void onCatesLoaded(List<Category> categories);

        void onDataNotAvailable();
    }

    interface LoadCateCallback {

        void onCateLoaded (Category category);

        void onDataNotAvailable();
    }

    void getCates(@NonNull LoadCatesCallback callback);

    void getCate ( @NonNull int cateId ,@NonNull Category category);

    void saveCate(@NonNull Category category);

    void deleteAllCates();

    void deleteCate(@NonNull int cateID);

    void refreshCates();

}
