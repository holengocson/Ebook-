package i3solution.ebooks.AppContract;

import android.support.annotation.NonNull;

import java.util.List;

import i3solution.ebooks.BasePresenter;
import i3solution.ebooks.BaseView;
import i3solution.ebooks.Model.Category;

/**
 * Created by holengocson on 3/22/17.
 */

public interface CategoriesContract {
    interface View extends BaseView<Presenter>{
        void showCatesTimeline(List<Category> categories);
        void showNoCatesTimeline();
        void showFilterCatesTimeline();

        void showCatesPinedTimeline(List<Category> categories);
        void showNoCatesPinedTimeline();
        void showFilterCatesPinedTimeline();

        void showLoadingCatesError();
        boolean isPined();
        void setLoadingIndicator(boolean active);
        boolean isActive();
    }

    interface Presenter extends BasePresenter{
        void result(int requestCode, int resultCode);
        void loadCategories(boolean forceUpdate);
        void loadCategoryDetail(@NonNull Category requestCate);
        void pinCategoryonView(@NonNull Category pinCate);

    }
}
