package com.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author XJ
 * 因为SPI的实现者可能有多个,所以加载了服务实现者之
 * 后通常调⽤iterator来得到所有这些实现者,并且在进⾏真
 * 正的迭代操作时才真正去加载实现者,加载之后会放置在
 * ServiceLoader内部缓存中.
 *
 * 一个mod加载器，mod有很多所以需要加载
 */
public class HelloProviderServiceFactory {
    static ServiceLoader<HelloProvider> loader
            = ServiceLoader.load(HelloProvider.class);

    public static Iterator<HelloProvider> providers(boolean refresh) {
        if (refresh) {
            loader.reload();//清理缓存,重新加载
        }
        return loader.iterator();
    }
}
