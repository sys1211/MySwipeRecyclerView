package com.bw.tfg.myswiperecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bw.tfg.myswiperecyclerview.beans.CategoryBean;
import com.bw.tfg.myswiperecyclerview.fragments.ContentListFragment;
import com.bw.tfg.myswiperecyclerview.utils.FragmentUtils;


public class MainActivity extends AppCompatActivity {
    private ContentListFragment mContentListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        CategoryBean categoryBean = new CategoryBean();

        categoryBean.setCategoryId(1);
        categoryBean.setCategoryName("分类");
        categoryBean.setSubclassCount(5);

        mContentListFragment = ContentListFragment.newInstance(categoryBean);
        FragmentUtils.addFragmentToActivity(getSupportFragmentManager(),
                                            mContentListFragment,
                                            R.id.fl_fragment_container);

    }
}
