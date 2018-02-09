package Algorithm;

public class ProjectEuler169 {
	static int[] power;
	public static void main(String[] args) {
		setPowers(10);
		result(10);

	}

	private static void setPowers(int last) {
		int count = 0;
		String result = "";
		for(int i=0;i<last;i++){
			int data = (int) Math.pow(2, i);
			if(data<=last){
				result = result+ " "+data;
			}
		}
		String[] parts = result.split(" ");
		power =  new int[parts.length-1];
		for(int i=0;i<last;i++){
			int data = (int) Math.pow(2, i);
			if(data<=last){
				result = result+ " "+data;
				power[count] = data;
				count++;
			}
		}
	}

	private static void result(int digit) {
		System.out.println("Result method: ");
		for(int i=0; i<power.length;i++){
//			System.out.println(f(digit / 2) + f(digit - 1));
			System.out.println(power[i]);
		}
	}
}
