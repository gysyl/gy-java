package cn.tedu.shoot;
import java.util.Random;
// 小敌机类
public class Airplane extends FlyingObject {
    // 定义属性
    // int x; // 小敌机的x坐标
    // int y; // 小敌机的y坐标
    // int width; // 小敌机的宽度
    // int height; // 小敌机的高度
    int speed; // 小敌机的速度
    // int blood; // 小敌机的血量
    // boolean isLive; // 小敌机是否活着
  
    Airplane(){
        super(49,36);
        speed = 2;
    }

    // 定义方法
    void step(){
        // 小敌机的y坐标移动
        System.out.println("小敌机的y坐标移动啦:"+speed);
    }
}
