package com.spi;

/**
 * @author XJ
 *
 * 提供一个接口，给别人调用实现
 * 相当于一个启动器，把启动器给别人，别人做的mod都需要用到启动器
 */
public interface HelloProvider {
    /**
     * 一个启动的接口
     */
    void play();
}
