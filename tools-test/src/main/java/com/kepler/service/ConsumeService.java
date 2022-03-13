package com.kepler.service;

/**
 * @Author kepler
 * @Date 2022/3/13 17:53
 * @Version 1.0
 */
public interface ConsumeService {
    public void consume();

    public String getConsumerName(String ID);

    //打印信息
    public void print(String info);

    //master 分支特有
    public String master();
}
