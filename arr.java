import java.util.Scanner;
public class JavaApplication3 {
public static void main(String[] args) {
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int a[]=new int[num];
int temp=0;
for(int i=0;i<num;i++)
{
a[i]=s.nextInt();
}
int b[]=new int[num];
for(int i=0;i<num;i++)
{
for(int j=i+1;j<num;j++)
{
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int i=0;i<num;i++)
{
 System.out.print(a[i]);
}		
} 
}
}
