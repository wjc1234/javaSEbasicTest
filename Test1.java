package javawork;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	 public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("��ӭ����png��Ϸ");
	  System.out.println("��������Ҫѡ�������");
	  Persion p=new Persion();
	  int a=sc.nextInt();
	  if(a==1) {
	   System.out.println("�뿪ʼ��Ϸ");
	   System.out.println("����������Ϸ�Ľ�ɫ");
	   String name1=sc.next();
	   System.out.println("��������Ϸ��ɫ������:1.���� 2.���� 3.���� 4. ���� 5.Ԫ��");
	   int b=sc.nextInt();
	   System.out.println("��ϲ�㣬�����ɹ�");
	   System.out.println("���Ľ�ɫ��:"+ name1);
	   System.out.println("�Ա�"+ "Ů");
	   if(b==3) {
	    System.out.println("��Ϸ��ɫ������:"+"����");
	   }
	   if(b == 4) {
		   System.out.println("��Ϸ������");
	   }
	   if(b==2) {
		   System.out.println("��Ϸ��ɫ������:"+"����");
	   }
	   Random random=new Random();
	   p.strength=random.nextInt(9999);
	   p.agility=random.nextInt(9999);
	   p.intelligence=random.nextInt(9999);
	   p.wisdom=random.nextInt(9999);
	   System.out.println("��ɫ�������ǣ�"+p.strength);
	   System.out.println("��ɫ�������ǣ�"+p.agility);
	   System.out.println("��ɫ�������ǣ�"+p.intelligence);
	   System.out.println("��ɫ���ǻ��ǣ�"+p.wisdom); 
	  }if(a==2) {
	   System.out.println("��ӭ�鿴��Ϸ����"+"ϵͳ�ѻ��������´�����ɫ");
	  }if(a==3) {
	   System.out.println("������Ϸ");
	  }
	  
	 }

	}
	class Persion{
	 String name;
	 char sex;
	 String race;//����
	 String profession;//ְҵ
	    int strength;//����
	 int agility;//����
	 int  Stamina;//����
	 int  intelligence;//����
	 int  wisdom;            //�ǻ�
	 int life;            // ����ֵ
	 int   magic;        //ħ��ֵ
	 
	 
	}