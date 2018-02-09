package WeekofCode27;

import java.util.Scanner;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Dec 27, 2016 at 9:01:41 AM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class DataTypes {
	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
//        int si = scan.nextInt();
//        double sd = scan.nextDouble();
//
//        System.out.println(i+si);
//        System.out.println(d+sd);
       String ss = scan.nextLine();
       // StringBuilder ss=new StringBuilder(scan.nextLine());

        System.out.println(s.concat(ss));
       
}
}

