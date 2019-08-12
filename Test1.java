package javawork;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	 public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("欢迎进入png游戏");
	  System.out.println("请输入你要选择的数字");
	  Persion p=new Persion();
	  int a=sc.nextInt();
	  if(a==1) {
	   System.out.println("请开始游戏");
	   System.out.println("请输入您游戏的角色");
	   String name1=sc.next();
	   System.out.println("请输入游戏角色的种族:1.人类 2.精灵 3.兽人 4. 矮人 5.元素");
	   int b=sc.nextInt();
	   System.out.println("恭喜你，创建成功");
	   System.out.println("您的角色是:"+ name1);
	   System.out.println("性别："+ "女");
	   if(b==3) {
	    System.out.println("游戏角色的种族:"+"兽人");
	   }
	   if(b == 4) {
		   System.out.println("游戏的种族");
	   }
	   if(b==2) {
		   System.out.println("游戏角色的种族:"+"精灵");
	   }
	   Random random=new Random();
	   p.strength=random.nextInt(9999);
	   p.agility=random.nextInt(9999);
	   p.intelligence=random.nextInt(9999);
	   p.wisdom=random.nextInt(9999);
	   System.out.println("角色的力量是："+p.strength);
	   System.out.println("角色的敏捷是："+p.agility);
	   System.out.println("角色的智力是："+p.intelligence);
	   System.out.println("角色的智慧是："+p.wisdom); 
	  }if(a==2) {
	   System.out.println("欢迎查看游戏规则："+"系统已坏，请重新创建角色");
	  }if(a==3) {
	   System.out.println("结束游戏");
	  }
	  
	 }

	}
	class Persion{
	 String name;
	 char sex;
	 String race;//种族
	 String profession;//职业
	    int strength;//力量
	 int agility;//敏捷
	 int  Stamina;//体力
	 int  intelligence;//智力
	 int  wisdom;            //智慧
	 int life;            // 生命值
	 int   magic;        //魔法值
	 
	 
	}