package com.regis.padraoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.regis.padraoapp.dao.DepartamentoDao;
import com.regis.padraoapp.model.Departamento;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

	@Autowired
	private DepartamentoDao dao;
	
	@Override
	@Transactional(readOnly=false)
	public void salvar(Departamento departamento) {
		dao.save(departamento);
	}

	@Override
	@Transactional(readOnly=false)
	public void editar(Departamento departamento) {
		dao.update(departamento);
	}

	@Override
	@Transactional(readOnly=false)
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	public Departamento buscarPorId(Long id) {		
		return dao.findById(id);
	}

	@Override
	public List<Departamento> buscarTodos() {
		return dao.findAll();
	}

	@Override
	public boolean departamentoTemCargos(Long id) {
		{
			return false;
		}
	}
	
}