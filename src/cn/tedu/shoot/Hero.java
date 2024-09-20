package cn.tedu.shoot;

// 英雄机类
public class Hero {
    // 定义属性
    int x; // 英雄机的x坐标
    int y; // 英雄机的y坐标
    int width; // 英雄机的宽度
    int height; // 英雄机的高度 
    int life; // 英雄机的生命值
    int doubleFire; // 英雄机的火力值
    
    // 定义方法
    void step(){
        // 切换图片
        System.out.println("英雄机切换图片啦");
    }
     
    
    public void moveTo(int x, int y) {
        // 英雄机随着鼠标移动到指定位置
        // this.x = x;
        // this.y = y;
        System.out.println("英雄机移动到(" + x + "," + y + ")");
    }

    
}