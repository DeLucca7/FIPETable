package com.delucca.FIPESearch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record VehicleModel(@JsonAlias("codigo") Integer code,
                           @JsonAlias("nome") String modelName) {
}
