package com.zongyoujifeng.testconcurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ResourceByCondition {
    private String name;
    private int count = 1;
    private boolean flag = false;

    // 创建一个锁对象
    Lock lock = new ReentrantLock();
    // 通过已有的锁获取两组监视器，一组监视生产者
}
