package i3solution.ebooks.AppView.Fragment;

import android.app.Fragment;
import android.os.Bundle;

import i3solution.ebooks.AppView.Activity.MainActivity;

/**
 * Created by holengocson on 3/22/17.
 */

public class BaseFragment extends Fragment {
    public MainActivity activity;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        activity = (MainActivity) getActivity();
    }

    @Override
    public void onStop() {super.onStop();}

    @Override
    public void onDestroyView() {super.onDestroyView();}
}
