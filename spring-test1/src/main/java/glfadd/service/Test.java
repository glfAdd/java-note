package glfadd.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Map<String, Objects> a = new HashMap<>();
//        String aaa = a.get("kk").toString();
        Object bbb = a.get("kk");
        String ccc = bbb == null ? "" : bbb.toString();

        System.out.println("123123");
    }
}
