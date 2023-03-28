import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		Projeto p1 = new Projeto("Alpha",df.parse("01/01/2023"),df.parse("01/01/2024"));
		Funcionario f1 = new Funcionario("João Vitor",TipoDeDocumento.CPF,"111-111-111-11");
		Funcionario f2 = new Funcionario("Dory",TipoDeDocumento.CPF,"222-222-222-22");
		Contratação c1 = new Contratação(df.parse("01/01/2023"),Cargo.DIRETOR,f1,p1);
		Contratação c2 = new Contratação(df.parse("01/02/2023"),Cargo.ASSESOR,f2,p1);
		
		p1.listarContratacao();
		
		c1.contratar();
		p1.listarContratacao();
		
		c1.demitir();
		c2.contratar();
		p1.listarContratacao();
		

	}

}
