package com.adobe.aem.mysite.site.core.models;

import java.util.ArrayList;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
		public class MultiTaskClass {

	@ValueMapValue
	private String mainLabel;
	
	
	@ValueMapValue
	private String fileReference;
	
	@ValueMapValue
	private String linkPaths;
	
	@ValueMapValue
	private String label;
	
	@ChildResource
	private List<MultiTask> links=new ArrayList<>();
	
	
	public List<MultiTask> getLinks() {
		List<MultiTask> linkscopy = new ArrayList<MultiTask>();
		linkscopy.addAll(links);
		return linkscopy;
	}

	public String getMainLabel() {
		return mainLabel;
	}

	public String getFileReference() {
		return fileReference;
	}

	public String getLinkPaths() {
		return linkPaths;
	}

	public String getLabel() {
		return label;
	}

	
	
	
	
	
	
	
	
}
