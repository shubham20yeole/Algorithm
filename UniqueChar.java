                        import java.util.HashMap;
import java.util.Scanner;

public class UniqueChar {

	static String firstUniqueChar(String input) {
		int[] ch = new int[256];
		for (int i = 0; i < input.length(); i++) {
			int n = (int) input.charAt(i);
			ch[n] = ch[n] + 1;
		}
		String result = "";

		for (int i = 0; i < input.length(); i++) {
			int n = (int) input.charAt(i);
			char ii = input.charAt(i);
			if(ch[n]==1){
				result = ""+ii;
				break;
			}
		}
		return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
       
        String res;
       
        
        res = firstUniqueChar("shubham");
       System.out.println(res);

	}

}