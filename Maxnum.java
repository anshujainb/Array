
public class Maxnum {
	
	
public static void main(String[] args) {
	
	int maxnum=0;
	int minnum=0;
	int[] arr= {45,30,3,1,-232,-455,121};
	for(int i=0; i<arr.length; i++){
		
		for (int j=0; j<arr.length; j++){
			
			if(arr[i]>arr[j]){
				maxnum=arr[i];
			}
			
			
		}	
	}
	
	for(int k=0; k<arr.length; k++){
		if (maxnum<arr[k]){
			maxnum=arr[k];
		}
	}
	System.out.println("Max num:"+maxnum);
	
	
for(int i=0; i<arr.length; i++){
		
		for (int j=0; j<arr.length; j++){
			
			if(arr[i]>arr[j]){
				minnum=arr[j];
			}
			
			
		}	
	}
	
	for(int k=0; k<arr.length; k++){
		if (minnum>arr[k]){
			minnum=arr[k];
		}
	}
	System.out.println("Min num:"+minnum);
//			else{
//				maxnum=arr[j];
//			}
			
//			if(arr[i]<arr[j]){
//				minnum= arr[j];
//			}
		}
		
	
	
	
	//System.out.println("Min num:"+minnum);
	
	
	

}
