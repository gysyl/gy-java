package cn.tedu.shoot;
// 子弹类
public class Bullet extends FlyingObject {
    // 定义属性
    // int x; // 子弹的x坐标
    // int y; // 子弹的y坐标
    // int width; // 子弹的宽度
    // int height; // 子弹的高度
    int speed; // 子弹的速度
    // boolean isLive; // 子弹是否活着

    // 定义构造方法
    Bullet(int x,int y){
        super(8,14,x,y);        
        speed = 3;
    }


}