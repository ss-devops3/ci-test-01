package com.sseo;

public class MyCiTest2 {
    String version;
    String TestName;

    public MyCiTest2() {
        TestName = "CI Testing";
        version = "0.1";
    }

    public static void main(String[] args) {
        MyCiTest2 myTestObj = new MyCiTest2();

        System.out.println("Hello - version " + myTestObj.version );
    }
}
