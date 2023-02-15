package ru.ivanmurzin.fooddeliveryapp.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;

import ru.ivanmurzin.fooddeliveryapp.R;
import ru.ivanmurzin.fooddeliveryapp.databinding.ViewActionButtonBinding;

public class ActionButton extends FrameLayout {
    ViewActionButtonBinding binding;

    public ActionButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(attrs);
    }

    public ActionButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(attrs);
    }


    public void initView(AttributeSet attrs) {
        binding = ViewActionButtonBinding.inflate(LayoutInflater.from(getContext()), this, true);
        TypedArray attributes = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.ActionButton, 0, 0);
        try {
            String text = attributes.getString(R.styleable.ActionButton_text);
            binding.actionButton.setText(text);

            boolean textAllCaps = attributes.getBoolean(R.styleable.ActionButton_android_textAllCaps, true);
            binding.actionButton.setAllCaps(textAllCaps);
        } finally {
            attributes.recycle();
        }
    }

    @Override
    public void setOnClickListener(@Nullable OnClickListener l) {
        binding.actionButton.setOnClickListener(l);
    }
}
