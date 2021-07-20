import java.util.*;
public class Duplicatefrequency
{
public static void countdupfreq(int a[],int n)
{
Map<Integer,Integer> h=new HashMap<>();
for(int i=0;i<n;i++)
{
if(h.containsKey(a[i]))
{
h.put(a[i],h.get(a[i])+1);
}
else
{
h.put(a[i],1);
}
}
for(int i=0;i<n;i++)
{
if(h.get(a[i])==1)
{
h.remove(a[i]);
}
}
System.out.println(h);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array : ");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter array elements : ");
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
countdupfreq(a,n);
}
}

output1:

Enter size of array : 
12
Enter array elements : 
2 3 4 5 4 6 4 7 4 5 6 6
{4=4, 5=2, 6=3}

output2:
Enter size of array : 
5
Enter array elements : 
4 4 5 5 6
{4=2, 5=2}