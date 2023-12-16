package com.adobe.aem.mysite.site.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)

public class MultiImage {
	
	
	@ValueMapValue
	private String fileReference;
	
	@ValueMapValue
	private String linkPath;
	

	public String getFileReference() {
		return fileReference;
	}


	public String getLinkPath() {
		return linkPath;
	}






	
	

}
