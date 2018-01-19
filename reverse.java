class3_reverse_indresh
{
public static void main(String[] args)
{
int n=Integer.parseInt(args[0]);
int r;
int s=0;
while(n>0)
{
r=n%10;
n=n/10;
s=s*10+r;
}
System.out.print(" reverse value is "+s);
}
}