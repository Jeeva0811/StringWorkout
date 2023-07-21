public class SeperateChar
{
public static void main(String args[])
{
String s="7e54A6B2R9";
for(int i=0;i<s.length();i=i+1)
{
char c =s.charAt(i);
int asciiValue = (int) c;
if(asciiValue >=65 && asciiValue <=90 || asciiValue>=97 && asciiValue <=122 )
{
System.out.println(s.charAt(i));
}
}
}
}
