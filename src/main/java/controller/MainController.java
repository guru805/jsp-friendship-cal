package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/jspservelt-app-friends-calculator/friends"})
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MainController() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
    	
    	RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
    	String myName = request.getParameter("friend1");
    	String friendName = request.getParameter("friend2");
    	
        int result = calculate(myName,friendName);
		
        String calculate = request.getParameter("calculate");
        
        System.out.println(result);
        if(calculate!=null) {
//        	PrintWriter out = response.getWriter();
//        	out.println("<h3>Based on the name similarity, the friendship strength between "+myName+" and "+friendName+" is: "+result+"</h3>");
         	request.setAttribute("myName", myName);
        	request.setAttribute("friendName", friendName);
        	request.setAttribute("result", result);
        }
        
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
	
	public static int findSum(int friendShipSum) {
		int sum = 0;
        while (friendShipSum > 0) {
            sum += friendShipSum % 10;
            friendShipSum /= 10;
        }
        return sum;
	}

	public static int calculate(String myName, String friendName) {
		
		final String FriendShip = "friends";
		int firstSum = 0, secondSum = 0, friendShipSum = 0, totalSum;
    	
    	myName = myName.toLowerCase();
    	friendName = friendName.toLowerCase();

        for (int i = 0; i < myName.length(); i++) {
        	firstSum += myName.charAt(i);
        }

        for (int i = 0; i < friendName.length(); i++) {
        	secondSum += friendName.charAt(i);
        }

        for (int i = 0; i < FriendShip.length(); i++) { 
        	friendShipSum += FriendShip.charAt(i); 
        } 
        totalSum = findSum(firstSum + secondSum); 
        friendShipSum = findSum(friendShipSum); 
        if (totalSum > friendShipSum) {
            totalSum = friendShipSum - (totalSum - friendShipSum);
        }
        
        return (totalSum * 100 / friendShipSum);
		
	}

	
}
