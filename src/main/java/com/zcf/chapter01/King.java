package com.zcf.chapter01;

/**
 * 国王使用大宝剑
 * @author zhaochaofeng
 * @date 2019/10/28 9:40
 */
public class King extends AbstractCharacter {
    public King() {
        setWeapon(new SwordBehavior());
    }
    @Override
    void fight() {
        super.weapon.useWeapon();
    }
}
