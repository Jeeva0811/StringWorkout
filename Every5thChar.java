public class Every5thChar
{
public static void main(String args[])
{
String a="United States Of America";
for(int i=5-1;i<a.length();i=i+5)
{
System.out.println(a.charAt(i));
}
}
}
