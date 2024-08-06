package SubArray;

import java.util.Scanner;

public class SubArraySize {
	
	static void sizeOfArray(int [] arr,int size) {
		
		for(int i=0;i<=arr.length-size;i++) {
			for(int j=i;j<i+size;j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
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
