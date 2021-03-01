package com.idonans.core;

/**
 * 单例辅助类
 */
public abstract class Singleton<T> {

    private T mInstance;
    private final Object mInstanceLock = new Object();

    protected abstract T create();

    public final T get() {
        synchronized (mInstanceLock) {
            if (mInstance == null) {
                mInstance = create();
            }
            return mInstance;
        }
    }

}
