package cn.tedu.shoot;
// 整个游戏的世界类
public class World {
    Sky sky; // 天空对象
    Hero hero; // 英雄机对象
    // 创建小敌机数组
    Airplane[] as;
    // 创建大敌机数组
    BigAirplane[] bas;
    // 创建蜜蜂数组
    Bee[] bs;
    // 创建子弹数组
    Bullet[] bts;
    // 创建子弹数组
    // Airplane a1; // 小敌机对象
    // Airplane a2; // 小敌机对象
    // BigAirplane ba1; // 大敌机对象
    // BigAirplane ba2; // 大敌机对象
    // Bee b1; // 蜜蜂对象
    // Bee b2; // 蜜蜂对象
    // Bullet bt1; // 子弹数组对象
    // Bullet bt2; // 子弹数组对象

    void action(){
        // 初始化小敌机数组
        as = new Airplane[3];
        // 初始化小敌机数组中的小敌机对象
        for (int i = 0; i < as.length; i++) {
            as[i] = new Airplane();
            System.out.println("小敌机的x坐标:" + as[i].x + ", 小敌机的y坐标:" + as[i].y + ", 小敌机的速度:" + as[i].speed);
        }
        // 初始化大敌机数组
        bas = new BigAirplane[2];
        // 初始化蜜蜂数组
        bs = new Bee[2];
        // 初始化子弹数组
        bts = new Bullet[2];
        // 初始化小敌机数组中的小敌机对象
        /* sky = new Sky();
        sky.width = 400;
        sky.height = 700;
        sky.x = 0;
        sky.y = 0;
        sky.y1 = -700;
        sky.speed = 1;
        sky.step();
        
        hero = new Hero();
        hero.width = 97;
        hero.height = 124;
        hero.x = 140;
        hero.y = 400;
        hero.life = 3;
        hero.doubleFire = 0;
        hero.step();
        hero.moveTo(100, 200);

        a1 = new Airplane();
        a1.width = 49;
        a1.height =68;
        a1.x = 120;
        a1.y = 300;
        a1.speed = 2;
        a1.step();

        a2 = new Airplane();
        a2.width = 49;
        a2.height =68;
        a2.x = 200;
        a2.y = 300;
        a2.speed = 2;
        a2.step();

        ba1 = new BigAirplane();
        ba1.width = 100;
        ba1.height = 150;
        ba1.x = 100;
        ba1.y = 100;
        ba1.speed = 2;
        ba1.step();

        ba2 = new BigAirplane();
        ba2.width = 100;
        ba2.height = 150;
        ba2.x = 200;
        ba2.y = 100;
        ba2.speed = 2;
        ba2.step();

        b1 = new Bee();
        b1.width = 50;
        b1.height = 50;
        b1.x = 100;
        b1.y = 100; 
        b1.xSpeed = 2;
        b1.ySpeed = 2;
        b1.step();

        b2 = new Bee(); 
        b2.width = 50;
        b2.height = 50;
        b2.x = 200;
        b2.y = 100;
        b2.xSpeed = 2;
        b2.ySpeed = 2;
        b2.step();

        bt1 = new Bullet();
        bt1.width = 10;
        bt1.height = 20;
        bt1.x = 100;
        bt1.y = 100;
        bt1.speed = 2;
        bt1.step();

        bt2 = new Bullet();
        bt2.width = 10;
        bt2.height = 20;
        bt2.x = 200;
        bt2.y = 100;
        bt2.speed = 2;
        bt2.step();   */

        sky = new Sky();
        hero = new Hero();

        // a1 = new Airplane();
        // a2 = new Airplane();
        // ba1 = new BigAirplane();
        // ba2 = new BigAirplane();
        // b1 = new Bee();
        // b2 = new Bee();
        // bt1 = new Bullet(1,2);
        // bt2 = new Bullet(11,55);

        // // 输出天空的所有属性        
        // System.out.println("天空的宽度:" + sky.width + ", 天空的高度:" + sky.height + ", 天空的x坐标:" + sky.x + ", 天空的y坐标:" + sky.y + ", 天空的y1坐标:" + sky.y1 + ", 天空的速度:" + sky.speed);

        // // 输出英雄机的所有属性
        // System.out.println("英雄机的宽度:" + hero.width + ", 英雄机的高度:" + hero.height + ", 英雄机的x坐标:" + hero.x + ", 英雄机的y坐标:" + hero.y + ", 英雄机的生命:" + hero.life + ", 英雄机的双倍火力:" + hero.doubleFire);

        // // 输出小敌机的所有属性
        // System.out.println("小敌机a1的宽度:" + a1.width + ", 小敌机a1的高度:" + a1.height + ", 小敌机a1的x坐标:" + a1.x + ", 小敌机a1的y坐标:" + a1.y + ", 小敌机a1的速度:" + a1.speed);
        // System.out.println("小敌机a2的宽度:" + a2.width + ", 小敌机a2的高度:" + a2.height + ", 小敌机a2的x坐标:" + a2.x + ", 小敌机a1的y坐标:" + a2.y + ", 小敌机a2的速度:" + a2.speed);

        // // 调用天空的step方法
        // sky.step();
        // // 调用英雄机的step方法
        // hero.step();
        // // 调用小敌机的step方法
        // a1.step();
        // a2.step();
        // // 调用大敌机的step方法
        // ba1.step();
        // ba2.step();
        // // 调用蜜蜂的step方法
        // b1.step();      
    }

    public static void main(String[] args) {
        World world = new World();
        world.action();
    }

}
