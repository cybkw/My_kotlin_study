package com.bkw.kotlin_study_1.course2;

public class A implements AInterface {

    public static void main(String[] args){
//        System.out.println(child.name);
//        child.sayMsg();

        Utils.INSTANCE.sayMsg(null);
    }

    @Override
    public void putNumber(int num) {
        System.out.println("基本数据类型：int");

    }

    @Override
    public void putNumber(Integer num) {
        System.out.println("包装类：Integer");
    }

    public static String format(String str) {
        return str.isEmpty() ? null : str;
    }
}
