public class CharChange
{
public static void main(String args[])
{
String a="India";
char c[]=new char[a.length()];
for(int i=0;i<c.length;i=i+1)
{
c[i]=a.charAt(i);
}
for(int i=0;i<a.length();i=i+1)
{
if(c[i]=='I')
{
c[i]='i';
}
if(c[i]=='a')
{
c[i]='A';
}
System.out.print(c[i]);
}
System.out.println();
}
}
