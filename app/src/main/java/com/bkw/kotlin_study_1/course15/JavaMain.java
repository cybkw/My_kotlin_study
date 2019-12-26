package com.bkw.kotlin_study_1.course15;

import android.annotation.SuppressLint;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

public class JavaMain {
    @SuppressLint("CheckResult")
    public static void main(String[] args) {

        final String[] strs = new String[]{"a", "b", "c", "d"};
        final Integer[] index = new Integer[]{2, 3, 4, 1, 5, 8, 6, 7};

        Observable.just(index)
                .flatMap(new Function<Integer[], ObservableSource<Integer>>() {
                    @Override
                    public ObservableSource<Integer> apply(Integer[] integers) throws Exception {
                        return Observable.fromArray(integers);
                    }
                })
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        return integer < strs.length;
                    }
                })
                .map(new Function<Integer, String>() {
                    @Override
                    public String apply(Integer integer) {
                        return strs[integer];
                    }
                })
                .reduce(new BiFunction<String, String, String>() {
                    @Override
                    public String apply(String r, String r2) throws Exception {
                        return r + r2;
                    }
                })
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String r) throws Exception {
                        System.out.println("密码是:"+r);
                    }
                });
    }
}
