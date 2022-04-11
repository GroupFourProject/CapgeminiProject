package com.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.model.*;
import java.util.*;

@Service
public class UserrService {

	
	@Autowired(required = false)
	UserrDAO  userrDAOImpl;
	
	public void add(Userr userr)
	{
		userrDAOImpl.addUserr(userr);
	}
	public Userr find(int id)
	{
		return userrDAOImpl.findUserr(id);
	}
	public List<Userr> findAll()
	{
		return userrDAOImpl.findAllUserr();
	}
	
	public boolean upadte(Userr userr)
	{
		return userrDAOImpl.updateUserr(userr);
	}
	
	public boolean delete(Userr userr)
	{
		return userrDAOImpl.deleteUserr(userr);
	}
}
