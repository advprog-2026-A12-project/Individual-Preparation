package com.example.individualprep.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public record ArithmeticRequest(
    @JsonAlias("base") Double operand1,
    Double operand2,
    Integer exponent 
) {
}

