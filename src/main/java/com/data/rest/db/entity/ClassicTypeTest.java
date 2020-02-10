/**
 * 
 */
package com.data.rest.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author
 *
 */
@Entity
@Table(name = "classictypetest")
public class ClassicTypeTest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long _id;

	@Column(name = "json_object")
	private String jsonObject;

	/**
	 * @return the _id
	 */
	public long get_id() {
		return _id;
	}

	/**
	 * @param _id
	 *            the _id to set
	 */
	public void set_id(long _id) {
		this._id = _id;
	}

	/**
	 * @return the jsonObject
	 */
	public String getJsonObject() {
		return jsonObject;
	}

	/**
	 * @param jsonObject
	 *            the jsonObject to set
	 */
	public void setJsonObject(String jsonObject) {
		this.jsonObject = jsonObject;
	}

}
