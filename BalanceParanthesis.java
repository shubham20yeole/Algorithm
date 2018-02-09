package DailyAlgoPractice;

import java.util.Stack;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: May 21, 2017 at 1:39:54 AM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class BalanceParanthesis {
	public static void main(String[] args) {
		System.out.println(isBalanced("([[])"));
	}

	private static boolean isBalanced(String s) {
		boolean status = true;
		int l = s.length();
		if(l==1) return false;
		Stack<Character> st = new Stack<Character>();

		for(int i=0; i<l; i++){
			char c = s.charAt(i);
			if(i==0) st.push(c);
			else if(opening(c)) st.push(c);
			else if(isMatching(c, st.peek())) st.pop();
			else{
				status = false;
				break;
			}
		}
		return status;
	}

	private static boolean isMatching(char c, Character peek) {
		boolean status =true;
		if(c==')'){
			if(c==')' && peek=='(')  status = true;
			else status =  false;
		}else if(c==']'){
			if(c==']' && peek=='[')  status =  true;
			else status =  false;
		}else if(c=='}'){
			if(c=='}' && peek=='{' )  status =  true;
			else status =  false;
		}
		return status;
	}

	private static boolean opening(char c) {
		if(c=='(' || c=='[' || c=='{') return true;
		else return false;
	}
}