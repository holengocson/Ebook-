package i3solution.ebooks.AppView.Fragment;

import java.util.List;

import i3solution.ebooks.AppContract.CategoriesContract;
import i3solution.ebooks.Model.Category;

/**
 * Created by holengocson on 3/22/17.
 */

public class CategoriesFragment extends  BaseFragment implements CategoriesContract.View{

    @Override
    public void setPresenter(CategoriesContract.Presenter presenter) {

    }

    @Override
    public void showCatesTimeline(List<Category> categories) {

    }

    @Override
    public void showNoCatesTimeline() {

    }

    @Override
    public void showFilterCatesTimeline() {

    }

    @Override
    public void showCatesPinedTimeline(List<Category> categories) {

    }

    @Override
    public void showNoCatesPinedTimeline() {

    }

    @Override
    public void showFilterCatesPinedTimeline() {

    }

    @Override
    public void showLoadingCatesError() {

    }

    @Override
    public boolean isPined() {
        return false;
    }

    @Override
    public void setLoadingIndicator(boolean active) {

    }

    @Override
    public boolean isActive() {
        return false;
    }
}
