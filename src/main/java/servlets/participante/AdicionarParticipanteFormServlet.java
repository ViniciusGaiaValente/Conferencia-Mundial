package servlets.participante;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MostarFormParticipanteServlet", urlPatterns = "/participante/form")
public class AdicionarParticipanteFormServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("ehEditar", false);
        request.getRequestDispatcher("/paginas/participante/FormParticipante.jsp").forward(request, response);
    }

}
