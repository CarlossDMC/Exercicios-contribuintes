package entities;

public class PessoaJuridica extends Pessoa{
	
	private Integer numeroFuncionarios;

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public Double getImposto() {
		if(numeroFuncionarios < 10) {
			imposto = (rendaAnual*16)/100;
		}
		
		if(numeroFuncionarios > 10) {
			imposto = (rendaAnual*14)/100;
		}

		
		return imposto;
	}

}
	

