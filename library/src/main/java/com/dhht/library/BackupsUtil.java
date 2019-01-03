package com.dhht.library;

/**
 * @author HanPei
 * @date 2018/12/29  下午2:48
 */
public class BackupsUtil {

    /**
     * 备份保存的路径
     */
    private static String sSavePath;

    /**
     * 备份的数量，多次保存或者覆盖保存
     */
    private static int backupsCount;

    private BackupsUtil() {
    }

    public static BackupsUtil getInstance() {
        return BackupsUtilHolder.sBackupsUtil;
    }

    public static void init(String path) {
        sSavePath = path;
    }

    static class BackupsUtilHolder {
        static BackupsUtil sBackupsUtil = new BackupsUtil();
    }

    public void startBackup() {

    }


    public void restoreBackup() {

    }
}
