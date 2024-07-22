package ar.edu.ort.tp1.parcial2.clases;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaDeJuguetesPorId extends ListaOrdenadaNodos<Integer, Juguete> {

	@Override
	public int compare(Juguete j1, Juguete j2) {
		return j1.getId() - j2.getId();
	}

	@Override
	public int compareByKey(Integer id, Juguete j) {
		return id - j.getId();
	}

}
