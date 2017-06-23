package com.conztanz.connect.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(IncomingMessage.class)
public abstract class IncomingMessage_ extends com.conztanz.model.AbstractEntity_ {

	public static volatile SingularAttribute<IncomingMessage, byte[]> rawPayload;
	public static volatile SingularAttribute<IncomingMessage, String> transformedPayload;

}

