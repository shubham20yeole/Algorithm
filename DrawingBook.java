package WeekofCode27;
import java.io.*;
import java.util.*;

public class DrawingBook {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int pages = scan.nextInt();
		int go = scan.nextInt();
		if(go<0 || go>pages){
			System.out.println(0);
			return;
		}

		int pagecount =2, pagecount2 = pages, lastpage = 0, seclastPage = 0, lastpage2 = pages, seclastPage2 = pages-1;

		if(go<=pages/2){
			if(go==1) {
				System.out.println(0);
				return;
			}
			for(int i=1; i<pages/2+1;i++){
				int pl = pagecount++;
				int rl = pagecount++;
				if(i==pages/2){
					if(pages%2==0){ lastpage = 0; seclastPage = pl; 
					}else{lastpage = rl;seclastPage = pl;}
					if(go==pl || go==rl){System.out.println(i);break;}
				}else{
					if(go==pl || go==rl){System.out.println(i);break;}
				}
			}
		}else{
			if(pages%2==0){
				int firstleftpage = pages-1;
				if(go==pages) {
					System.out.println(0);
					return;
				}
				for(int i=1; i<pages/2+1;i++){
					int rl = firstleftpage--;
					int pl = firstleftpage--;
					if(go==pl || go==rl){System.out.println(i);break;}
				}
			}else{
				int firstrightpage = pages;
				int firstleftpage = pages;
				if(go==pages || go==pages-1) {
					System.out.println(0);
					return;
				}
				for(int i=1; i<pages/2+1;i++){
					int rl = firstleftpage--;
					int pl = firstleftpage--;
					if(go==pl || go==rl){System.out.println(i);break;}

				}
			}

		}		

	}
}