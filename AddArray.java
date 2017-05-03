
public class AddArray {
	public static void main(String[] args) {
		int[] Array1= {3,2,1,6,2,9};
		int[] Array2= {4,5,2,3,2,1};
		int[] Sum= new int[Array1.length]; 
		int k=0;
		for(int i= 0; i<Array1.length; i++){
			for(int j= i; j==i; j++){
				Sum[k]=Array1[i]+Array2[j];
				k++;
			}
		}
		
		System.out.println("addition of array:");
		
		for(int m=0;m<Sum.length;m++){
			System.out.println(Sum[m]);
		}
	}
	

}
