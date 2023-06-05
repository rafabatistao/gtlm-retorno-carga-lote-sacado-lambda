package br.com.original.gtlm.parameters;

import lombok.Data;

@Data
public class CargaLoteRequest {

    private String action;
    private String documentNumber;
    private String name;
    private String personType;
    private String status;
    private boolean bacenSearchFlag;
    private String bacenControlCode;
    private Long customerSize;
    private CustomerRisk customerRisk;
}
