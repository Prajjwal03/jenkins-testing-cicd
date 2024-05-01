package com.smbc.epix.transaction.services.dao;

import com.smbc.epix.transaction.services.exception.DAOException;
import com.smbc.epix.transaction.services.model.WatchListDetails;

public interface MyWatchListDAO {

    Long getCountForWatchlist(WatchListDetails myWatchList) throws DAOException;

    Boolean createMyWatchList(WatchListDetails myWatchList) throws DAOException;

    Boolean updateMyWatchList(WatchListDetails myWatchList) throws DAOException;

    Boolean unWatchList(WatchListDetails myWatchList) throws DAOException;
}
