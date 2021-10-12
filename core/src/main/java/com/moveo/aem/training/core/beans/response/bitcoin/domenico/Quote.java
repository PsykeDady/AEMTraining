
package com.moveo.aem.training.core.beans.response.bitcoin.domenico;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EUR"
})
@Generated("jsonschema2pojo")
public class Quote {

    @JsonProperty("EUR")
    private Eur eur;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("EUR")
    public Eur getEur() {
        return eur;
    }

    @JsonProperty("EUR")
    public void setEur(Eur eur) {
        this.eur = eur;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
