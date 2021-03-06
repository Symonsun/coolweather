package org.test.ssy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by siyuan on 2017/9/21.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
