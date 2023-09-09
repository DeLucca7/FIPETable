package com.delucca.FIPESearch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record VehicleBrand(@JsonAlias("codigo") String code,
                           @JsonAlias("nome") String brandName) {
}
