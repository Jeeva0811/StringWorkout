public class OppositeCase
{
public static void main(String args[])
{
String s="InDiAna";
for(int i=0;i<s.length();i=i+1)
{
char c= s.charAt(i);
int asciiValue =(int) c;
if(asciiValue>=65 && asciiValue<=90)
{
System.out.println(c.toLowerCase());
}

}
}
}
