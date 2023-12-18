package com.adobe.aem.mysite.site.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables= Resource.class ,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class MultiTask {
	
	
	@ValueMapValue
    private String linkPath;
	
	@ValueMapValue
	private String text;

	
	
    public String getLinkPath() {
		return linkPath;
	}


	public String getText() {
		return text;
	}
	
	



	
}
