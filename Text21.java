public class Text21{
	public static void main(String[] args){
	for(int i=100;i<1000;i++){
		int result =(int)Math.pow(i%10,3)+(int)Math.pow(i/10%10,3)+(int)Math.pow(i/100,3);
		if(i == result){
			System.out.println(i);
		}
	}
	}
}