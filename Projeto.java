import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Projeto {
	
	private String nome;
	private Date dt_inicio;
	private Date dt_termino;
	private Contratação c;
	List<Contratação> listaContratacao = new ArrayList<>();
	
	public Projeto(String nome, Date dt_inicio, Date dt_termino) {
		this.nome = nome;
		this.dt_inicio = dt_inicio;
		this.dt_termino = dt_termino;
	}
	
	public boolean adicionarContratacao(Contratação c) {
	
        boolean sucesso = false;        
        
        if (listaContratacao.size() >= 0 ) {         
        	listaContratacao.add(c);
            sucesso = true;
        }
            
        return sucesso;
	}
	
	public boolean removerContratacao(Contratação c) {
		
             boolean sucesso = false;
        
    	if (!listaContratacao.isEmpty() && listaContratacao.contains(c)) {
    		listaContratacao.remove(c);
            sucesso = true;
            }
        return sucesso;
	}
	
	public void listarContratacao() {
		
		 ;
		System.out.println("***Contratações***");
	    System.out.println("Projeto: ");
	    System.out.println("Desenvolvimento de Software Alpha" );
	    System.out.println("Funcionarios: " );
	    System.out.println(listaContratacao);
	    System.out.println("    ");
	}
	
	
	

}
