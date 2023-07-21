public class Unicode
{
public static void main(String args[])
{
String s="java";
for(int i=0;i<s.length();i=i+1)
{
char c=s.charAt(i);
int asciiValue =(int) c;
System.out.println(c + ":" + asciiValue);
}
}
}
