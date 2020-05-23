package com.css.apps;

public class TestCalcauator {
    public static void main(String[] args) {
        //计算两int类型数据的和,调用getResult方法，其参数为
        //一个接口，可以使用匿名内部类
        Integer result=TestCalcauator.getResult(5, 6, new Calculator() {
            @Override
            public Integer calc(Integer a, Integer b) {
                return a+b;
            }
        });
        Integer result1=TestCalcauator.getResult(5, 6, (a, b) -> a+b);
        System.out.println(result1);
    }
    public static Integer getResult(Integer a,Integer b,Calculator calculator){
        return calculator.calc(a,b);
    }
}
