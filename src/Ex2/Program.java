package Ex2;

import Ex2.entities.Aluno;
import Ex2.entities.Endereco;
import Ex2.entities.Instrutor;
import Ex2.entities.Turma;

public class Program {

    Instrutor instrutor = new Instrutor("5120085120", "Vitor", "10/09/1993", "Educador Fisico", null);
    Aluno aluno1 = new Aluno("alu20220001", "22/06/2022", "Gabriel",
            new Endereco("Avenida Presidente Getulio Vargas", 5158, "Tijuca", "Alvorada", null),
            "51999887766", "29/12/2001", 175, 78.6, 1);
    Aluno aluno2 = new Aluno("alu20220002", "28/03/2022", "João",
            new Endereco("Avenida Presidente Getulio Vargas", 2138, "Americana", "Alvorada", null),
            "51911223344", "30/02/1997", 185, 83.4, 0);

    Turma turma1 = new Turma(1, 2, "13:30", 90, "Musculação", instrutor, "21/06/2022", "22/06/2023");
}
