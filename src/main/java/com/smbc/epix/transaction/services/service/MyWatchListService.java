package com.smbc.epix.transaction.services.service;

import com.smbc.epix.transaction.services.model.WatchListDetails;

public interface MyWatchListService {

    String unWatchList(WatchListDetails myWatchList);

    String createMyWatchList(WatchListDetails myWatchList);
}
