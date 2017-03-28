
public class Duplicate {
 
	public static void main(String[] args) {
		
		int[] arr= {1,3,3,3,1,2,3,17,2,4,5,5};
		int k=0;
		int count=0;
		
		int[] duplicate=new int[arr.length];
		//int temp=arr.length-1;
		int flag=0; //= means no duplicatate
		
		
		for( int i=0; i<arr.length; i++){     //to traverse all elements to check itself 			
			for (int j=i+1; j<arr.length; j++){   //to check with subsequent element	
				
				if(arr[i]==arr[j]){  //	if duplicate is found in main array then check here						
					for(int m=0;m<duplicate.length;m++){   //check if previous duplicate was found in duplicate array
						if(duplicate[m]==arr[i]){
							flag =1; //duplicate aready here							
						}
					}
					
					if(flag==0){
						duplicate[k]=arr[i]; // only if value does not exist in duplicate array then store in duplicate array 
						k++;
					}
					flag=0;
				}					
			}
		}
			
		for(k=0;k<duplicate.length;k++){
			System.out.println(duplicate[k]);
		
		}
			
		
		
	}
}

