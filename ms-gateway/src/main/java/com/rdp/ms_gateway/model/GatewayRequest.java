package com.rdp.ms_gateway.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.server.ServerWebExchange;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class GatewayRequest {

    /**
     * The target HTTP method of the request.
     */
    private HttpMethod targetMethod;

    /**
     * The query parameters of the request.
     */
    private LinkedMultiValueMap<String, String> queryParams;

    /**
     * The body of the request.
     */
    private Object body;

    /**
     * The current server web exchange. This is ignored when the object is serialized to JSON.
     */
    @JsonIgnore
    private ServerWebExchange exchange;

    /**
     * The headers of the request. This is ignored when the object is serialized to JSON.
     */
    @JsonIgnore
    private HttpHeaders headers;
}
