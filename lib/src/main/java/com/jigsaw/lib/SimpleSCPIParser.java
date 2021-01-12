package com.jigsaw.lib;

/**
 * created by Jigsaw at 2021/1/12
 */
public class SimpleSCPIParser extends SCPIParser {
    public SimpleSCPIParser() {
        addHandler("*IDN?", this::IDN);
    }

    String IDN(String[] args) {
        return "Simple SCPI Parser";
    }
}
