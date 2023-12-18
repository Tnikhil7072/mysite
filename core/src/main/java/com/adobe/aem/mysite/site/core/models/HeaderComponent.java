package com.adobe.aem.mysite.site.core.models;

import java.util.ArrayList;
import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables=Resource.class,defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class HeaderComponent {
	
	@ValueMapValue
	private String mainLabel;
	
	@ValueMapValue
	private String text1;
	
	@ValueMapValue
	private String linkPath1;
	
	

	@ChildResource
	private List<HeaderNavigationcomponent> links = new  ArrayList<>();

	public String getText1() {
		return text1;
	}
	public String getMainLabel() {
		return mainLabel;
	}

	public String getLinkPath1() {
		return linkPath1;
	}

	public List<HeaderNavigationcomponent> getLinks() {
		return links;
	}

}
