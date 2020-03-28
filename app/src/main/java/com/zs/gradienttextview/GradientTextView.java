package com.zs.gradienttextview;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

public class GradientTextView extends androidx.appcompat.widget.AppCompatTextView {
    public GradientTextView(Context context) {
        super(context);
    }

    public GradientTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GradientTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        //如果layout改变了那么设置渐进
        if (changed){
            getPaint().setShader(new LinearGradient(0,0,getWidth()/2,getHeight()
                    ,ContextCompat.getColor(getContext(),R.color.colorStart)
                    ,ContextCompat.getColor(getContext(),R.color.colorEnd)
                    , Shader.TileMode.MIRROR));
        }
    }
}
