
public class test {
	
public static void main(String[] args) {
	Swap[] arr= new Swap[2];
	arr[0]= new Swap(1,2,3);
	arr[1]= new Swap(4,5,6);
	System.out.println("befor Swaping");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	
	Swap.Swapobj(arr);
	
	System.out.println("after Swaping");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	
	
}
}
