package com.cloud.cloud_voice.model;

/**
 * Created by Petterp
 * on 2019-12-09
 * Function:首页Tab
 */
public enum CHANNEL {
    MY("我的", 0x01),

    FIND("发现", 0x02),

    FRIEND("朋友", 0x03),

    VIDEO("视频", 0x04);

    public static final int MINE_ID = 0x01;
    public static final int FIND_ID = 0x02;
    public static final int FRIEND_ID = 0x03;
    public static final int VIDEO_ID = 0x04;

    private final String key;
    private final int value;

    CHANNEL(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }


}
