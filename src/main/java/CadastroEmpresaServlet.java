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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@WebServlet("/cadastroEmpresa")
public class CadastroEmpresaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    Random random = new Random();

    private Date dataFormatada;
    private int idRandom = random.nextInt(100);



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException,IOException {

        System.out.println("Cadastrando Nova Empresa!");

        String nomeEmpresa = request.getParameter("nome");
        String data = request.getParameter("data");


        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            dataFormatada = format.parse(data);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        //INSTANCIANDO EMPRESA
        Empresa empresa = new Empresa();

        empresa.setId(idRandom);
        empresa.setNome(nomeEmpresa);
        empresa.setDataAbertura(dataFormatada);


        //INSTANCIANDO BANCO FAKE E INSERINDO EMPRESA AO BANCO DE DADOS
        BancoDeDados bancoDeDados = new BancoDeDados();
        bancoDeDados.add(empresa);


        request.setAttribute("empresa",empresa.getNome() );
        RequestDispatcher rd = request.getRequestDispatcher("novaEmpresaCriada.jsp");
        rd.forward(request,response);

    }
}
 