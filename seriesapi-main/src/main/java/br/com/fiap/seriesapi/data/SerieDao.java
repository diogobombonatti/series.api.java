package br.com.fiap.seriesapi.data;

import java.util.List;
import java.util.ArrayList;

import br.com.fiap.seriesapi.model.Serie;

public class SerieDao {
	
	List<Serie> series = new ArrayList<>();
	
	public SerieDao() {
		series = List.of(
				new Serie(1, "Lost", "Um aviao cai", "http.."),
				new Serie(1, "Os outros", "Só tratamento top", "http.."),
				new Serie(1, "Treata", "Começa batendo", "http..")
			);
	}
	
	public List<Serie> findAll(){
		return series;
	}

	public Serie findById(Long id) {
		//SELECT * FROM SERIES WHERE ID=?
		return series
				.stream()
				.filter(serie -> serie.id() == id)
				.findFirst()
				.orElse(null);
		
				
	}

}
