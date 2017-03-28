package com.bw.tfg.myswiperecyclerview.cards;


import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.bw.tfg.myswiperecyclerview.R;
import com.bw.tfg.myswiperecyclerview.beans.BaseBean;

public class NoDataCard extends BaseCard {
    private ImageView mivGraphic;
    private TextView mtvHint;

    public NoDataCard(Context context) {
        super(context);
    }

    public NoDataCard(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NoDataCard(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected int getResId() {
        return R.layout.layout_no_data_content;
    }

    @Override
    protected void findViews() {
        mivGraphic = (ImageView)mContentView.findViewById(R.id.iv_no_data_content);
        mtvHint = (TextView)mContentView.findViewById(R.id.tv_no_data_content);
    }

    @Override
    public void bindData(BaseBean baseBean) {
        mivGraphic.setImageResource(R.drawable.icon_no_data_content);
        mtvHint.setText(R.string.there_is_nothing);
    }
}
