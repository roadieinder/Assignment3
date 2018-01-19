class xyz
{
public static void main(String[] args)
{
int i,n,j;
n=Integer.parseInt(args[0]);
for(i=2;i<n-1;i++)
{
boolean prime=true;
for(j=2;j<i;j++)
{
if(i%j==0)
prime=false;
}
if(prime)
System.out.println(i);
}
}
}