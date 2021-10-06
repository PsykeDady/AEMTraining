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
package com.moveo.aem.training.core.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.moveo.aem.training.core.models.MeteoAlfredoModel;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

/**
 * Servlet that writes some sample content into the response. It is mounted for
 * all resources of a specific Sling resource type. The
 * {@link SlingSafeMethodsServlet} shall be used for HTTP methods that are
 * idempotent. For write operations use the {@link SlingAllMethodsServlet}.
 */
@Component(service = { Servlet.class })
@SlingServletResourceTypes(
        // ogni volta che abbiamo a che fare con il componente meteo alfredo
        // risponde  (con Sling) questa servlet
        resourceTypes="aemtraining/components/meteo-alfredo",
        methods=HttpConstants.METHOD_GET,
        extensions="json")
@ServiceDescription("Weather Servlet")
public class MeteoServlet extends SlingSafeMethodsServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(final SlingHttpServletRequest req,
            final SlingHttpServletResponse resp) throws ServletException, IOException {
        final Resource resource = req.getResource();
        // abbiamo una response gestita da una classe
        MeteoAlfredoModel meteoAlfredoModel = resource.adaptTo(MeteoAlfredoModel.class);
        // abbiamo creato un oggetto di tipo meteoalfredomodel qui dentro

        // ora facciamo l'unmarshaling (da json a oggetto di tipo meteoAlfredo)
        ObjectMapper objectMapper = new ObjectMapper();
        String meteoAlfredoJson = objectMapper.writeValueAsString(meteoAlfredoModel);
        resp.setContentType("application/json");
       // resp.getWriter().write("Title = " + resource.getValueMap().get(JcrConstants.JCR_TITLE));
        resp.getWriter().write(meteoAlfredoJson);
    }
}
