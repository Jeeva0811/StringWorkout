public class UnicodeValue
{
public static void main(String args[])
{
String s="Venezuela";
for(int i=0;i<s.length();i=i+1)
{
char c = s.charAt(i);
int asciiValue = (int) c;

if(asciiValue %2==0)
{
System.out.println(c +":" +asciiValue);
}

}
}
}
