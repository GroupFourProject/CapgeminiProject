package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Movies;


@Component  
public class MoviesDAOImpl implements MoviesDAO {

	
	
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addMovies(Movies movies) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(movies);
		session.flush();
		session.getTransaction().commit();
		session.close();
	
	}

	@Override
	public Movies findMovies(int movieId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Movies movies=session.find(Movies.class, movieId);
		return movies;
	}

	@Override
	public List<Movies> findAllMovies() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		List<Movies> movieslist=session.createQuery("select m from movies m").list();
		
		
		return movieslist;
	}

	@Override
	public boolean updateMovies(Movies movies) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(movies);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteMovies(Movies movies) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.delete(movies);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}
}
