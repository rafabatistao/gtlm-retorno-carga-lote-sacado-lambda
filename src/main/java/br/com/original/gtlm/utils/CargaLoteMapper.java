package br.com.original.gtlm.utils;

import br.com.original.gtlm.parameters.CargaLoteRequest;
import br.com.original.gtlm.presenters.CargaLoteResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class CargaLoteMapper {

    public static CargaLoteResponse map(final CargaLoteRequest request){
        return CargaLoteResponse.builder()
                .action(request.getAction())
                .name(request.getName())
                .bacenSearchFlag(request.isBacenSearchFlag())
                .documentNumber(request.getDocumentNumber())
                .status(request.getStatus())
                .bacenControlCode(request.getBacenControlCode())
                .personType(request.getPersonType())
                .customerSize(request.getCustomerSize())
                .customerRisk(request.getCustomerRisk())
                .build();
    }


}
