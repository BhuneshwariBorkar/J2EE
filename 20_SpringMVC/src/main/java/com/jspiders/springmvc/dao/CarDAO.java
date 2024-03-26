package com.jspiders.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.jspiders.springmvc.dto.CarDTO;

@Component
public class CarDAO {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private EntityTransaction entityTransaction;

	private void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("car");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}

	private void closeConnection() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction != null) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}
	}

	public void addCar(CarDTO carDTO) {
		openConnection();
		entityTransaction.begin();
		entityManager.persist(carDTO);
		entityTransaction.commit();
		closeConnection();
	}

	public List<CarDTO> findAllCars() {
		openConnection();
		Query query = entityManager.createQuery("SELECT car FROM CarDTO car");
		@SuppressWarnings("unchecked")
		List<CarDTO> cars = query.getResultList();
		closeConnection();
		return cars;
	}

}