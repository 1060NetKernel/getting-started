package org.netkernel.helloworld;

import org.netkernel.layer0.nkf.INKFRequestContext;
import org.netkernel.module.standard.endpoint.StandardAccessorImpl;

public class HelloMicroServiceAccessor extends StandardAccessorImpl {

    @Override
	public void onSource(INKFRequestContext aContext) throws Exception
	{	
    	///Request the url parameter resource from the httpRequest: resources
    	String url=aContext.source("httpRequest:/param/url", String.class);
		
		//Request the web resource...
		String webres=aContext.source(url, String.class);
	
		//Issue our response as the uppercase of the web resource
		aContext.createResponseFrom(webres.toUpperCase());
	}

}
