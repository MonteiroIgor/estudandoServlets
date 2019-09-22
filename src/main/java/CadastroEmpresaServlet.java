import model.Empresa;
import repository.BancoDeDados;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Random;

@WebServlet("/cadastroEmpresa")
public class CadastroEmpresaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException {

        System.out.println("Cadastrando Nova Empresa!");

        String nomeEmpresa = request.getParameter("nome");

        //INSTANCIANDO EMPRESA
        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);

        //INSTANCIANDO BANCO FAKE E INSERINDO EMPRESA AO BANCO DE DADOS
        BancoDeDados bancoDeDados = new BancoDeDados();
        bancoDeDados.add(empresa);

        request.setAttribute("empresa",empresa.getNome() );
        RequestDispatcher rd = request.getRequestDispatcher("novaEmpresaCriada.jsp");
        rd.forward(request,response);

    }
}
 