
public class IterateArray {
	
	
	
public static void main(String[] args) {
		
	
	
	int[] arr= {1,2,3,4,5};
	int[] Newarr= new int[5];
	
	System.out.println("before copy:");
	
	for(int i=0; i<arr.length; i++){
		
		System.out.println(arr[i]);
		
		//for(int j=i; j<=i; j++){
			Newarr[i]= arr[i];		
		//}
		
	
	 }
	System.out.println(" after copy new array is:");
	
	for(int x :Newarr){
		System.out.println(x);
		
	}
	
	
	
}
}
