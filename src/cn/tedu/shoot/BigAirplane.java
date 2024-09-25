package cn.tedu.shoot;
import java.util.Random;
// 大敌机类
public class BigAirplane extends FlyingObject {
    // 定义属性
    // int x; // 大敌机的x坐标
    // int y; // 大敌机的y坐标
    // int width; // 大敌机的宽度
    // int height; // 大敌机的高度
    int speed; // 大敌机的速度
    // int blood; // 大敌机的血量
    // boolean isLive; // 大敌机是否活着

    // 定义构造方法
    BigAirplane(){
        super(69, 99);
        speed = 2;
    }

}
