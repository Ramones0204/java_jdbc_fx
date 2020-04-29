package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Departamento;

public class DepartamentoServices {
	public List<Departamento> findAll(){
		List<Departamento> list = new ArrayList<Departamento>();
		list.add(new Departamento(1, "Livros"));
		list.add(new Departamento(2, "Jogos"));
		list.add(new Departamento(3,"Informática"));
		return list;
	}
}
