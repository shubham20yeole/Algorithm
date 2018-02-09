package Adobe;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
class bussiness{
	private int id;
	private double rating;
	bussiness(int id, double rating){
		this.id = id;
		this.setRating(rating);
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
}
public class medianOfList {
	public static void main(String[] args) {
		List<bussiness> l = new LinkedList<bussiness>();
		l.add(new bussiness(104, 2.7));
		l.add(new bussiness(101, 3.5));
		l.add(new bussiness(102, 8.3));
		l.add(new bussiness(103, 5.1));
		System.out.println(getResult(l));
	}
	private static double getResult(List<bussiness> m) {
		Collections.sort(m, (p1,p2)->{ 
			if(p1.getRating()==p2.getRating()) return 0;
			else if(p1.getRating()<=p2.getRating()) return -1;
			else return 1;
		});
		int middle = m.size()/2;
		int l = m.size();
		if(l%2 == 1) {
			return m.get(middle).getRating();
		}else{
			return ((m.get(middle-1).getRating() + m.get(middle).getRating()) / 2.0);
		}
	}
}