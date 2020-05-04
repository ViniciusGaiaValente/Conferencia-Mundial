package servlets.participante;

import aplication.ServiceFactory;
import helpers.TratadorDeErros;
import interfaces.services.IParticipanteService;
import models.domain.Participante;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FormParticipanteServlet", urlPatterns = "/participante/adiciona")
public class EnviarFormParticipanteServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {

            IParticipanteService servico = ServiceFactory.participante();

            Participante participante = new Participante();

            participante.nome = (String) request.getParameter("nome");
            participante.cpf = (String) request.getParameter("cpf");
            participante.endereco = (String) request.getParameter("endereco");
            participante.telefone = (String) request.getParameter("telefone");
            participante.email = (String) request.getParameter("email");

            boolean ehEditar = (boolean) request.getAttribute("ehEditar") ;



            //TODO validar participante

            servico.createParticipante(participante);

            response.sendRedirect(request.getContextPath() + "/index.jsp");

        } catch (Exception e) {
            TratadorDeErros.tratarErro(e.getLocalizedMessage(), 500, request, response);
        }
    }

}
