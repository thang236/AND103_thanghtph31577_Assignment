package com.example.and103_thanghtph31577_assignment.config;

import android.graphics.Rect;
import android.view.View;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {
    private int spacing;

    public GridSpacingItemDecoration(int spacing) {
        this.spacing = spacing;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int position = parent.getChildAdapterPosition(view);
        int spanCount = ((GridLayoutManager) parent.getLayoutManager()).getSpanCount();
        int column = position % spanCount;

        outRect.left = spacing - column * spacing / spanCount;
        outRect.right = (column + 1) * spacing / spanCount;
        if (position >= spanCount) {
            outRect.top = spacing; // add top spacing
        }
    }
}

