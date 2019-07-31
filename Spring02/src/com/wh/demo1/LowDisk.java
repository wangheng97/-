package com.wh.demo1;

/**
 * LowDisk
 *
 * @author wangheng
 * @date 2019/7/29
 */
public class LowDisk implements IDisk {

    @Override
    public void work() {
        System.out.println("===40G硬盘===");
    }
}
