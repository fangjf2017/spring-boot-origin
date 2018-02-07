package com.fanshuai.ngsp.nws.jdk8;

/**
 * Created by fanshuai on 2017/9/25.
 * <p>
 * 函数式接口
 */

@FunctionalInterface
interface LambdaFunctionDemo<F, T> {

    T convert(F from);
}
