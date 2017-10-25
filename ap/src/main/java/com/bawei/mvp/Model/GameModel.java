package com.bawei.mvp.Model;

import com.bawei.mvp.JsonBeans.GameBean;
import com.bawei.mvp.network.OkhttpUtils;
import com.bawei.mvp.network.ResultCallback;
import com.squareup.okhttp.Request;

/**
 * Created by 张祺钒
 * on2017/10/18.
 */

public class GameModel implements IGameModel {


    @Override
    public void getGameBean(final GameModel.callBack callBack, String path) {
        OkhttpUtils.getAsyn(path, new ResultCallback<GameBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(GameBean response) {
                callBack.setData(response);
            }
        });
    }
    public interface callBack{
        void setData(GameBean gameBean);
    }
}
