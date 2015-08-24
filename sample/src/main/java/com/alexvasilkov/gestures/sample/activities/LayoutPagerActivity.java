package com.alexvasilkov.gestures.sample.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.alexvasilkov.android.commons.utils.Views;
import com.alexvasilkov.gestures.sample.R;
import com.alexvasilkov.gestures.sample.logic.Painting;
import com.alexvasilkov.gestures.sample.adapters.PaintingsLayoutsAdapter;

public class LayoutPagerActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_layout_pager);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Painting[] paintings = Painting.getAllPaintings(getResources());

        ViewPager viewPager = Views.find(this, R.id.paintings_view_pager);
        viewPager.setAdapter(new PaintingsLayoutsAdapter(viewPager, paintings));
        viewPager.setPageMargin(getResources().getDimensionPixelSize(R.dimen.view_pager_margin));
    }

}
