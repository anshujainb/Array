
public class StringArray {
	public static void main(String[] args) {
		String[] names = {"a","e","a","f","e","e","i","i"};
		String[] dupnames= new String[names.length];
		int flag=0;
		int m=0;
		for(int i=0; i<names.length; i++){ //  traverse array to check the target element
			for(int j=i+1; j<names.length; j++){  //to check the subsequent elements 
				if(names[i]==names[j]){
					for(int k=0; k<dupnames.length; k++){
						if(dupnames[k]==names[i]){
							flag=1;
						}
					
					}
					if(flag==0){
						dupnames[m]=names[i];
						m++;
					}
					flag=0;
				}
			}
		}
		for(m=0;m<dupnames.length;m++){
			System.out.println(dupnames[m]);
		
		
	}

}
}
