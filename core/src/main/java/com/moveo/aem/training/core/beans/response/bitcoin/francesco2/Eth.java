
package com.moveo.aem.training.core.beans.response.bitcoin.francesco2;

import java.util.HashMap;
import java.util.List;
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
    "id",
    "name",
    "symbol",
    "slug",
    "num_market_pairs",
    "date_added",
    "tags",
    "max_supply",
    "circulating_supply",
    "total_supply",
    "is_active",
    "platform",
    "cmc_rank",
    "is_fiat",
    "last_updated",
    "quote"
})
@Generated("jsonschema2pojo")
public class Eth {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("num_market_pairs")
    private Integer numMarketPairs;
    @JsonProperty("date_added")
    private String dateAdded;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("max_supply")
    private Object maxSupply;
    @JsonProperty("circulating_supply")
    private Double circulatingSupply;
    @JsonProperty("total_supply")
    private Double totalSupply;
    @JsonProperty("is_active")
    private Integer isActive;
    @JsonProperty("platform")
    private Object platform;
    @JsonProperty("cmc_rank")
    private Integer cmcRank;
    @JsonProperty("is_fiat")
    private Integer isFiat;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("quote")
    private Quote__2 quote;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("num_market_pairs")
    public Integer getNumMarketPairs() {
        return numMarketPairs;
    }

    @JsonProperty("num_market_pairs")
    public void setNumMarketPairs(Integer numMarketPairs) {
        this.numMarketPairs = numMarketPairs;
    }

    @JsonProperty("date_added")
    public String getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("date_added")
    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("max_supply")
    public Object getMaxSupply() {
        return maxSupply;
    }

    @JsonProperty("max_supply")
    public void setMaxSupply(Object maxSupply) {
        this.maxSupply = maxSupply;
    }

    @JsonProperty("circulating_supply")
    public Double getCirculatingSupply() {
        return circulatingSupply;
    }

    @JsonProperty("circulating_supply")
    public void setCirculatingSupply(Double circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    @JsonProperty("total_supply")
    public Double getTotalSupply() {
        return totalSupply;
    }

    @JsonProperty("total_supply")
    public void setTotalSupply(Double totalSupply) {
        this.totalSupply = totalSupply;
    }

    @JsonProperty("is_active")
    public Integer getIsActive() {
        return isActive;
    }

    @JsonProperty("is_active")
    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("platform")
    public Object getPlatform() {
        return platform;
    }

    @JsonProperty("platform")
    public void setPlatform(Object platform) {
        this.platform = platform;
    }

    @JsonProperty("cmc_rank")
    public Integer getCmcRank() {
        return cmcRank;
    }

    @JsonProperty("cmc_rank")
    public void setCmcRank(Integer cmcRank) {
        this.cmcRank = cmcRank;
    }

    @JsonProperty("is_fiat")
    public Integer getIsFiat() {
        return isFiat;
    }

    @JsonProperty("is_fiat")
    public void setIsFiat(Integer isFiat) {
        this.isFiat = isFiat;
    }

    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("last_updated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("quote")
    public Quote__2 getQuote() {
        return quote;
    }

    @JsonProperty("quote")
    public void setQuote(Quote__2 quote) {
        this.quote = quote;
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
