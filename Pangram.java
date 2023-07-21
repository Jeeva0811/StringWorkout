public class Pangram
{
public static void main(String args[])
{
String s="The quick brown fox jumps over the lazy dog ";

String check="abcdefghijklmnopqrstuvwxyz";
s=s.toLowerCase();
System.out.print(s);
System.out.println();
char c[]=new char[s.length()];
for(int i=0;i<c.length;i=i+1)
{
c[i]=s.charAt(i);
}

for(int i=0;i<c.length;i=i+1)
{
for(int j=i+1;j<c.length;j=j+1)
{
if(c[i]>c[j])
{
char temp=c[i];
c[i]=c[j];
c[j]=temp;
}
if(c[i]==c[j])
{
c[j]=' ';
}
}
}

String x="";
for(char k:c)
{
if(k!=' ')
{
x=x+""+k;
}
}
System.out.println(x);
if(x.equals(check))
{
System.out.println("Pangram");
}
else
{
System.out.println("Not Pangram");
}
}
}


/*OutPut.....

the quick brown fox jumps over the lazy dog 
abcdefghijklmnopqrstuvwxyz
Pangram

*/
