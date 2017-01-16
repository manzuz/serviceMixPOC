package com.conztanz.doa;

import java.util.List;

import javax.persistence.EntityManager;

import com.conztanz.exceptions.TestRuntimeException;
import com.conztanz.persistence.model.SBRMessage;

public interface IEntityDao {
	void persist(SBRMessage message, EntityManager em, boolean fail) throws TestRuntimeException;

	public List<SBRMessage> allEntries(EntityManager em);
}
