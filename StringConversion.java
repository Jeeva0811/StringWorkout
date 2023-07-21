public class StringConversion
{
public static void main(String args[])
{
String s="India";
char c[]=new char[s.length()];
for(int i=0;i<c.length;i=i+1)
{
c[i]=s.charAt(i);
}
for(int i=0;i<c.length;i=i+1)
{
if(i==1)
{
System.out.println((char)(c.charAt(1)-13));
}
if(i==3)
{
System.out.println((char)(c.charAt(3)-8));
}
}
String a="";
for(char k:c)
{
a=a+""+c;
}
}
}
