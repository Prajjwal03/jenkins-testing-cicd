package com.smbc.epix.transaction.services.dto.table;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UtilizationHistoryResponseDTO implements Serializable{

    private static final long serialVersionUID = 1691661957213263938L;

    private String ccy1Amount;

    private String ccy2Amount;

    private String department;

    private String userName;

    private String action;

    @JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
    private Date dateTime;
}
