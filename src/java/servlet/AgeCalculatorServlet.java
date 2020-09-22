package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 791662
 */
public class AgeCalculatorServlet extends HttpServlet 
{
    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String number = request.getParameter("number");
        String regex = "[0-9]";
        
        request.setAttribute("number", number);
        
        if(number == null || number.equals(""))
        {
            request.setAttribute("message", "You must give your current age");
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
            return;
        }
        
        if(!number.matches(regex))
        {
            request.setAttribute("message", "You must enter a number.");
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                    .forward(request, response);
            return;
        }
        
        int calcNumber = Integer.parseInt(number);
        calcNumber = calcNumber + 1;
        
        request.setAttribute("message", "Your age next birthday will be " + calcNumber);
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }
}
