package cn.tedu.shoot;
// 小蜜蜂类
public class Bee {
    // 定义属性
    int x; // 小蜜蜂的x坐标
    int y; // 小蜜蜂的y坐标
    int width; // 小蜜蜂的宽度
    int height; // 小蜜蜂的高度
    int xSpeed; // 小蜜蜂x坐标移动速度
    int ySpeed; // 小蜜蜂y坐标移动速度
    int awardType; // 小蜜蜂的奖励类型
    // int blood; // 小蜜蜂的血量
    // boolean isLive; // 小蜜蜂是否活着

    // 定义方法
    void step(){
        // 小蜜蜂的x坐标移动
        System.out.println("小蜜蜂的x坐标移动啦:"+xSpeed);
        // 小蜜蜂的y坐标移动
        System.out.println("小蜜蜂的y坐标移动啦:"+ySpeed);
    }
}
