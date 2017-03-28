
public class SecondHighest {
	
	public static void main(String[] args) {
		
	int[] arr={44,22,11,45,33};
	
		for (int count=0;count<arr.length;count++){ // to check Second highest no
          for(int i=count+1; i<arr.length;i++){
        	  if (arr[count]>arr[i]){
          
                  int temp = arr[count];
                  arr[count]=arr[i];
                  arr[i]=temp;
              }
          }
	
		}
		System.out.println("second highest no:"+arr[arr.length-2]);
		// to check second minimum no
		for (int count=0;count<arr.length;count++){ // to check Second highest no
	          for(int i=count+1; i<arr.length;i++){
	        	  if (arr[count]<arr[i]){
	          
	                  int temp = arr[count];
	                  arr[count]=arr[i];
	                  arr[i]=temp;
	              }
	          }
		
			}
			System.out.println("second minimum no:"+arr[arr.length-2]);
	}
}
