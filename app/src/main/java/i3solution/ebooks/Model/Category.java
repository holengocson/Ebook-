package i3solution.ebooks.Model;

import android.support.annotation.NonNull;

/**
 * Created by holengocson on 3/22/17.
 */

public class Category {
    @NonNull
    private final int CateID;

    @NonNull
    private final String CateName;


    public Category( int cateID) {
        this(cateID, null);
    }

    public Category(@NonNull int cateID, @NonNull String cateName) {
        this.CateID = cateID;
        this.CateName = cateName;
    }

    @NonNull
    public int getCateID() {return CateID;}

    @NonNull
    public String getCateName() {return  CateName;}
}
