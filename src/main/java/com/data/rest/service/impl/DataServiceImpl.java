/**
 * 
 */
package com.data.rest.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.data.rest.db.entity.CustomerInfo;
import com.data.rest.db.repository.IDataRepository;
import com.data.rest.service.IDataService;

/**
 * @author 
 */
@Service
public class DataServiceImpl implements IDataService {

	@Autowired
	private IDataRepository dataRepository;
	
	/**
	 * @see com.data.rest.service.IDataService#addData()
	 */
	@Override
	public void addData() {

	}

	@Override
	public List<CustomerInfo> getAllInfo() {
		
		return dataRepository.getAllInfo();
	}

	@Override
	public List getFilterData(String id) {
		return dataRepository.getFilterData(id);
	}
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	@Override
	@Transactional
	public boolean save(Object entity) {
		boolean success = false;
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction tx = null;
		try {
			tx = entityManager.getTransaction();
			tx.begin();
			entityManager.persist(entity);
			tx.commit();
			success = true;
		} catch (RuntimeException e) {
			if (tx != null && tx.isActive()) {
				tx.rollback();
			}
			String errorMessage = e.getMessage();
			if (e instanceof ConstraintViolationException) {
				ConstraintViolationException ex = (ConstraintViolationException) e;
				if (!CollectionUtils.isEmpty(ex.getConstraintViolations())
						&& ex.getConstraintViolations().iterator().hasNext()) {
					errorMessage = ex.getConstraintViolations().iterator().next().getMessage();
				}
			} else if (e.getCause() != null
					&& e.getCause() instanceof org.hibernate.exception.ConstraintViolationException
					&& e.getCause().getCause() != null) {
				errorMessage = e.getCause().getCause().getMessage();
			}
		} finally {
			entityManager.close();
		}
		return success;
	}
	
}
