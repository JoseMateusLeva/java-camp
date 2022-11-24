package br.dh.meli.auth.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class BatchStock {
    @JsonProperty("batchNumber")
    private String batchNumber;
    @JsonProperty("productId")
    private String productId;
    @JsonProperty("currentTemperature")
    private String currentTemperature;
    @JsonProperty("productQuantity")
    private String productQuantity;
    @JsonProperty("manufacturingDate")
    private String manufacturingDate;
    @JsonProperty("manufacturingTime")
    private String manufacturingTime;
    @JsonProperty("volume")
    private String volume;
    @JsonProperty("dueDate")
    private String dueDate;
    @JsonProperty("price")
    private String price;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
