import java.util.*;

public class Text25{
    public static void main(String[] args){
		int[] nums = {-1,999,100,76,88};
	    int[] newArr = bubbleSort(nums);
		System.out.print(Arrays.toString(newArr));
	}
	//�������
	//����Ϊ�����һ������
	//���δ� ����ֵ���� ������(�����б�){
	//	������;
	//}
	public static int[] bubbleSort(int[] arr){
	    for(int i=0;i<arr.length-1;++i){
			//int[] nums = {-1,999,100,76,88};
			for(int j=0;j<arr.length-1-i;j++)
			{
			    //�Ƚ�
                if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}				
			} 
		}
		return arr;
	}
}