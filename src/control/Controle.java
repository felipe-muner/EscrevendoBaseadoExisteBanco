package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import persistence.InspetorDao;

public class Controle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Controle() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		if(cmd.equalsIgnoreCase("verificaInspetor")){
			verificaInspetor(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	protected void verificaInspetor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		try {
			JSONArray lista = new JSONArray(new InspetorDao().pesquisaNome(nome));
			System.out.println(lista);
			JSONObject json = new JSONObject();
			json.put("Inspetor", lista);
			System.out.println(json);
			response.setContentType("application/json");
			response.getWriter().write(json.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
