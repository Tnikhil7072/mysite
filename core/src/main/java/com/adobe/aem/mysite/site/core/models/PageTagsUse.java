package com.adobe.aem.mysite.site.core.models;

import java.util.Iterator;

import com.adobe.cq.sightly.WCMUsePojo;
import com.day.cq.tagging.Tag;

public class PageTagsUse extends WCMUsePojo {
	private Tag[] tags;

    @Override
    public void activate() throws Exception {
        tags = getCurrentPage().getTags();
    }

    public Tag[] getTags() {
        return tags;
    }
}
