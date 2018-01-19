class3_noisinarray_indresh
{
public static void main(String[] args)
{
int n,i;
n=Integer.parseInt(args[0]);
int arr[]={1,4,6,7,8,9,10};
boolean size=true;
for(i=0;i<arr.length;i++)
{
if(arr[i]==n)
{
System.out.println("entered no. is in the array");
size=false;
}
}
if(size)
System.out.println("entered no. is not in the array");
}
}


