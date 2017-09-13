package com.yitianyigexiangfa.dubbo.liubei.playground;

public class Caculator {

    public int evaluate(String expression) {
        int sum = 0;
        for (String value : expression.split("\\+")) {
            sum += Integer.parseInt(value);
        }
        return sum;
    }
}
