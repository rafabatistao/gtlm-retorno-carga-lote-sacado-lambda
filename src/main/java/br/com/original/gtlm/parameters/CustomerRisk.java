package br.com.original.gtlm.parameters;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CustomerRisk {

    private String action;
    private String rating;
    private String riskType;
    private String evaluationDate;
}
