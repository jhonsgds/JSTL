package servicio;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.credito;

/**
 * Servlet implementation class procesar
 */
@WebServlet("/procesar.do")
public class procesar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public procesar() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException{
    	try {
    		float montoSolicitado = Float.parseFloat(request.getParameter("monto"));
    		int cuotas = Integer.parseInt(request.getParameter("cuotas"));
    		if (montoSolicitado <= 0) {
    			throw new Exception();
    		}
    		float tasa =0;
    		if( cuotas >= 3 && cuotas <= 12 ) {
    			tasa = 1.3f;
    		}
    		else if( cuotas > 12 && cuotas <= 18 ){
    			tasa = 1.2f;
    		}
    		else {
    			tasa = 1.1f;
    		}
    		credito c = new credito(montoSolicitado, tasa, cuotas);
    		c.CalcularCredito();
    		request.setAttribute("credito", c);
    		request.getRequestDispatcher("/resultado.jsp").forward(request, response);
    		
    	}
    	catch( Exception ex){
    		response.sendRedirect("error.jsp");
    	}
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		processRequest(request, response);
	}

}
