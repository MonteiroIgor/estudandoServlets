import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet("/cadastroEmpresa")
public class CadastroEmpresaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException {

        System.out.println("log: iniciando Cadastro empresa");

        String nomeEmpresa = request.getParameter("nome");

        PrintWriter out = response.getWriter();
        out.println("<html><body>Empresa >> "+ nomeEmpresa +"  << CADASTRA COM SUCESSO</body></html>");
    }
}
