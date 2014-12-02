package org.netkernel.helloworld;

import org.netkernel.layer0.nkf.INKFRequestContext;
import org.netkernel.module.standard.endpoint.StandardAccessorImpl;

public class HelloAccessor extends StandardAccessorImpl {

    @Override
	public void onSource(INKFRequestContext aContext) throws Exception
	{	aContext.createResponseFrom("Hello Resource Oriented World");
	}

}
