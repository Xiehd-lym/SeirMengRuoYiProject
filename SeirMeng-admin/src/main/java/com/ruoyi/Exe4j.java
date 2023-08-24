package com.ruoyi;

import java.util.Properties;

/**
 * 打包程序
 */
public class Exe4j {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        String osName = properties.getProperty("os.name");
        System.out.println (osName);

        try {
            if (osName.indexOf("Linux") != -1) {
                Runtime.getRuntime().exec("step:htmlview");
            } else if (osName.indexOf("Windows") != -1){
                Runtime.getRuntime().exec("explorer http://localhost:18090/SeirMengRuoYi/index");
            } else {
                throw new RuntimeException("Unknown OS.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
