package servlets.palestrante;

import aplication.ServiceFactory;
import interfaces.services.IPalestranteService;
import models.domain.Palestrante;
import models.domain.Participante;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ListarPalestrantesServlet", urlPatterns = "/palestrante/lista")
public class ListarPalestrantesServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        IPalestranteService service = ServiceFactory.palestrante();

        ArrayList<Palestrante> palestrantes = service.indexPalestrantes();

        request.setAttribute("palestrantes", palestrantes);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/paginas/participante/ListaPalestrantes.jsp");
        dispatcher.forward(request, response);
    }

}
