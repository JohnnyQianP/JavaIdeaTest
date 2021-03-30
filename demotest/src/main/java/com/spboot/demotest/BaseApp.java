package com.spboot.demotest;

/**
 * @author johnnyqian
 * @date 2021/3/27 14:46
 */
public class BaseApp {
    //bean: Code=>generate 自动生成constructor
    public BaseApp(String userName) {
        this.userName = userName;
    }

    private String userName;

//    public BaseApp(String userName){
//        this.userName = userName;
//    }
    public String getuserName(){
        return userName;
    }

    public void setint(int a){

    }public void setinta(Integer a){

    }
}
