package com.lisxapp.circle.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

/**
 * Created by Admin on 2017/5/16.
 */

public class CustomScrollView extends HorizontalScrollView {

    public CustomScrollView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public CustomScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public CustomScrollView(Context context) {
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        //PlanScheduleFragment的实例，当前的mTouchView 是CustomScrollView的实例，滑动进行触摸赋值
        // PlanScheduleFragment.planScheduleFragment.mTouchView = this;
        return super.onTouchEvent(ev);
    }


    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        //当前的CHSCrollView被触摸时，滑动其它
//        if (PlanScheduleFragment.planScheduleFragment.mTouchView  == this) {
//            PlanScheduleFragment.planScheduleFragment.onScrollChanged(l, t, oldl, oldt);
//        } else {
//            super.onScrollChanged(l, t, oldl, oldt);
//        }
    }
}
