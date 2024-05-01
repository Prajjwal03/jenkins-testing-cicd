package com.smbc.epix.transaction.services.dto;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MyTeamPerformanceReport {

    private List<Map> branchDraftedCount;

    @JsonProperty("SSCDraftedCount")
    private List<Map> sscDraftedCount;

    private List<Map> branchPendingTXNCount;

    @JsonProperty("SSCPendingTXNCount")
    private List<Map> sscPendingTxnCount;

    @JsonProperty("AMLPendingTXNCount")
    private List<Map> amlPendingTxnCount;
}
