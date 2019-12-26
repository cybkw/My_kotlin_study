package com.bkw.kotlin_study_1;


import demo.Study2;

import static demo.UtilsKt.testClass;


public class Main {
    public static void main(String[] args) {

        //UtilsKt.echo("哈哈哈哈哈"); //错误

        //new com.bkw.kotlin_study_1.study2().echo("hahaha"); //第一种方式 ：默认包名引用，正确

        new demo.Study2().echo("哈哈哈哈 ");   //第二种方式：指定包名引用，正确


        //第三种方式
        demo.Study2 study2 = new demo.Study2();
        study2.echo("第三种方式");


        //访问Study2的匿名内部类方式，
        Study2.Book.INSTANCE.read();

        //传递类参数给kotlin
        testClass(Main.class);

    }

    /**
     * 在kotlin中调用java
     *
     * @param m
     */
    public void forKotlin(String m) {
        System.out.println("我是java方法：" + m);

    }

    class MainChild {

        /**
         * java匿名内部类
         */
        public void say() {
            System.out.println("我是java内部匿名类方法");
        }
    }
}
