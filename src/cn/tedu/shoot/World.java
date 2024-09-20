package cn.tedu.shoot;
// 整个游戏的世界类
public class World {
    Sky sky; // 天空对象
    Hero hero; // 英雄机对象
    Airplane a1; // 小敌机对象
    Airplane a2; // 小敌机对象
    BigAirplane ba1; // 大敌机对象
    BigAirplane ba2; // 大敌机对象
    Bee b1; // 蜜蜂对象
    Bee b2; // 蜜蜂对象
    Bullet bt1; // 子弹数组对象
    Bullet bt2; // 子弹数组对象

    void action(){
        sky = new Sky();
        sky.width = 400;
        sky.height = 700;
        sky.x = 0;
        sky.y = 0;
        sky.y1 = -700;
        sky.speed = 1;
        sky.step();
        hero = new Hero();
    }

    public static void main(String[] args) {
        World world = new World();
        world.action();
    }

}
