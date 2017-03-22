package i3solution.ebooks.AppView.ViewCustom;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by holengocson on 3/22/17.
 */

public class ScrollChildSwipeRefreshLayout extends SwipeRefreshLayout {

    private View mScrollUpChild;

    public ScrollChildSwipeRefreshLayout(Context context){
        super(context);
    }

    public ScrollChildSwipeRefreshLayout(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    public boolean canChildScrollUp() {
        if(mScrollUpChild != null){
            return ViewCompat.canScrollVertically(mScrollUpChild, -1);
        }
        return super.canChildScrollUp();
    }
    public void setScrollUpChild(View view){
        mScrollUpChild = view;
    }
}
