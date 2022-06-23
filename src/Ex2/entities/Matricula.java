package Ex2.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Matricula {

    private String codMatricula;
    private Date dataMatricula;
    private List<Date> ausencias = new ArrayList<>();

    public Matricula(String codMatricula, String dataMatricula) {
        this.codMatricula = codMatricula;
        setDataMatricula(dataMatricula);
    }

    public String getCodMatricula() {
        return codMatricula;
    }

    public void setCodMatricula(String codMatricula) {
        this.codMatricula = codMatricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date data = format.parse(dataMatricula);
            this.dataMatricula = data;
        } catch (ParseException e) {
            System.out.println("Data informada não é válida!");
        }
    }

    public void addAusencia(String dataRecebida){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        try {
            data = format.parse(dataRecebida);
            ausencias.add(data);
        } catch (ParseException e) {
            System.out.println("Data informada não é válida!");
        }
    }

    public List<Date> getAusencias(){
        return ausencias;
    }
}
