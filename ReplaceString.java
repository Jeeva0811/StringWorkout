public class ReplaceString
{
public static void main(String args[])
{
String s = "India is my country and America is a foreign country";
String a[]=s.split(" ");
String f="foreign";
String d="Developed";
s="";
for(int i=0;i<a.length;i=i+1)
{
if(a[i].equals(f))
{
a[i]=d;
}
s=s+" "+a[i];
System.out.println(a[i]);
}
System.out.print(s);
}
}
