package org.netkernel.helloworld;

import org.netkernel.layer0.nkf.INKFRequestContext;
import org.netkernel.layer0.nkf.INKFResponse;
import org.netkernel.layer0.representation.ByteArrayRepresentation;
import org.netkernel.module.standard.endpoint.StandardAccessorImpl;
import org.apache.commons.compress.utils.ArchiveUtils;

public class HelloLibAccessor extends StandardAccessorImpl {

    @Override
	public void onSource(INKFRequestContext aContext) throws Exception
	{	
		byte[] ascii=ArchiveUtils.toAsciiBytes("Hello Resource Oriented World");
		/**
		 * ArchiveUtils is a utility in the Apache Commons Compress jar
		 * which in this project is located in this module in the /lib/ directory.
		 * 
		 * In NetKernel modules all jar files in a lib/ directory
		 * are automatically added to the runtime classpath.
		 * 
		 * The NetKernel gradle plugin searches the src structure to find /lib/ jars
		 * and automatically adds them to the compile-time classpath
		 * 
		 * The eclipse plugin automatically takes the netkernel plugin's compile
		 * time classpath to create a correctly linked development project.
		 */
				
		INKFResponse resp=aContext.createResponseFrom(new ByteArrayRepresentation(ascii));
		resp.setMimeType("text/plain");
	}

}
