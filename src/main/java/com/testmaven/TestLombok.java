package com.testmaven;

import lombok.Getter;
import lombok.Setter;

public class TestLombok {

    @Getter
    @Setter
    public String str1;

    public TestLombok() {
    }

    public TestLombok(String str1) {
        this.str1 = str1;
    }

    public String returnAStr(String str1) {
        String rst = str1;
        return rst;
    }

    /*
    中文注释UTF8，应该可以正常显示
     */
    public static void main(String[] args) {
        
    }

}
