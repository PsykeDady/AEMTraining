
package com.moveo.aem.training.core.beans.response.bitcoin.domenico;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BTC"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("BTC")
    private Btc btc;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("BTC")
    public Btc getBtc() {
        return btc;
    }

    @JsonProperty("BTC")
    public void setBtc(Btc btc) {
        this.btc = btc;
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
