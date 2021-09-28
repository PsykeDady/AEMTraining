package com.moveo.aem.training.core.models;
import static org.apache.sling.api.resource.ResourceResolver.PROPERTY_RESOURCE_TYPE;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.settings.SlingSettingsService;
import org.eclipse.jetty.util.Retainable;

@Model(adaptables = Resource.class)
public class PsykeMeteoModel {
    @ValueMapValue(name=PROPERTY_RESOURCE_TYPE, injectionStrategy=InjectionStrategy.OPTIONAL)
    @Default(values="No resourceType")
    protected String resourceType;

    @OSGiService
    private SlingSettingsService settings;
    @SlingObject
    private Resource currentResource;
    @SlingObject
    private ResourceResolver resourceResolver;

    @ValueMapValue
    private String latitudine;

    @ValueMapValue
    private String longitudine;

    private String outLong="",outLati="";

	public String getOutLati(){
		return outLati;
	}

	public String getOutLong(){
		return outLong;	
	}

    @PostConstruct
    protected void init() {
        if(latitudine!=null) outLati=latitudine;
        if(longitudine!=null) outLong=longitudine;
    }

    

}
