public class Text15{
	public static void main(String[] args){
		int num = 56123;
		String changedNum = String.valueOf(num);
		// 将String类型转为StringBuffer
		StringBuffer stringBuffer = new StringBuffer(changedNum);
		StringBuffer stringBuffer2 = stringBuffer.reverse();
		// 将StringBuffer转为int类型
		// 将StringBuffer转为String
		String str = stringBuffer2.toString();
		// 将String转为int类型
		int finalNum = Integer.parseInt(str);
		System.out.print(finalNum);
}
	
}