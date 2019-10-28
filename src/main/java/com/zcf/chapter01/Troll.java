package com.zcf.chapter01;

/**
 * 巨魔使用斧头
 * @author zhaochaofeng
 * @date 2019/10/28 9:41
 */
public class Troll extends AbstractCharacter{
    public Troll() {
        setWeapon(new AxeBehavior());
    }

    @Override
    void fight() {
        super.weapon.useWeapon();
    }
}
