import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

@WebServlet(urlPatterns = "/home")
public class PrimeiroServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        Writer out = resp.getWriter();
        out.write("<html>");
        out.write("<body>");
        out.write("<h1>");
        out.write("Hello");
        out.write("</h1>");
        out.write("</body>");
        out.write("</html>");

    }
}
