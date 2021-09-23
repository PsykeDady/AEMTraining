/*
 *  Copyright 2015 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
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

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;

import java.util.Optional;

@Model(adaptables = Resource.class)
public class HelloWorldAlfredoModel {

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
    private String titoloLower;

    @ValueMapValue
    private String mexLower;

    private String titoloUp;
    private String mexUp;

    @PostConstruct
    protected void init() {
//        PageManager pageManager = resourceResolver.adaptTo(PageManager.class);
//        String currentPagePath = Optional.ofNullable(pageManager)
//                .map(pm -> pm.getContainingPage(currentResource))
//                .map(Page::getPath).orElse("");

//        titoloLower = "Mio esempio di testo che passa per java";
//        testo = "Secondo testo inserito statico";

        // versione con Optional
        titoloUp = Optional.of(titoloLower).orElse("").toUpperCase();

        // versione con if ternario
        mexUp =  mexLower==null ? "": mexLower.toUpperCase();
    }

//    public String getMessage() {
//        return messaggio;
//    }
//    public String getTitoloLower(){
//        return titoloLower;
//    }
//    public String getMexLower(){
//        return mexLower;
//    }

    public String getTitoloUp(){
        return titoloUp;
    }
    public String getMexUp(){
        return mexUp;
    }

}