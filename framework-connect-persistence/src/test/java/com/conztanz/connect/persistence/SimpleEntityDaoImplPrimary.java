//package com.conztanz.persistence.connect;
//
//import javax.inject.Singleton;
//import javax.transaction.Transactional;
//import javax.transaction.Transactional.TxType;
//
//import org.ops4j.pax.cdi.api.OsgiServiceProvider;
//import org.springframework.transaction.annotation.Propagation;
//
//import com.conztanz.connect.persistence.AbstractConnectDaoImpl;
//import com.conztanz.exception.ConztanzException;
//import com.conztanz.exception.PersistenceException;
//import com.conztanz.model.test.SimpleEntity;
//
//
//@OsgiServiceProvider(classes = { ISimpleEntityDao.class})
//@Singleton
//public class SimpleEntityDaoImplPrimary extends AbstractConnectDaoImpl<SimpleEntity> implements ISimpleEntityDao {
//
//	public SimpleEntityDaoImplPrimary() {
//		super(SimpleEntity.class);
//	}
//
//
//	@Override
//	@Transactional(rollbackOn = { ConztanzException.class }, value = TxType.MANDATORY)
//	@org.springframework.transaction.annotation.Transactional(
//			readOnly = false, rollbackFor = { ConztanzException.class }, propagation = Propagation.MANDATORY)
//	public SimpleEntity add(SimpleEntity entity) throws PersistenceException {
//		return super.add(entity);
//	}
//
//
//	public int getTotalCount() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//}
