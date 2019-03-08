package com;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author:Fanleilei
 * Created:2019/3/8 0008
 */

//生产者-消费者模型
    //生产者和消费者的能力不匹配（生产的速度和消费的速度不匹配）
    //采用队列的方式存储生产消费的资源（元素），解耦生产者和消费者的实现逻辑
public class TestQueueProducerConsumer {

    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        //生产者
        new Thread(new Runnable() {
            {

                System.out.println("生产者线程");
            }
            @Override
            public void run() {
                try{

                    Thread.sleep(500);
                    //生产数据
                    String data=String.valueOf(Math.random());
                    System.out.println("生产"+data);
                   //存储数据
                   queue.add(data);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //消费者
        new Thread(new Runnable() {
            {

                System.out.println("消费者线程");
            }
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    //消费数据
                    System.out.println(queue.poll());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
