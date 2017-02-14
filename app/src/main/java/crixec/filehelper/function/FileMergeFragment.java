package crixec.filehelper.function;

import android.support.v7.app.AppCompatActivity;

import crixec.filehelper.BaseFragment;

/**
 * Created by crixec on 17-2-12.
 */

public class FileMergeFragment extends BaseFragment {
    public static FileMergeFragment newInstance(AppCompatActivity activity, int titleRes, int contentViewRes) {
        FileMergeFragment fragment = new FileMergeFragment();
        fragment.setActivity(activity);
        fragment.setContentViewRes(contentViewRes);
        fragment.setTitleRes(titleRes);
        return fragment;
    }
}
