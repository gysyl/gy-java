
package cn.tedu.shoot;
import java.util.Random;
// 飞行物类
public class FlyingObject {
    int width; // 飞行物的宽度
    int height; // 飞行物的高度
    int x; // 飞行物的x坐标
    int y; // 飞行物的y坐标

    // 构造方法 专门给英雄机,天空,子弹使用
    public FlyingObject(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }
    
    // 构造方法 专门给小敌机和大敌机,小蜜蜂使用
    public FlyingObject(int width, int height) {
        this.width = width;
        this.height = height;
        Random rand = new Random();
        x = rand.nextInt(400-this.width);
        y = -this.height;
    }

    // 移动飞行物
    void step(){
        // 飞行物移动
        System.out.println("飞行物移动了!");
    }
    // 判断飞行物是否越界
}
