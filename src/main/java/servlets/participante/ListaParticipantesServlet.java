package servlets.participante;

import aplication.ServiceFactory;
import interfaces.services.IParticipanteService;
import models.domain.Participante;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

@WebServlet(name = "ListaParticipantesServlet", urlPatterns = "/participante/lista")
public class ListaParticipantesServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        IParticipanteService service = ServiceFactory.participante();

        ArrayList<Participante> participantes = service.indexParticipantes();

        request.setAttribute("participantes", participantes);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/paginas/participante/ListaParticipantes.jsp");
        dispatcher.forward(request, response);
    }

}
