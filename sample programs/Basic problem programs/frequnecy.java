import java.util.*;
class frequency{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int fr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i:a){
			System.out.print(i+" ");
		}
		int visit=-1;
		//int count=1;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					fr[j]=visit;
				}
			}
			if(fr[i]!=visit)
			{
			fr[i]=count;
			}
		}
		System.out.println();
		for(int i=0;i<fr.length;i++){
			if(fr[i]!=visit){
				
				System.out.println(a[i]+" | "+fr[i]+" ");
			}
		}
	}
}
/*
5
1 2 2 1 3
1 2 2 1 3
1 | 2
2 | 2
3 | 1
*/