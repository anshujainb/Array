
public class CommonElements {
public static void main(String[] args) {
	String[] name1= {"a","b","e","d"};
	String[] name2= {"c","b","e","d"};
	String Comman="null";
	for(int i=0; i<name1.length; i++){
		for(int j=0; j<name2.length; j++){
			if(name1[i]==name2[j]){
				Comman= name1[i];
				System.out.println(Comman);
			}
			
		}
		
	}
	
	
}
}
