
public class StairCase {
	public static void main(String[] args) {
		int num  = 6;
        for(int j=0;j<num;j++){
            for(int i=1;i<=num;i++){
            	if(i<num-j){
            		System.out.print(" ");
            	}else{
            		System.out.print("#");
            	}
            }
            System.out.println();
        }
	}
}
