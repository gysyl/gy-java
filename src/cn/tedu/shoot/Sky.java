package cn.tedu.shoot;
// 天空类
public class Sky {
    // 定义属性
    int width; // 天空的宽度
    int height; // 天空的高度
    int x; // 天空的x坐标
    int y; // 天空的y坐标
    int speed; // 天空的速度
    int y1; // 第二张图片的y坐标 
    // 定义方法
    void step(){
        // 天空的y坐标移动
        System.out.println("天空的y坐标移动和y1坐标移动了:"+speed);
    }
}
