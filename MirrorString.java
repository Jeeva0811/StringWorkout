public class MirrorString
{
public static void main(String args[])
{
String s = "United states of America";
for(int i=s.length()-1;i>=0;i=i-1)
{
System.out.print(s.charAt(i));
}
}
}
