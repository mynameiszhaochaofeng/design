package com.zcf.chapter01;

/**
 * 设计模式入门
 * 使用接口开发，设计代码
 * @author zhaochaofeng
 * @date 2019/10/28 9:46
 */
public class Main {

    public static void main(String[] args) {
        King king = new King();
        Queen queen = new Queen();
        Troll troll = new Troll();
        Knight knight = new Knight();
        king.fight();
        queen.fight();
        troll.fight();
        knight.fight();
    }

}
