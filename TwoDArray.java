
public class TwoDArray {
int[][] Arr= new int[1][3];
int count=0;

public void PrintArr(){
	System.out.println(Arr.length);
	for(int i=0;i<Arr.length;i++){
		for(int j=0;j<3;j++){
			
			Arr[i][j]+=count;
			count++;
		}
	}
	for(int[] x:Arr){
		for(int e:x){
			System.out.print(e);
			System.out.println();
		}
	}
}
}
