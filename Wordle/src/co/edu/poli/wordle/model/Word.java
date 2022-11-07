package co.edu.poli.wordle.model;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import co.edu.poli.wordle.conector.ConectionCRUD;
import co.edu.poli.wordle.controller.*;

public class Word {

	public int id ;
	public String name;

	public Word() {

	}

	public Word(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Word [id=" + id + ", name=" + name + "]";
	} 

	public boolean skipLine(String wordBD) {
		boolean answer = false;
		if (this.name.compareToIgnoreCase(wordBD) == 0) {
			answer = true;
		}
		return answer;
	} 
	
	public String rightLocation(String nameBD) {
		String str = "";
		for (int i = 0; i < this.name.length(); i++) {
			String letra = this.name.substring(i, i + 1);
			if (letra.equals(nameBD.toUpperCase().substring(i, i + 1))) {
				str += 1;
			} else if (nameBD.toUpperCase().indexOf(letra) > -1) {
				str += 0;
			} else {
				str += 2;
			}
		}
		return str;
	}
}