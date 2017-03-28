

public class Repeat {
 public static void main(String[] args) {
	int[] arr= {1,3,1,1,2,1,1,6,8,8};
	int count=0;
	int j=0;
	int flag=0;
	int[] counted= new int[arr.length]; // array of checked elements for repetition

	for(int x:arr){      //traversing the main array
		for(int m=0; m<arr.length; m++){  // traversing the checked elements' array i.e. "counted" 
			if(x==counted[m]){      // if no. is already checked
				flag=1;
			}
		}
			if(flag==0){
				for(int i=0; i<arr.length; i++){ //if no is note checked then count for no of repetitions
					if(x==arr[i]){
						count++;
					}
			
				}
			
				System.out.println("repeats of "+ x +" is " + count);
			}
	
		if(j<arr.length){ //copying the checked elements into "counted" array
			counted[j]=x;
			j++;
			
		}
		count=0;
		flag=0;
	}
 }
}






		
			
	



