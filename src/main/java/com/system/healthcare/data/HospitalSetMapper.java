/**
 * 
 */
package com.system.healthcare.data;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.system.healthcare.model.Hospital;

/**
 * @author Neeraj
 *
 */
public class HospitalSetMapper implements FieldSetMapper<Hospital> {

	@Override
	public Hospital mapFieldSet(FieldSet fieldSet) throws BindException {
		return new Hospital(fieldSet.readLong("id"),
				fieldSet.readString("firstName"),
				fieldSet.readString("lastName"),
				fieldSet.readDate("birthdate", "yyyy-MM-dd HH:mm:ss"));
		return null;
	}

}
