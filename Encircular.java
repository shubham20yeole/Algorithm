package Jobalgorithm;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Dec 29, 2016 at 10:22:46 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class Encircular {

	private static String[] getReusltString(String[] s) {
		String[] result = new String[s.length];

		for (int i = 0; i < s.length; i++) {
			int x = 0, y = 0;
			if(s[i].length()==1 && s[i].equals("g")){
				result[i]	= "YES";
			}else{
				if(s[i].length()==1 && !s[i].equals("g")){
					result[i]	= "NO";
				}else{
					char[] ch = s[i].toCharArray();
					String[] sh = new String[ch.length];
					sh[0] = "0 0 u 0 0";
					for (int j = 1; j <ch.length; j++) {
						char prev = ch[j-1];
						char curr = ch[j];
						String getCurrentCoordinate = getCurrentCoordinate(sh[j-1], curr);
						sh[j] = getCurrentCoordinate;

						if(j==ch.length-1){
							String[] tempResult = getCurrentCoordinate.split(" ");
							double oRad = Double.valueOf(tempResult[3]);
							double mRad = Double.valueOf(tempResult[4]);
							if(oRad<mRad){
								result[i] = "YES";
							}else{
								result[i] = "NO";

							}
						}
					}
				}
			}
		}

		return result;
	}

	private static String getCurrentCoordinate(String string, char curr) {
		String[] a = string.split(" ");

		int x = Integer.valueOf(a[0]);
		int y = Integer.valueOf(a[1]);

		String p = a[2]; 

		String r = a[3];
		String mr = a[4];

		//		System.out.println(radius);
		//		System.out.println(x+", "+y+", "+p+", C: "+curr);
		String n = "";
//		System.out.println("String: "+string+",  Previous: "+p+", Current: "+curr);

		if(p.equals("u") && curr=='g') {n = n +  "u"; y++; }
		if(p.equals("u") && curr=='r') {n = n +  "r";}
		if(p.equals("u") && curr=='l') {n = n +  "l";}

		if(p.equals("r") && curr=='g') {n = n +  "r"; x++; }
		if(p.equals("r") && curr=='r') {n = n +  "d";}
		if(p.equals("r") && curr=='l') {n = n +  "u";}

		if(p.equals("l") && curr=='g') {n = n +  "l"; x--; }
		if(p.equals("l") && curr=='r') {n = n +  "u";}
		if(p.equals("l") && curr=='l') {n = n +  "d";}

		if(p.equals("d") && curr=='g') {n = n +  "d"; y--; }
		if(p.equals("d") && curr=='r') {n = n +  "l";}
		if(p.equals("d") && curr=='l') {n = n +  "r";}

		double radius = Math.sqrt((x*x)+(y*y));
		//		System.out.println("Radius: "+radius);

		if(radius>=Double.valueOf(mr)){
			mr = String.valueOf(radius);
		}
		String newResult = x+" "+y+" "+n+" "+(radius)+" "+mr;
		System.out.println(newResult+"\n");
		return newResult;
	}


	public static void main(String[] args) {
		String[] array = {"g","l","grgl", "grgrgr"};
		String[] s = getReusltString(array); 

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
}

