import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import javax.annotation.security.RunAs;

import static io.restassured.RestAssured.given;

public class ClassTest {


    private String path = "http://localhost:8080/servlets_Web_exploded/";

    @Test
    private void deveRetornarEmpresasCadastradas(){

        given().
        when().
                get(path+"listaEmpresas.jsp").
        then().
                statusCode(HttpStatus.SC_OK).
                log().
                all();


    }
}
