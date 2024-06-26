package com.smbc.epix.transaction.services.service;

import java.util.List;
import java.util.Map;

import com.smbc.epix.transaction.services.dto.table.CallbackAmendmentHistoryResponseDTO;
import com.smbc.epix.transaction.services.dto.table.CustomDashboardDataCurrency;
import com.smbc.epix.transaction.services.dto.table.ListApplicationDTO;
import com.smbc.epix.transaction.services.dto.table.ListDTO;
import com.smbc.epix.transaction.services.dto.table.ListQueueParamsDTO;
import com.smbc.epix.transaction.services.dto.table.SwapHistory;
import com.smbc.epix.transaction.services.dto.table.UserDTO;
import com.smbc.epix.transaction.services.dto.table.UserRoleDTO;
import com.smbc.epix.transaction.services.dto.table.UtilizationHistoryResponseDTO;
import com.smbc.epix.transaction.services.dto.table.VersionHistoryDTO;
import com.smbc.epix.transaction.services.model.DynamicTable;

public interface TableService {

    List<ListDTO> getList();

    List<ListQueueParamsDTO> getListQueueParams();

    List<Map> getListQueueAccess();

    List<Map> getListQueueAccessTemp(int userIndex, String tableName, String productCode);

    List<Map> getToDoTableFields(DynamicTable dynamicQuery);

    List<Map> getToDoColumnTableFields(DynamicTable dynamicQuery);

    List<Map> getEnquiryTableFields(DynamicTable dynamicQuery);

    List<Map> getEnquiryColumnTableFields(DynamicTable dynamicQuery);

    List<Map> getDropDownFields(DynamicTable dynamicQuery);

    List<Map> getDropDownFieldsForTransactionType(DynamicTable dynamicQuery);

    List<Map> getTransactionType(DynamicTable dynamicQuery);

    List<Map> getCaseStatus(DynamicTable dynamicQuery);

    List<Map> getBranchPendingTXN(DynamicTable dynamicQuery);

    List<Map> getSSCDraftedTXN(DynamicTable dynamicQuery);

    List<Map> getBranchDraftedTXN(DynamicTable dynamicQuery);

    List<Map> getSSCPendingTXN(DynamicTable dynamicQuery);

    List<Map> getAMLPendingTXN(DynamicTable dynamicQuery);

    List<Map> getCommentHistoryDfx(String transactionID);

    List<Map> getCommentHistory(String transactionID);

    List<Map> getSessionStatus(DynamicTable dynamicQuery);

    List<Map> getTransactionID(DynamicTable dynamicQuery);

    List<VersionHistoryDTO> getVersionHistory(DynamicTable dynamicQuery);

    List<SwapHistory> getSwapHistory(DynamicTable dynamicQuery);

    List<Map> getCustomDashboardDataSubProduct(DynamicTable dynamicQuery);

    List<CustomDashboardDataCurrency> getCustomDashboardDataCurrency(DynamicTable dynamicQuery);

    List<UserRoleDTO> getUserRoleDetails(int userIndex);

    List<List<String>> getSelectedFields(int userIndex, String tableName);

    List<Map> getBranch(int userIndex);

    List<UserDTO> getUserName(int userIndex);

    List<Map> getProduct(DynamicTable dynamicQuery);

    List<Map> getEnquirySearchFilter(DynamicTable dynamicQuery);

    Boolean getCreateAuth(int userIndex);

    List<ListApplicationDTO> getApplication();

    List<String> getExtTableDetails(String product);

    List<Map> getIformDetails(String product);

    String callbackAmendment(String pid, String username);

    String utilizationReversal(String pid, String username);

    String getRoleName(int userIndex);

    List<CallbackAmendmentHistoryResponseDTO> callbackAmendmentHistory(String pid);
 
    List<UtilizationHistoryResponseDTO> getUtilizationHistory(String pid);

    List<String> getMasterData(String type);
}
