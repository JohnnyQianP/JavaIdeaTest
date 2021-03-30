package com.spboot.demotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class DemotestApplication  {

    /*多行注释
     */
    public static void main(String[] args) {
        System.out.println("ok");
        SpringApplication.run(DemotestApplication.class, args);
    }

    /**测试方法
     * @author xxy
     * @return xxx 文档注释，能被javadoc解析
     */
    public static String testMethod()
    {
        int i = 0;
        Integer ii = i;//包裹类型
//        System.out.println("v is:" + (i++));
//        System.out.println("v is:" + (i));
        String s1 = "1";
        String s2 = "2";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s2));
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(23);
        lists.add(23);
        // or  ArrayList lists = new ArrayList();
        for (Integer o : lists)    {
            if (o == null) {

            }
        }
//        StringBuilder sb = new StringBuilder();
//String
        return "ok";
    }
}
