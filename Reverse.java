
public class Reverse {
	
	public static void main(String[] args) {
		
	
		int[] arr= {1,2,3,4};
		//int temp=0;
		int count= arr.length-1;
		int[] temp= new int[4];
		
		for(int x:arr){
			if(count>=0){
				temp[count]=x;	
					
			}	
			count--;	
		}
		
		for(int i=0;i<arr.length; i++){
			arr[i]=temp[i];	
		}
		
			
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
	}
	
}
