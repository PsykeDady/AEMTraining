package com.moveo.aem.training.core.servlets.bitcoin.francesco2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.moveo.aem.training.core.models.bitcoin.francesco2.BitcoinFrancesco;
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
        resourceTypes = "aemtraining/components/bitcoinfrancesco2",
        methods = HttpConstants.METHOD_GET,
        extensions ="json")
@ServiceDescription("Bitcoin")
public class BitcoinServlet extends SlingSafeMethodsServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(final SlingHttpServletRequest req,
                         final SlingHttpServletResponse resp) throws ServletException, IOException{
        final Resource resource = req.getResource();
        BitcoinFrancesco bitcoinFrancesco = resource.adaptTo(BitcoinFrancesco.class);
        ObjectMapper objectMapper = new ObjectMapper();
        String bitcoinModelJson = objectMapper.writeValueAsString(bitcoinFrancesco);
        resp.setContentType("application/json");
        resp.getWriter().write(bitcoinModelJson);
    }
}
