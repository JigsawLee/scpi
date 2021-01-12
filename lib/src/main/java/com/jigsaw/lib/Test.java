package com.jigsaw.lib;

/**
 * created by Jigsaw at 2021/1/12
 */
public class Test {
    public static void main(String[] args) throws SCPIParser.SCPIMissingHandlerException {
        System.out.println("hello world");
        SimpleSCPIParser myParser = new SimpleSCPIParser();
        for (String result : myParser.accept("*IDN?")) {
            System.out.println(result);
        }
    }
}
