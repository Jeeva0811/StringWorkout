public class AppleChar
{
public static void main(String args[])
{
String a="Apple";
char c[]=new char[a.length()];
for(int i=0;i<c.length;i=i+1)
{
c[i]=a.charAt(i);
}
int count=0;
for(int i=0;i<a.length();i=i+1)
{
if(c[i]=='p')
{
count=count+1;
}

}
System.out.println(count);
}
}
