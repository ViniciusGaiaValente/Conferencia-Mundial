package servlets.palestrante;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MostrarFormPalestranteServlet", urlPatterns = "/palestrante/form")
public class MostrarFormPalestranteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/paginas/participante/FormPalestrante.jsp").forward(request, response);
    }

}
