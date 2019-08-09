import java.util.*;
public class Text16{
	public static void main(String[] args){
	 char[ ] chs = {'统','计','一','个','字','符','在','字','符','串','中'};
	Scanner scanner = new Scanner(System.in);
	System.out.print("请输入查找的字符");
	String content = scanner.next();
	char first = content.charAt(0);
	byte [] pos = {};
	for(int i=0;i<chs.length;i++){
		if(first == chs[i] ){
			pos = Arrays.copyOf(pos,pos.length+1);
			pos[pos.length-1] = (byte)i;
		}
	}
	System.out.print(Arrays.toString(pos));
	}
}