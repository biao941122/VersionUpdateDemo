package com.nistart.versionupdatedemo.updata;

/**
 * @author Samuel
 * @time 2018/8/10 11:08
 * @describe
 */
public interface OnUpdateListener {
    /**
     * 开始更新
     */
    void onStartUpdate();

    /**
     * 更新进度变化
     *
     * @param progress 当前更新进度
     */
    void onProgress(int progress);

    /**
     * 新的Apk下载完成
     *
     * @param apkPath apk 全路径
     */
    void onApkDownloadFinish(String apkPath);

    /**
     * 更新失败
     */
    void onUpdateFailed();

    /**
     * 更新已取消
     */
    void onUpdateCanceled();

    /**
     * 更新异常
     *
     * 主要是下载APK文件不完整或者APK包异常
     */
    void onUpdateException();
}
