package com.dao;

import org.springframework.stereotype.Repository;
import java.util.*;
import com.model.*;


@Repository
public interface UserrDAO {
	
	public void addUserr(Userr userr );
	public Userr findUserr(int id);
	public List<Userr> findAllUserr();
	public boolean updateUserr(Userr userr);
	public boolean deleteUserr(Userr userr);
	
	
	
}
