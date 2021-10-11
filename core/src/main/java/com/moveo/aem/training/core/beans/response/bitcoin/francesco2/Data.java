
package com.moveo.aem.training.core.beans.response.bitcoin.francesco2;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BNB",
    "BTC",
    "ETH"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("BNB")
    private Bnb bnb;
    @JsonProperty("BTC")
    private Btc btc;
    @JsonProperty("ETH")
    private Eth eth;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("BNB")
    public Bnb getBnb() {
        return bnb;
    }

    @JsonProperty("BNB")
    public void setBnb(Bnb bnb) {
        this.bnb = bnb;
    }

    @JsonProperty("BTC")
    public Btc getBtc() {
        return btc;
    }

    @JsonProperty("BTC")
    public void setBtc(Btc btc) {
        this.btc = btc;
    }

    @JsonProperty("ETH")
    public Eth getEth() {
        return eth;
    }

    @JsonProperty("ETH")
    public void setEth(Eth eth) {
        this.eth = eth;
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
