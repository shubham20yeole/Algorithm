package DailyAlgoPractice;

import java.util.Stack;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: May 21, 2017 at 4:40:42 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class Parenthesis {
	public static void main(String[] args) {
		System.out.println(longestValidParentheses("(({{()()}}"));
	}

	public static int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<Integer>();
		int max=0;
		int left = -1;
		for(int j=0;j<s.length();j++){
			if(s.charAt(j)=='(') stack.push(j);
			else {
				if (stack.isEmpty()) left=j;
				else{
					stack.pop();
					if(stack.isEmpty()) max=Math.max(max,j-left);
					else max=Math.max(max,j-stack.peek());
				}
			}
		}
		return max;
	}
}

