import java.util.*;

public class stringStartWithVovelEndWithConsonent {
	public static void main(String[] args) {
		String s = "dfAeioufffffvdfgsveredriaeiouaeiouaeiouaeioug";
		getResult(s);
		// abdddcdddba
	}

	private static void getResult(String s) {
		char[] ca = s.toCharArray();
		List l = new ArrayList();
		List<String> ll = new ArrayList<String>();
		for(int i=0; i<ca.length; i++){

			if(checkVovel(ca[i])){
				l = getFullString(i, s);
				int li = (int)l.get(0);
				String ss = (String)l.get(1);
				ll.add(ss);
				i=li;
			}
		}
		System.out.println("First String: "+ll.get(0));
		System.out.println("Last String: "+ll.get(ll.size()-1));
	}

	private static List getFullString(int startIndex, String s) {
		List l = new ArrayList();
		if(startIndex==s.length()-1){
			l.add(startIndex);
			l.add(s.charAt(startIndex)+"");
			return l;
		}
		StringBuilder res = new StringBuilder();
		for (int i = startIndex; i < s.length(); i++) {
			if(!checkVovel(s.charAt(i))){
				res.append(s.charAt(i));
				l.add(i);
				l.add(res.toString());
				return l;
			}else{
				res.append(s.charAt(i));
			}
		}
		return null;
	}

	private static boolean checkVovel(char c) {
		return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
	}
	
	
}

