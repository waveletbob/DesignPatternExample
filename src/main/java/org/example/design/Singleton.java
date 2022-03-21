package org.example.design;

/**
 * @author game-netease
 * @date 2022/3/21
 */
public class Singleton {

    private static Singleton instance=new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton.getInstance();
    }
}
