package entities;

public class PessoaFisica extends Pessoa{
	
	private Double gastosSaude;

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double getImposto() {
		if(rendaAnual < 20000 && gastosSaude > rendaAnual/2) {
			imposto = (((rendaAnual*15)/100)*50)/100;
		}
		
		if(rendaAnual > 20000 && gastosSaude > rendaAnual/2) {
			imposto = (((rendaAnual*25)/100)*50)/100;
		}
		
		if(rendaAnual > 20000 && gastosSaude < rendaAnual/2) {
			imposto = (rendaAnual*25)/100;
		}
		
		if(rendaAnual < 20000 && gastosSaude < rendaAnual/2) {
			imposto = (rendaAnual*15)/100;
		}
		
		return imposto;
	}

}


	
	