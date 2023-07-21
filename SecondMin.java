public class SecondMin
{
public static void main(String args[])
{
int a[]={3,55,35,78,97,97,99,100,4,7,99};
for(int i=0;i<a.length;i=i+1)
{
for(int j=i+1;j<a.length;j=j+1)
{
if(a[i]==a[j])
{
a[j]=0;

}
if(a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
System.out.print(a[i]+",");

}
System.out.println();

for(int i=0;i<a.length;i=i+1)
{
if(a[i]!=0)
{
System.out.print(a[i]+",");
}
}
System.out.println();
System.out.println(a[1]);
}
}
