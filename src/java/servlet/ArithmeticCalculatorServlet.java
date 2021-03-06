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
public class ArithmeticCalculatorServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        request.setAttribute("message", "---");
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String calc = request.getParameter("calc");
        String regex = "[0-9]";
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        if(first == null || first.equals("") || second == null || second.equals(""))
        {
           request.setAttribute("message", "invalid");
           
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                   .forward(request, response);
           return;
        }
        
        if(!first.matches(regex) || !second.matches(regex))
        {
            request.setAttribute("message", "Invalid");
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            return;
        }
        
        int num1 = Integer.parseInt(first);
        int num2 = Integer.parseInt(second);
        int total = 0;
        
        if(calc.equals("+"))
        {
            total = num1 + num2;
        }
        else if(calc.equals("-"))
        {
            total = num1 - num2;
        }
        else if(calc.equals("*"))
        {
            total = num1 * num2;
        }
        else if(calc.equals("%"))
        {
            if(num2 == 0)
            {
                request.setAttribute("message", "Invalid. Cannot divide by 0");
                
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                        .forward(request, response);
                return;
            }
            
            total = num1 / num2;
        }
        
        request.setAttribute("message", total);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }
}
