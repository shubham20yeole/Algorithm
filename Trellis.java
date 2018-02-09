package Jobalgorithm;
/**
 * Author: Shubham Yeole
 * School: Pace University
 * Major: Computer Science
 * Status: Seeking full time opportunity
 * Date and Time: Dec 30, 2016 at 3:06:49 PM
 *
 * PROJECTS:
 * Blog: https://java-nodejs-blog.herokuapp.com/
 * Real Estates: https://usa-real-estates.herokuapp.com/
 * Task Tracker: https://usa-real-estates.herokuapp.com/timetableall
 * Job Search portal: http://shubhamyeole.byethost8.com/public_html/career/jobsearch.html
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Trellis {

    public static void main(String[] args) {

        String csvFile = "D:/messages.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        int count = 0;
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine())!= null) {
                String[] messages = line.split(cvsSplitBy);
                System.out.println("Account id: " + messages[0] + " , MessageId: " + messages[1] + ", ThreadID: "+messages[2]+
                		", From:"+messages[3]+", To:"+messages[4]+", CC:"+messages[5]+", Timestamp:"+messages[6]);
                count++;
            }
            System.out.println("Count: "+count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}