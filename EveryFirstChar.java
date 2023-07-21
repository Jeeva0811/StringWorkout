public class EveryFirstChar
{
public static void main(String args[])
{
String a="United States Of America";

//String x[]=a.split(" ");

/*for(String y:x)
{
System.out.println(y.charAt(0));
}*/

/*for(int i=0;i<x.length;i=i+1)
{
System.out.println(x[i].charAt(0));
}  */

System.out.println(a.charAt(0));
for(int i=0;i<a.length();i=i+1)
{
if(a.charAt(i)==' ')
{
System.out.println(a.charAt(i+1));
}
}
}
}
