
public class Swap {

	int day;
	int month;
	int year;
	
	
	public Swap(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	 
	public static void Swapobj(Swap []obj){
		Swap temp= obj[0];
		obj[0]=obj[1];
		obj[1]=temp;
		
	}

	@Override
	public String toString() {
		return "Swap [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
}
