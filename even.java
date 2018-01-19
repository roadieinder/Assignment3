class indresh
{
public static void main(String[] args)
{
int n,i,k,index=0;
n=Integer.parseInt(args[0]);
int arr[]={2,4,5,10,7,8,1,3,6,9};
for(i=0;i<arr.length;i++)
{
if(arr[i]==n)
index=i;
}
for(k=0;k<=index;k++)
{
if(arr[k]%2==0)
System.out.println(arr[k]);
}
}
}