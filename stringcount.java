package Algorithms;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: May 8, 2017 at 12:35:15 PM
 *
 * PROJECTS:   
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */
public class stringcount {
	public static void main(String[] args) {
		System.out.println(LookAndSay("12233337", 1));
		//	312213
	}

	@SuppressWarnings("unused")
	public static String LookAndSay(String s, int n) {
		String result = "";
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for (int i = 0; i <s.length(); i++){
			int c = Character.getNumericValue(s.charAt(i));
			if(hm.containsKey(c) || i==0){
				if(hm.isEmpty()) hm.put(c, 1);
				else hm.put(c, hm.get(c)+1);
				if(i==s.length()-1){
					int key = Character.getNumericValue(s.charAt(i-1));
					result = result+ hm.get(key)+key;
				}
			}else{
				int key = Character.getNumericValue(s.charAt(i-1));
				result = result+ hm.get(key)+key;
				hm.clear();
				hm.put(c, 1);
				if(i==s.length()-1){
					result = result+1+c;
				}
			}
		}
		return result;
	}
}

class Ruby_and_Rails_Node{
	
	LinkedList<String> generalRubyLikedList = new LinkedList<String>();
	
	String hadoop_Username = "y9_hdfs_20081992.host.com";
	
	String hadoop_password = "8976897860987567";
	
	Ruby_and_Rails_Node python_Connector = null;
	
	Ruby_and_Rails_Node bigData_connection = null;
	
	Ruby_and_Rails_Node hadoop_hdfs_connectors = null;
	
	public Ruby_and_Rails_Node(String hadoop_Username, String hadoop_password){
		
		this.hadoop_password = hadoop_password;
		this.hadoop_Username = hadoop_Username;
	}
	
	public static void big_data_root_method(){
		
		String hostname = "connector.hdfs.shubham.com";
		
		String userCode = "bigdata_test_module.host_machine.com";
		
		Ruby_and_Rails_Node ruby = new Ruby_and_Rails_Node(hostname, userCode);
		
	}
}

class HadoopImportConnectors{
	
	int data = 0;
	
	public HadoopImportConnectors(int data){
		this.data = data;
		this.data = data;
	}
}