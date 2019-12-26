package com.bkw.kotlin_study_1.course4;

public class Sample1 {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        thread.start();
    }

    /**
     * Java8 lambda语法
     * */
    public static void main2(String[] args){
        //将new Runnable对象省略成()->的方法替代
        Thread thread=new Thread(()->{

        });
        thread.start();
    }
}
