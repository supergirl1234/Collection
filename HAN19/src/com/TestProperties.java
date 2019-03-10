package com;

import java.io.*;
import java.util.Properties;

/**
 * Author:Fanleilei
 * Created:2019/3/9 0009
 */
public class TestProperties {

    public static void main(String[] args) {

        //*.properties 称之为属性文件
        //Properties 称之为属性类
        //*.properties->Properties
        //读取文件：load->Properties->InputStream/Reader
        //写入文件：store->*.properties->OutputStream/Writer

        Properties properties=new Properties();
        //读取文件内容

        try {
            //1.通过FileInputStream
           // properties.load(new FileInputStream(new File("D:\\workspace\\HAN19\\src\\com\\Properties")));

            //2.通过ClassLoader的方式读取属性文件，指定包路径
            InputStream inputStream=TestProperties.class.getClassLoader().getResourceAsStream("com/Properties");
            properties.load(inputStream);
            System.out.println(properties.getProperty("1"));//乱码的问题
            System.out.println(properties.getProperty("2"));
            System.out.println(properties.getProperty("3"));
            System.out.println(properties.getProperty("C"));


            //存储文件
            properties.setProperty("5","学生");
            properties.setProperty("6","教师");
            properties.setProperty("7","teacher");
            properties.store(new FileOutputStream(new File("D:\\workspace\\HAN19\\src\\com\\Properties")),"testProperties");
            //存储时出现乱码情况
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
