package com.heima.utils.thread;

import com.heima.model.wemedia.pojos.WmUser;

/**
 * @author HLxxx
 * @version 1.0
 */
public class WmThreadLocalUtil {
    private final static ThreadLocal<WmUser> WM_USER_THREAD_LOCAL = new ThreadLocal<>();

    //スレッドに保存しますスレッドに保存します
    public static void setUser(WmUser wmUser) {
        WM_USER_THREAD_LOCAL.set(wmUser);
    }
    //スレッドから獲得します
    public static WmUser getUser(){
       return WM_USER_THREAD_LOCAL.get();
    }
    //クリアします
    public static void clear(){
        WM_USER_THREAD_LOCAL.remove();
    }
}
