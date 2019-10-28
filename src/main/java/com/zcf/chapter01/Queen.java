package com.zcf.chapter01;

/**
 * 女王使用弓箭
 * @author zhaochaofeng
 * @date 2019/10/28 9:35
 */
public class Queen extends AbstractCharacter {
    public Queen() {
        setWeapon(new BowAndArrowBehavior());
    }
    @Override
    void fight() {
        super.weapon.useWeapon();
    }
}
