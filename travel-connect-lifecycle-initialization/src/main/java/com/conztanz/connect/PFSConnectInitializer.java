//package com.conztanz.connect;
//
//import com.conztanz.connect.model.factory.AbstractIncomingMessageFactory;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.conztanz.connect.factory.PFSIncomingMessageFactory;
//import com.conztanz.connect.initialize.AbstractConnectInitializer;
//import com.conztanz.connect.transform.travel.airimp.PFSSmooksTransformer;
//import com.conztanz.connect.travel.model.PFSIncomingMessage;
//
///**
// *
// * @author User
// *
// */
//
//
//public class PFSConnectInitializer extends AbstractConnectInitializer<PFSSmooksTransformer, PFSIncomingMessage> {
//
//	@Autowired
//	private PFSIncomingMessageFactory pFSIncomingMessageFactory;
//
//	@Autowired
//	private PFSSmooksTransformer pFSSmooksTransformer;
//
//	@Override
//	public AbstractIncomingMessageFactory<PFSIncomingMessage> getMessageFactory() {
//		return pFSIncomingMessageFactory;
//	}
//
//	@Override
//	public PFSSmooksTransformer getSmooksTransformer()
//    {
//		return pFSSmooksTransformer;
//	}
//
//}
