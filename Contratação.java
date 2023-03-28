import java.util.Date;

public class Contratação {
	
	private Date data;
	private Cargo cargo;
	private Status status;
	private Funcionario funcionario;
	private Projeto projeto;
	
	public Contratação(Date data, Cargo cargo, Funcionario funcionario, Projeto projeto) {
		this.data = data;
		this.cargo = cargo;
		this.status = status.PENDENTE;
		this.funcionario = funcionario;
		this.projeto = projeto;
	}
	
	public Date getData() {
		return data;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public Status getStatus() {
		return status;
	}

	public void pendente() {
		
			this.status = Status.PENDENTE;
	}
	
	public void contratar() {
		
		if (this.status == Status.PENDENTE ) {
			this.status = Status.CONTRATADO;
		}
	}
	
	public void demitir() {
		if (this.status == Status.CONTRATADO ) {
			this.status = Status.DEMITIDO;
		}
	}

	@Override
	public String toString() {
		return "Contratação [data=" + data + ", cargo=" + cargo + ", status=" + status + ", funcionario=" + funcionario
				+ ", projeto=" + projeto + "]";
	}

	
	
	

}
