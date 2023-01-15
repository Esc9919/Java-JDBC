package model.dao;

import java.util.List;

import model.entities.Departiment;

public interface DepartmentDao {

	void insert(Departiment obj);
	void update(Departiment obj);
	void deleteById(Integer id);
	Departiment findbyId(Integer id);
	List<Departiment> findAll();
	
}
