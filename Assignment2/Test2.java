import java.util.Scanner;

class Sort{
	int[] arr = new int[10];
	Sort(int[] a){
		for(int i = 0; i<10; i++){
			this.arr[i]= a[i];
		}
	}
	void arrange(){
		int swapped;
		for(int i = 0; i< 9; i++){
			swapped=0;
			for(int j = 0; j< 9-i; j++){
				if (arr[j]> arr[j+1]){
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=1;
				}
			}
			if (swapped==0)
				break;
		}
		System.out.println("After Sorting: ");
		for(int i = 0; i<=9; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	void search(int n){
		int u=9, l = 0;
		int mid = (l+u)/2;
		while (l<=u){
			
			mid = (l+u)/2;

			if (arr[mid]==n){
				System.out.println("Found at Index: "+mid);
				return;
			}
			else if (arr[mid] < n){
				l = mid+1;
			}
			else{
				u = mid - 1;
			}
		}
		System.out.println("Element Not Found in the Array");
	}
}

public class Test2{
	static int validData(String a){
		for(int i = 0; i< a.length(); i++){
			if (a.charAt(i) < '0' || a.charAt(i) > '9') return 0;
		}
		return 1;
	}
	
	public static void main(String[] args){
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i< 10; i++){
			if (validData(args[i])==1)
				arr[i]= Integer.parseInt(args[i]);
		}
		Sort s = new Sort(arr);
		s.arrange();
		System.out.print("Enter the number to search: ");
		int n = sc.nextInt();
		s.search(n);
		sc.close();
	}

}
