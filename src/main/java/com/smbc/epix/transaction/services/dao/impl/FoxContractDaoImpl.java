package com.smbc.epix.transaction.services.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.smbc.epix.transaction.services.dao.BaseDAO;
import com.smbc.epix.transaction.services.dao.foxdb.FoxContractDao;
import com.smbc.epix.transaction.services.dto.table.FoxContractDetailsDTO;
@Repository
public class FoxContractDaoImpl  extends BaseDAO implements FoxContractDao {

	@Override
	public List<FoxContractDetailsDTO> getLatestVersion(String contractNo) {
			return (List<FoxContractDetailsDTO>) selectList("com.smbc.epix.transaction.services.dao.foxdb.FoxContractDao.getLatestVersion", contractNo);
			
	}
}
