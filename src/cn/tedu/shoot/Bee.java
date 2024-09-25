package cn.tedu.shoot;
import java.util.Random;
// 小蜜蜂类
public class Bee extends FlyingObject{
    // 定义属性
    // int x; // 小蜜蜂的x坐标
    // int y; // 小蜜蜂的y坐标
    // int width; // 小蜜蜂的宽度
    // int height; // 小蜜蜂的高度
    int xSpeed; // 小蜜蜂x坐标移动速度
    int ySpeed; // 小蜜蜂y坐标移动速度
    int awardType; // 小蜜蜂的奖励类型
    // int blood; // 小蜜蜂的血量
    // boolean isLive; // 小蜜蜂是否活着

    Bee(){
        super(60,50);
        xSpeed = 1;
        ySpeed = 2;
        Random rand = new Random();
        awardType = rand.nextInt(2);
    }

   
}
