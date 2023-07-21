public class MultiCharReplace
{
public static void main(String args[])
{
String s="Narayana swamy resigned as chief minister from pondicherry";
char c[]=s.toCharArray();
for(int i=0;i<c.length;i=i+1)
{
if(c[i]=='s')
{
c[i]='$';
}
if(c[i]=='a')
{
c[i]='@';
}
if(c[i]=='i')
{
c[i]='I';
}
if(c[i]=='y')
{
c[i]='i';
}
if(c[i]=='r')
{
c[i]='R';
}
//System.out.print(c[i]);
}
for(char i:c)
{
System.out.print(i);
}
}
}

