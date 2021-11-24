package com.duing.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {

    public static void main(String[] args) {
        BasicTextEncryptor basic =new BasicTextEncryptor();
        basic.setPassword("wd");
        String username=basic.encrypt("root");
        String password=basic.encrypt("123");
        System.out.println(username);
        System.out.println(password);

    }
}
