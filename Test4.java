package javawork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 客户端
 * @author neuedu_yhl
 */
public class Test4 {
	
	// 创建一个容器来存放角色信息
	// 数组
	static GamePlayer[] players = {};
	private static Scanner scanner;
	private static Scanner scanner2;
	private static Scanner scanner3;
	private static Scanner scanner1;

	
	public static void main(String[] args) {
		welcome();
	}
	

    // 写一个方法 输出欢迎界面
	public static void welcome() {
		scanner1 = new Scanner(System.in);
		System.out.println("============================");
		System.out.println("==============欢迎来到英雄联盟...==============");
		System.out.println("============================");
		System.out.println("1.开始游戏...");
		System.out.println("2.游戏规则...");
		System.out.println("3.结束游戏...");
		System.out.println("4.查看角色信息");
		System.out.println("5.根据角色名查看角色信息");
		System.out.println("6.修改角色信息");
		System.out.println("7.删除角色信息");
		System.out.println("请输入您想进行的操作:(1-7)");
		int nextInt = scanner1.nextInt();
		switch (nextInt) {
		case 1:
			// 执行开始游戏
			createNewGame();
			break;

		case 2:
			// 执行输出游戏规则
			gameRules();
			welcome();
			break;
		case 3:
			//执行结束游戏
			gameOver();
			break;
		case 4:
			// 查看所有角色信息
			printAllCharacters();
			break;
		case 5:
			queryCharacterByName();
			break;
		case 6:
			updateCharacterInfoByName();
			break;
		case 7:
			deleteCharacters();
			break;
		default:
			System.out.println("输入有误,请重新输入");
			welcome();
			break;
		}
	}
	/*
	 * 请输入您游戏角色的姓名:李白  
	      请输入游戏角色的种族:(1.人类 2.精灵 3.兽人 4.矮人 5.元素)
	      创建成功!!!
	 * */
	// 创建开始游戏的方法
	private static void createNewGame() {
		scanner2 = new Scanner(System.in);
		System.out.println("请输入您游戏角色的姓名:");
		String name = scanner2.next();
		System.out.println("请输入游戏角色的种族:(1.人类 2.精灵 3.兽人 4.矮人 5.元素)");
	    int race = scanner2.nextInt();
	    // 构建游戏角色
	    GamePlayer gp = new GamePlayer();
	    gp.name = name;
	    gp.race = race;
	    // 游戏角色容器长度+1
	    players = Arrays.copyOf(players, players.length+1);
	    players[players.length-1] = gp;
	    // 判断
	    if(players != null) {
	    	System.out.println("创建成功");
	    	System.out.println("您的英雄名叫:"+gp.name);
	    	System.out.println("您的英雄种族叫:"+gp.race);
	    	int power = gp.getPower();
	    	System.out.println("您的英雄力量初识为:"+power);
	    }
	    welcome();
	}
	// 创建游戏规则的方法
	private static void gameRules() {
		System.out.println("这是游戏规则》。。。");
		 welcome();
	}
	
	// 结束游戏的方法
	private static void gameOver() {
		System.exit(0);
	}
	// 查看所有角色信息
	private static void printAllCharacters() {
		for(int i=0;i<players.length;i++) {
			System.out.println(players[i]);
		}
		welcome();
	}
	
	// 5.根据角色名查看角色信息
	private static void queryCharacterByName() {
		scanner3 = new Scanner(System.in);
		System.out.println("请输入要查询的角色名:");
		String name = scanner3.next();
		for(int i=0;i<players.length;i++) {
			if(players[i].name.equals(name)) {
				System.out.println(players[i]);
			}
		}
		welcome();
	}
	// 6.修改角色信息  根据角色名去修改种族信息
	private static void updateCharacterInfoByName() {
		scanner = new Scanner(System.in);
		System.out.println("请输入要修改的角色名:");
		String name = scanner.next();
		System.out.println("请输入修改的种族:");
		int race = scanner.nextInt();
		for(int i=0;i<players.length;i++) {
			if(players[i].name.equals(name)) {
				// 做修改操作
				players[i].race = race;
				System.out.println("修改成功");
				System.out.println("修改后的信息:"+players[i]);
			}
		}
		 welcome();
	}
	
	// 7.删除角色信息
	private static void deleteCharacters() {
scanner2 = new Scanner(System.in);
		System.out.println("请输入要删除的角色名:");
		String name = scanner2.next();
		for(int i=0;i<players.length;i++) {
			if(players[i].name.equals(name)) {
				// 删除
				players[i] = players[players.length-1];
				players = Arrays.copyOf(players, players.length-1);
			}
		}
		System.out.println("删除后的信息:"+Arrays.toString(players));
		welcome();
	}
}