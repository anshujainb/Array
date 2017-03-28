
public class Insert {

	public static void main(String[] args) {
		
		int n=9;
		int[] arr= {8,9,23,44,56};
		//System.out.println("before insertion:");
	
		/*for (int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}*/
		
		System.out.println("after insertion:");
		for (int i=0;i<arr.length;i++){
			if(arr[i]==n){
				
				while( i<arr.length-1){
				arr[i]=arr[i+1];
				i++;
				}
			}
			/*if(i==2){
				arr[i]=n;
			}*/	
			
			//System.out.println(arr[i]);
		}
		
for (int i=0;i<arr.length;i++){
			
			System.out.println(arr[i]);
		}
		

	}
}
	
	

    
  
//
//}
