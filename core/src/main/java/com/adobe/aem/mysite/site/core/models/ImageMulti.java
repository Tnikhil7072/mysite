package com.adobe.aem.mysite.site.core.models;
 
import java.util.ArrayList;
import java.util.List;
 
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
 
 
@Model(adaptables=Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ImageMulti {
	
	
	@ValueMapValue
	private String mainLabel;
	
	
	
	@ChildResource
	private List<MultiImage> links = new ArrayList<>();
	
	
 
	public String getMainLabel() {
		return mainLabel;
	}
 
	public List<MultiImage> getLinks() {
		return links;
	}
 
}