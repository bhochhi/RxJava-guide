package com.codewithme.bhochhi.webclientdemo;

import lombok.Data;

@Data
public class ReqResMap<T> {
    private String requestUrl;
    private Class<T> responseType;
    private T responseBody;

    public ReqResMap(Class<T> responseType){
        this.responseType = responseType;
    }
}
