package com.delucca.FIPESearch.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConverterData {
    <T> T getData(String json, Class<T> classModel) throws JsonProcessingException;
}
