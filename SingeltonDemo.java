package DailyAlgoPractice;
public class SingeltonDemo {
	public static void main(String[] args) {
		singleton nn = singleton.getInstance();
		nn.printmessage();
	}
}

class singleton{
	private static singleton instance = new singleton();
	private singleton(){}
	
	public static singleton getInstance(){
		return instance;
	}
	public void printmessage(){
		System.out.println("Hello I am in singleton printmessage method");
	}
}
