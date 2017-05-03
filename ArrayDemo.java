
public class ArrayDemo {
public static void main(String[] args) {
	int[] arr= new int[10];
	float[] arr2= {1.5f, 2.5f,3.5f,1.0f,4.0f};
	for(int i=0;i<10;i++){
		arr[i]=i;
	}
	for(int x: arr){
		System.out.println(x);
	}
	
	System.out.println("float array");
	for(float x: arr2){
		System.out.println(x);
	}
}
}
