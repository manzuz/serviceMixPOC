//package com.conztanz.connect.camel;
//
//
//import com.conztanz.connect.identification.IAbstractConnectIdentifier;
//import com.conztanz.connect.initialize.IAbstractConnectInitializer;
//import com.conztanz.connect.model.IncomingMessage;
//import com.conztanz.connect.transform.AbstractConnectSmooksTransformer;
//import org.apache.camel.Processor;
//import org.apache.camel.builder.RouteBuilder;
///**
// *
// * @author User
// *
// * @param <INITIALIZER>
// * @param <PREPROCESSOR>
// * @param <IDENTIFIER>
// */
//public abstract class AbstractOrchestrationCamelRoute<INITIALIZER  extends IAbstractConnectInitializer<? extends AbstractConnectSmooksTransformer, ? extends IncomingMessage<?>>,
//													  PREPROCESSOR extends Processor,
//													  IDENTIFIER   extends IAbstractConnectIdentifier<?>>
//						extends RouteBuilder
//{
//
//	@Override
//	public void configure() throws Exception
//    {
//
//        /**
//         * TODO : two steps (from init to continuity, transacted, then the rest not transacted)
//         */
//		from(this.getRouteEndpoint())
//			.transacted()
//			.bean(this.getInitializer(), "init(${body})")
//			.bean(this.getIdentifier(),"identify(${body})");
//
//	}
//
//	/**
//	 *
//	 * @return
//	 */
//	public abstract INITIALIZER getInitializer();
//
//	/**
//	 * TODO : method name
//	 *
//	 * @return
//	 */
//	public abstract PREPROCESSOR getProcessor();
//
//	/**
//	 * @return
//	 */
//	public abstract String getRouteEndpoint();
//
//	/**
//	 *
//	 * @return
//	 */
//	public abstract IDENTIFIER getIdentifier();
//
//}
