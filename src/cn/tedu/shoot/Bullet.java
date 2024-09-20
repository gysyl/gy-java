package cn.tedu.shoot;
// 子弹类
public class Bullet {
    // 定义属性
    int x; // 子弹的x坐标
    int y; // 子弹的y坐标
    int width; // 子弹的宽度
    int height; // 子弹的高度
    int speed; // 子弹的速度
    // boolean isLive; // 子弹是否活着

    // 定义方法
    void step(){
        // 子弹的y坐标移动
        System.out.println("子弹的y坐标移动啦:"+speed);
}
}