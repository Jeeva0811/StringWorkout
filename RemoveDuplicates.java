public class RemoveDuplicates
{
public static void main(String args[])
{
String s = "SSQQQL";
char c[]=new char[s.length()];
for(int i=0;i<c.length;i=i+1)
{
c[i]=s.charAt(i);
}
for(int i=0;i<s.length();i=i+1)
{
for(int j=i+1;j<s.length();j=j+1)
{
if(c[i]==c[j])
{
c[j]=' ';
}

}
}
for(char i:c)
{
if(i!=' ')
{
System.out.print(i);

}
}
System.out.println();
}
}
