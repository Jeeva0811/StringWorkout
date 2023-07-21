public class EveryLastChar
{
public static void main(String args[])
{
String a="United States Of America";

//String x[]=a.split(" ");

/*for(int i=0;i<x.length;i=i+1)
{
System.out.println(x[i].charAt(x[i].length()-1));
} */

/*for(String j:x)
{
//System.out.println(j);
System.out.println(j.charAt(j.length()-1));
}  */
for(int i=0;i<a.length();i=i+1)
{
if(a.charAt(i)==' ')
{
System.out.println(a.charAt(i-1));

}
}
System.out.println(a.charAt(a.length()-1));
}
}
