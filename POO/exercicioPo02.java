package Projeto28;
/*2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião,
 *  defina as instancias deste objeto e apresente as informações deste objeto no console.*/
public class exercicioPo02 {
	private String nomeModelo;
	private String Marca;
	private String ModalidadeVoo;
	private int Poltronas;
	
	
	public exercicioPo02 (String Marca, String nomeModelo, String ModalidadeVoo, int Poltronas)

	{
		this.nomeModelo = nomeModelo;
		this.Marca = Marca;
		this.ModalidadeVoo = ModalidadeVoo;
		this.Poltronas = Poltronas;
	}
	public exercicioPo02(String nomeModelo)
	{
	this.nomeModelo = nomeModelo;
		}
	public void imprimirInfo()
	{
		System.out.println(nomeModelo+" pertence ao fabricante "+Marca+
				", sendo um modelo "+ModalidadeVoo+". Portanto possui "+Poltronas+" poltronas para os passageiros.");
	}
	public String getNomeModelo() {
		return nomeModelo;
	}
	public void setNomeModelo(String nomeModelo) {
		this.nomeModelo = nomeModelo;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModalidadeVoo() {
		return ModalidadeVoo;
	}
	public void setModalidadeVoo(String modalidadeVoo) {
		ModalidadeVoo = modalidadeVoo;
	}
	public int getPoltronas() {
		return Poltronas;
	}
	public void setPoltronas(int Poltronas) {
		Poltronas = Poltronas;
	}

	}

