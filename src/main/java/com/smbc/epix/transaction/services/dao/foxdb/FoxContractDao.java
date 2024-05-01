package com.smbc.epix.transaction.services.dao.foxdb;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.smbc.epix.transaction.services.dto.table.FoxContractDetailsDTO;

public interface FoxContractDao {
	public List<FoxContractDetailsDTO> getLatestVersion(@Param("contractNo") String contractNo) ; 
}

