package javawork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * �ͻ���
 * @author neuedu_yhl
 */
public class Test4 {
	
	// ����һ����������Ž�ɫ��Ϣ
	// ����
	static GamePlayer[] players = {};
	private static Scanner scanner;
	private static Scanner scanner2;
	private static Scanner scanner3;
	private static Scanner scanner1;

	
	public static void main(String[] args) {
		welcome();
	}
	

    // дһ������ �����ӭ����
	public static void welcome() {
		scanner1 = new Scanner(System.in);
		System.out.println("============================");
		System.out.println("==============��ӭ����Ӣ������...==============");
		System.out.println("============================");
		System.out.println("1.��ʼ��Ϸ...");
		System.out.println("2.��Ϸ����...");
		System.out.println("3.������Ϸ...");
		System.out.println("4.�鿴��ɫ��Ϣ");
		System.out.println("5.���ݽ�ɫ���鿴��ɫ��Ϣ");
		System.out.println("6.�޸Ľ�ɫ��Ϣ");
		System.out.println("7.ɾ����ɫ��Ϣ");
		System.out.println("������������еĲ���:(1-7)");
		int nextInt = scanner1.nextInt();
		switch (nextInt) {
		case 1:
			// ִ�п�ʼ��Ϸ
			createNewGame();
			break;

		case 2:
			// ִ�������Ϸ����
			gameRules();
			welcome();
			break;
		case 3:
			//ִ�н�����Ϸ
			gameOver();
			break;
		case 4:
			// �鿴���н�ɫ��Ϣ
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
			System.out.println("��������,����������");
			welcome();
			break;
		}
	}
	/*
	 * ����������Ϸ��ɫ������:���  
	      ��������Ϸ��ɫ������:(1.���� 2.���� 3.���� 4.���� 5.Ԫ��)
	      �����ɹ�!!!
	 * */
	// ������ʼ��Ϸ�ķ���
	private static void createNewGame() {
		scanner2 = new Scanner(System.in);
		System.out.println("����������Ϸ��ɫ������:");
		String name = scanner2.next();
		System.out.println("��������Ϸ��ɫ������:(1.���� 2.���� 3.���� 4.���� 5.Ԫ��)");
	    int race = scanner2.nextInt();
	    // ������Ϸ��ɫ
	    GamePlayer gp = new GamePlayer();
	    gp.name = name;
	    gp.race = race;
	    // ��Ϸ��ɫ��������+1
	    players = Arrays.copyOf(players, players.length+1);
	    players[players.length-1] = gp;
	    // �ж�
	    if(players != null) {
	    	System.out.println("�����ɹ�");
	    	System.out.println("����Ӣ������:"+gp.name);
	    	System.out.println("����Ӣ�������:"+gp.race);
	    	int power = gp.getPower();
	    	System.out.println("����Ӣ��������ʶΪ:"+power);
	    }
	    welcome();
	}
	// ������Ϸ����ķ���
	private static void gameRules() {
		System.out.println("������Ϸ���򡷡�����");
		 welcome();
	}
	
	// ������Ϸ�ķ���
	private static void gameOver() {
		System.exit(0);
	}
	// �鿴���н�ɫ��Ϣ
	private static void printAllCharacters() {
		for(int i=0;i<players.length;i++) {
			System.out.println(players[i]);
		}
		welcome();
	}
	
	// 5.���ݽ�ɫ���鿴��ɫ��Ϣ
	private static void queryCharacterByName() {
		scanner3 = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ�Ľ�ɫ��:");
		String name = scanner3.next();
		for(int i=0;i<players.length;i++) {
			if(players[i].name.equals(name)) {
				System.out.println(players[i]);
			}
		}
		welcome();
	}
	// 6.�޸Ľ�ɫ��Ϣ  ���ݽ�ɫ��ȥ�޸�������Ϣ
	private static void updateCharacterInfoByName() {
		scanner = new Scanner(System.in);
		System.out.println("������Ҫ�޸ĵĽ�ɫ��:");
		String name = scanner.next();
		System.out.println("�������޸ĵ�����:");
		int race = scanner.nextInt();
		for(int i=0;i<players.length;i++) {
			if(players[i].name.equals(name)) {
				// ���޸Ĳ���
				players[i].race = race;
				System.out.println("�޸ĳɹ�");
				System.out.println("�޸ĺ����Ϣ:"+players[i]);
			}
		}
		 welcome();
	}
	
	// 7.ɾ����ɫ��Ϣ
	private static void deleteCharacters() {
scanner2 = new Scanner(System.in);
		System.out.println("������Ҫɾ���Ľ�ɫ��:");
		String name = scanner2.next();
		for(int i=0;i<players.length;i++) {
			if(players[i].name.equals(name)) {
				// ɾ��
				players[i] = players[players.length-1];
				players = Arrays.copyOf(players, players.length-1);
			}
		}
		System.out.println("ɾ�������Ϣ:"+Arrays.toString(players));
		welcome();
	}
}