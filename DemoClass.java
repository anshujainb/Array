
public class DemoClass {
	static int[] arr= {1,2,3,4,5};
 public static void display(int...x){
	 for(int i: x){
		 System.out.println(i);
	 }
	 
 }
 public static void main(String[] args) {
	
	display(1,2,3,4,5,6);
	System.out.println("*****");
	display(arr);

}
}
