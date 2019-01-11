import java.util.Scanner;
/*
 *1.How to find all pairs on integer array whose sum is equal to given number(all should read
dynamically)
i/p: array: {5,2,3,4, 1}, value: 4
o/p: {1,3}
i/p: array: {5,2,3,4, 1}, value: 5
o/p: {1,4}, {2,3},
 */

public class FindPairs {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int size=sc.nextInt();
		int a[]=new int[size];
		String check="";
		System.out.println("Enter elements into array :");
		for(int i=0;i<size;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number to print sum :");
		int sum=sc.nextInt();
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(i!=j && (a[i]+a[j]==sum)){
					String words[]=check.split(" ");
					int count=0;
					for(int verify=0;verify<words.length && count==0;verify++){
						if(words[verify].contains(Integer.toString(a[i])) && words[verify].contains(Integer.toString(a[j]))){
							count=1;
						}
					}
					if(count==0){
						check=check+"("+Integer.toString(a[i])+","+Integer.toString(a[j])+")";
					}
				}
			}
		}
		System.out.println(check);

	}

}
