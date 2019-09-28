package repository;

import model.Empresa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BancoDeDados {


    //ATRIBUTO ESTÁTICO DA CLASSE
    private static List<Empresa> list = new ArrayList<Empresa>();

    static {
        Empresa empresa = new Empresa();
        empresa.setNome("Auto Peças");
        empresa.setId(101);
        empresa.setDataAbertura(new Date());

        Empresa empresa2 = new Empresa();
        empresa2.setNome("Moto Shopping");
        empresa2.setId(102);
        empresa2.setDataAbertura(new Date());

        list.add(empresa);
        list.add(empresa2);
    }


    //MÉTODO PARA ADICIONAR EMPRESA AO  BANCO FAKE
    public void add(Empresa empresa) {
        list.add(empresa);

    }

    //MÉTODO PARA LISTAR EMPRESAS QUE ESTÃO NO BANCO FAKE
    public List<Empresa> getEmpresas(){

        return BancoDeDados.list;
    }
}
