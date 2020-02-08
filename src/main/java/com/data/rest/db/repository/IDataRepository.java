/**
 * 
 */
package com.data.rest.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.rest.db.entity.Data;

/**
 * @author
 */
public interface IDataRepository extends JpaRepository<Data, Long> {

}
