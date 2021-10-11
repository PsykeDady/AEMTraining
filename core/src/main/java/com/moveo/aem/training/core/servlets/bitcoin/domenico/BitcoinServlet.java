package com.moveo.aem.training.core.servlets.bitcoin.domenico;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.moveo.aem.training.core.models.bitcoin.domenico.BitcoinDom;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(service = { Servlet.class })
@SlingServletResourceTypes(
        resourceTypes = "aemtraining/components/bitcoindomenico",
        methods = HttpConstants.METHOD_GET,
        extensions ="json")
@ServiceDescription("Bitcoin")
public class BitcoinServlet extends SlingSafeMethodsServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(final SlingHttpServletRequest req,
                         final SlingHttpServletResponse resp) throws ServletException, IOException{
        final Resource resource = req.getResource();
        BitcoinDom bitcoinDom = resource.adaptTo(BitcoinDom.class);
        ObjectMapper objectMapper = new ObjectMapper();
        String bitcoinModelJson = objectMapper.writeValueAsString(bitcoinDom);
        resp.setContentType("application/json");
        resp.getWriter().write(bitcoinModelJson);
    }
}
