public class WordPresent
{
public static void main(String args[])
{
String s="India is the 7th largest country in the world, In india the second largest city is Mumbai";
int count=0;
int count1=0;
for(int i=0;i<s.length();i=i+1)
{
if(s.charAt(i)==' ' && s.charAt(i+1)=='i' && s.charAt(i+2)=='s' && s.charAt(i+3)==' ' )
{
count =count+1;
}
if(s.charAt(i)==' ' && s.charAt(i+1)=='t' && s.charAt(i+2)=='h' && s.charAt(i+3)=='e' && s.charAt(i+4)==' ')
{
count1=count1+1;
}
}
System.out.println(count);
System.out.println(count1);
}
}
