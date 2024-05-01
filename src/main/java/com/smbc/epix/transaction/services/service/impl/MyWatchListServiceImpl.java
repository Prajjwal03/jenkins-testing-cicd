package com.smbc.epix.transaction.services.service.impl;

import com.smbc.epix.transaction.services.dao.MyWatchListDAO;
import com.smbc.epix.transaction.services.model.WatchListDetails;
import com.smbc.epix.transaction.services.service.MyWatchListService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyWatchListServiceImpl implements MyWatchListService {

    @Autowired
    @Setter
    private MyWatchListDAO watchListDAO;

    @Override
    public String createMyWatchList(WatchListDetails myWatchList) {
        Long count = watchListDAO.getCountForWatchlist(myWatchList);

        Boolean status;
        if (count != null && count >= 1) {
            status = watchListDAO.updateMyWatchList(myWatchList);
        } else {
            status = watchListDAO.createMyWatchList(myWatchList);
        }

        String statusCode = "Failed";
        if (Boolean.TRUE.equals(status)) {
            statusCode = "Watchlisted Successfully";
        }

        return statusCode;
    }

    @Override
    public String unWatchList(WatchListDetails myWatchList) {
        String statusCode = "Failed";
        Boolean status = watchListDAO.unWatchList(myWatchList);
        if (Boolean.TRUE.equals(status)) {
            statusCode = "Un-Watched Successfully";
        }
        return statusCode;
    }
}
