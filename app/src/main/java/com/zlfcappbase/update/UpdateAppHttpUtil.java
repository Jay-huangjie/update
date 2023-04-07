package com.zlfcappbase.update;

import android.telecom.Call;

import androidx.annotation.NonNull;

import com.google.gson.Gson;
import com.vector.update_app.HttpManager;
import com.vector.update_app.UpdateAppBean;

import java.io.File;
import java.util.Map;


/**
 * @Description: app 更新专用
 * @Author: lixh
 * @CreateDate: 2020/4/2 13:13
 * @Version: 1.0
 */
public class UpdateAppHttpUtil implements HttpManager {


    public UpdateAppHttpUtil() {

    }


    /**
     * 异步get
     *
     * @param url      get请求地址
     * @param params   get参数
     * @param callBack 回调
     */
    @Override
    public void asyncGet(@NonNull String url, @NonNull Map<String, String> params, @NonNull final Callback callBack) {
        UpdateAppBean vo = new UpdateAppBean();
        vo.setApkFileUrl("ssssssss");
        vo.setNewVersion("v1.0");
        vo.setTargetSize("10M");
        vo.setUpdateLog("1.更新日志  2.日志");
        vo.setConstraint(true);
        vo.setUpdate("Yes");
        vo.setMarket(true);
        Gson gson = new Gson();
        callBack.onResponse(gson.toJson(vo));
    }


    /**
     * 异步post
     *
     * @param url      post请求地址
     * @param params   post请求参数
     * @param callBack 回调
     */
    @Override
    public void asyncPost(@NonNull String url, @NonNull Map<String, String> params, @NonNull final Callback callBack) {


    }

    /**
     * 下载
     *
     * @param url      下载地址
     * @param path     文件保存路径
     * @param fileName 文件名称
     * @param callback 回调
     */
    @Override
    public void download(@NonNull String url, @NonNull String path, @NonNull String fileName, @NonNull final FileCallback callback) {

    }
}
