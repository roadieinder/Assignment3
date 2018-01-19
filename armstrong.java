import java.lang.Math;
class armstrong
{
public static void main(String[] args)
{
int n,r,a=0,s=0,t;
n=Integer.parseInt(args[0]);
t=n;
while(n>0)
{
n=n/10;
a++;
}
n=t;
while(n>0)
{
r=n%10;
s=s+(int)Math.pow(r,a);
n=n/10;
}
if(t==s)
System.out.print("pallindrome");
else
System.out.print("not a pallindrome");
}
}