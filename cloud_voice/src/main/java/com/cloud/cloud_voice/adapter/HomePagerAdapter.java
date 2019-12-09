package com.cloud.cloud_voice.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.cloud.cloud_voice.model.CHANNEL;
import com.cloud.cloud_voice.view.MineFragment;


/**
 * Created by Petterp
 * on 2019-12-10
 * Function:首页ViewPagerAdapter
 */
public class HomePagerAdapter extends FragmentPagerAdapter {
    private CHANNEL[] mList;

    public HomePagerAdapter(@NonNull FragmentManager fm, CHANNEL[] mList) {
        super(fm);
        this.mList = mList;
    }

    /**
     * switch的目的是避免Fragment一次性全部加载完成
     * @param position
     * @return
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        int type = mList[position].getValue();
        switch (type) {
            case CHANNEL.MINE_ID:
                return MineFragment.newInstance();
            case CHANNEL.FIND_ID:
                return MineFragment.newInstance();
            case CHANNEL.FRIEND_ID:
                return MineFragment.newInstance();
            case CHANNEL.VIDEO_ID:
                return MineFragment.newInstance();
            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.length;
    }
}
