package com.zcf.chapter01;

/**
 * 骑士使用匕首
 * @author zhaochaofeng
 * @date 2019/10/28 9:44
 */
public class Knight extends AbstractCharacter{
    public Knight() {
        setWeapon(new KnifeBehavior());
    }
    @Override
    void fight() {
        super.weapon.useWeapon();
    }
}
