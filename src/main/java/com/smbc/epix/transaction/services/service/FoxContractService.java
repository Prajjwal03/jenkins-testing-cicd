package com.smbc.epix.transaction.services.service;

import java.util.List;

import com.smbc.epix.transaction.services.dto.table.FoxContractDetailsDTO;

public interface FoxContractService {
		public List<FoxContractDetailsDTO> getLatestVersion(String contractNo);	
}
