package com.delucca.FIPESearch.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataConverter implements IConverterData {

    ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T getData(String json, Class<T> classModel) throws JsonProcessingException {
        return mapper.readValue(json, classModel);
    }
}
