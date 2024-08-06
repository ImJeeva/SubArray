package SubArray;

import java.util.Scanner;

public class SubArraySum {
	static void sizeOfArray(int [] arr,int size) {
		int sum=0;
		
		for(int i=0;i<=arr.length-size;i++) {
			sum=0;
			for(int j=i;j<i+size;j++) {
				sum=arr[j]+sum;
				
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int z=scan.nextInt();
		int [] arr=new int[z];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
					
		}
	  int size=scan.nextInt();
	  sizeOfArray(arr,size);
		
		

	}

}
