package com.impl;

import com.spi.HelloProvider;

/**
 * @author XJ
 *
 * 实现的类
 */
public class HelloService implements HelloProvider {
    @Override
    public void play() {
        System.out.println("mod 启动 -------");
    }
}
