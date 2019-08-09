import java.util.*;
public class Text20 {
    public static void main(String[] args){
		byte[] a = {1,7,9,11,13,15,17,19};
		byte[] b = {2,4,6,8,10};
		byte[] c = new byte[a.length+b.length];
		System.arraycopy(a,0,c,0,a.length);
		System.arraycopy(b,0,c,a.length,b.length);
		System.out.print(Arrays.toString(c));
	}
	}