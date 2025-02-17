package ar.edu.ort.tp1.parcial2.clases;

public class Peluche extends Juguete {
	
	private static final String MSG_PELUCHE = "El peluche cuesta %.2f es de modelo %s es de la marca %s y tiene un id %d\n";
	private static final String MSG_MODELO = "El modelo es invalido";

	private String modelo;
	public Peluche(int id, String marca, String modelo, float precio) {
		super(id, marca, precio);
		setModelo(modelo);
	}
	private void setModelo(String modelo) {
		if(modelo == null || modelo.isEmpty()) {
			throw new RuntimeException(MSG_MODELO);
		}
		this.modelo = modelo;
	}
	@Override
	public void mostrar() {
		System.out.printf(MSG_PELUCHE, getPrecio(), this.modelo, getMarca(), getId());
	}
	@Override
	public int getIdx() {
		return 1;
	}
	
	
	
}
