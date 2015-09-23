package com.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.resource.instance.Sms;
import com.twilio.sdk.resource.list.SmsList;
import com.twilio.sdk.verbs.TwiMLResponse;
import com.twilio.sdk.verbs.TwiMLException;
import com.twilio.sdk.verbs.Message;

//import com.parse.Parse;
//import com.parse.ParseAnalytics;
 
public class TwilioServlet extends HttpServlet {
	
		
    // service() responds to both GET and POST requests. 
    // You can also use doGet() or doPost()
	//public static HashMap<String, ArrayList<String>> storage = new HashMap<String, ArrayList<String>>();
	//public static HashMap<String, int[]> votes = new HashMap<String, int[]>();
	public static int[] votes = new int[7];
	
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
    	
         
        // Loop over smss and print out a property for each one.
    	String id = "default";
    	HttpSession session = request.getSession(true);
 
    	String phoneNum = request.getParameter("From");
    	String message = "Hey POD members! Thanks for coming to class today. :)";
    	if(phoneNum.equals("+19567710480")){
    		message = "Hello Angie. This is an automated message reply. Reminder to keep your calendar clear tonight from 12AM - 1AM. :)";
    	}
        response.setContentType("application/xml");
        response.getWriter().print("<Response><Message>" + message +"</Message></Response>");
    	
//    	Set<String> set = storage.keySet();
//    	for(String x: set){
//    		ArrayList<String> temp = storage.get(x);
//    		if(temp.contains(phoneNum))
//    			id = x;
//    	}
    	
//        Integer counter = (Integer)session.getAttribute("counter");
//        Boolean correct = true;
//        if (counter == null) {
//            counter = new Integer(0);
//        }
//    	
//        String message;
//        int count = counter.intValue();
//        String reply = request.getParameter("Body");
//        int replyVote;
//        try {
//             replyVote = Integer.parseInt(reply);
//        }
//        catch (NumberFormatException e) {
//        	//Will Throw exception!
//        	//do something! anything to handle the exception.
//        	replyVote = -1;
//        	correct = false;
//        }
//
//        count++;
//
//        if((!correct&&count<=1) || replyVote < 1 || replyVote > 6)
//        	message = "The format of your poll vote was not correct. Please try again.";
//        else if(count == 0){ 
//        	if(replyVote == 6)
//        		message = "Sorry you can't make it! You'll be missed";
//        	else
//        		message = "Thanks for voting! A text with the final destination will be sent soon.";
//        	votes[replyVote]++;
//        }
//        else{
//        	message = "Whoops! Voting is now closed.";
//        }


        
     
        //session.setAttribute("counter", new Integer(count));
    	
//    	// Create a dict of people we know.
//        HashMap<String, String> callers = new HashMap<String, String>();
//        callers.put("+19562238617", "Cindy");
//        callers.put("+19562850531", "Jiwon");
//        callers.put("+14158675311", "Virgil");
//        callers.put("+12817347302", "Justin");
//        callers.put("+19562850633", "Scott");
// 
//        String fromNumber = request.getParameter("From");
//        String knownCaller = callers.get(fromNumber);
//        String message;
//        if (knownCaller == null) {
//            // Use a generic message
//            message = "HIIIIII!";
//        } else {
//            // Use the caller's name
//            message = knownCaller + ", you'll never find out who I am. ;)";
//        }
// 

    }
    
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//    	String id = request.getParameter("id");
//    	String numbers = request.getParameter("numbers");
//    	String[] parsed = numbers.split("\\s+");
//    	List<String> newparsed = new ArrayList<String>();
//    	Collections.addAll(newparsed, parsed);
//    	storage.put(id, (ArrayList<String>) newparsed);
//    }
//    
//    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
//    	String result = "";
//    	String id = request.getParameter("id");
//    	int[] arr = votes.get(id);
//    	if(arr == null)
//    		result = "0 0 0 0 0 0 ";
//    	else{
//    		for(int i=1; i<7; i++){
//    			result+=arr[i];
//    			result+=" ";
//    		}
//    	}
//    	response.setHeader("results", result);
//    }
}
