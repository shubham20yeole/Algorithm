package Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Drawable{  
	public void draw(String str);  
}

interface Addable{  
	int add(int a,int b);  
}  

public class LambdaExpression {
	public static void main(String[] args) {
		int width=10;  
		Drawable d2 = (str)->{
			String s = str;
			String res = s + " Drawing "+width;
			System.out.println(res);
		};  
		d2.draw("I would like to say I am ");

		Addable ad1=(a,b)->{return a+b;};  
		System.out.println(ad1.add(10,20));  

		Addable ad2=(int a,int b)->(a+b);  
		System.out.println(ad2.add(100,200));

		List<Product> list=new ArrayList<Product>();  
		list.add(new Product(1,"HP Laptop",25000f));
		list.add(new Product(3,"Keyboard",300f));
		list.add(new Product(2,"Dell Mouse",150f));

		Collections.sort(list,(p1,p2)->{  
			return p1.name.compareTo(p2.name);  
		});  
		list.forEach(  
				(n)->{
					String s = "I am printing: ";
					String res = s + n.id+", "+n.name+", "+n.price;
					System.out.println(res);
				}
				); 

		Runnable r2 = () -> {
			System.out.println("Thread2 is running...");
		};

		Thread t2=new Thread(r2);

		t2.start(); 

		Stream<Product> filtered_data = list.stream().filter(p -> p.price > 100 && p.price<2000);  

		// using lambda to iterate through collection  
		filtered_data.forEach(  
				(product) -> System.out.println(product.name+": "+product.price)  
				);

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Shubham");
		map.put(2, "Snehal");
		map.put(3, "Rasik");

		map.forEach(
				(n,k) -> { System.out.println(n+", "+k);}
				);

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("filtered: "+filtered);

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		System.out.println("squaresList: "+squaresList);

		LocalDateTime currentTime = LocalDateTime.now();
	      System.out.println("Current DateTime: " + currentTime);
			
	      LocalDate date1 = currentTime.toLocalDate();
	      System.out.println("date1: " + date1);
			
	      Month month = currentTime.getMonth();
	      int day = currentTime.getDayOfMonth();
	      int seconds = currentTime.getSecond();
			
	      System.out.println("Month: " + month +"day: " + day +"seconds: " + seconds);

	      LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
	      System.out.println("date2: " + date2);
			
	      //12 december 2014
	      LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
	      System.out.println("date3: " + date3);
			
	      //22 hour 15 minutes
	      LocalTime date4 = LocalTime.of(22, 15);
	      System.out.println("date4: " + date4);
			
	      //parse a string
	      LocalTime date5 = LocalTime.parse("20:15:30");
	      System.out.println("date5: " + date5);
	}
}

class Product{  
	int id;  
	String name;  
	float price;  
	public Product(int id, String name, float price) {  
		super();  
		this.id = id;  
		this.name = name;  
		this.price = price;  
	}  
}  