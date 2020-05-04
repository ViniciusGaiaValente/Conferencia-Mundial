package servlets.participante;

import aplication.ServiceFactory;
import helpers.TratadorDeErros;
import interfaces.services.IParticipanteService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ExcluirParticipanteServlet", urlPatterns = "/participante/excluir")
public class ExcluirParticipanteServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {

            IParticipanteService participanteService = ServiceFactory.participante();
            int idParticipante = Integer.parseInt(request.getParameter("idParticipante"));

            participanteService.deleteParticipante(idParticipante);

            response.sendRedirect(request.getContextPath() + "/index.jsp");

        } catch (Exception e) {
            TratadorDeErros.tratarErro(e.getLocalizedMessage(), 500, request, response);
        }
    }

}
