package javawork;
public static void main(String[] args){
int[] nums = {
1,3,5
};
int a = 3;
System.out.println("�����"
ֵ:"+Arrays.toString(nums));
System.out.println("a��"
ֵ:"+a);
updateNum(a);
updateArray(nums);
System.out.println("�����"
ֵ:"+Arrays.toString(nums));
System.out.println("a��"
ֵ:"+a);
}
public static void updateNum(int
a)
{
a = 10;
}
public static void
updateArray(int[] a)
{
a[0] = 10;
}