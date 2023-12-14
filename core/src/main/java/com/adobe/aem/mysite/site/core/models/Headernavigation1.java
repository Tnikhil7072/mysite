package com.adobe.aem.mysite.site.core.models;

import java.util.ArrayList;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class Headernavigation1 {
	
	@ValueMapValue
	private String mainLabel;
	
	@ValueMapValue
	private String fileReference;
	
	@ChildResource
	private List<Headernavigation> links=new ArrayList<>();

	public String getMainLabel() {
		return mainLabel;
	}

	public String getFileReference() {
		return fileReference;
	}

	public List<Headernavigation> getLinks() {
		return links;
	}
	
	
	


	}
	
	
	
	
	
	


