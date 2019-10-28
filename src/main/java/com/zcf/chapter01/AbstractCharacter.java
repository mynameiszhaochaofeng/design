package com.zcf.chapter01;

/**
 * @author zhaochaofeng
 * @date 2019/10/28 9:31
 */
public abstract class AbstractCharacter {
    protected WeaponBehavior weapon;

    void setWeapon(WeaponBehavior w){
        this.weapon = w;
    }

    abstract void fight();

}
