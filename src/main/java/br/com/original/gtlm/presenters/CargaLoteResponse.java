package br.com.original.gtlm.presenters;

import br.com.original.gtlm.parameters.CustomerRisk;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CargaLoteResponse {

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
