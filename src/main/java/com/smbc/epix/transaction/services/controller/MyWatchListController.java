package com.smbc.epix.transaction.services.controller;

import javax.validation.Valid;

import com.smbc.epix.core.utils.Result;
import com.smbc.epix.transaction.services.model.WatchListDetails;
import com.smbc.epix.transaction.services.service.MyWatchListService;
import com.smbc.epix.transaction.services.utils.NGLogger;
import io.swagger.annotations.ApiOperation;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/myWatchList", produces = "application/json")
public class MyWatchListController {
    private static final NGLogger nGLogger = new NGLogger();

    @Autowired
    @Setter
    private MyWatchListService myWatchListService;

    @ApiOperation(value = "Create-WatchList")
    @PostMapping(path = "/createWatchList")
    public ResponseEntity<Result> createWatchList(@Valid @RequestBody WatchListDetails watchListDetails) {
        Result result;

        try {
            result = new Result(myWatchListService.createMyWatchList(watchListDetails));
        } catch (Exception e) {
            nGLogger.consoleLog("Exception " + e);
            result = new Result(e);
        }

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @ApiOperation(value = "un-WatchList")
    @PostMapping(path = "/unWatchList")
    public ResponseEntity<Result> unWatchList(@Valid @RequestBody WatchListDetails watchListDetails) {
        Result result;

        try {
            result = new Result(myWatchListService.unWatchList(watchListDetails));
        } catch (Exception e) {
            nGLogger.consoleLog("Exception " + e);
            result = new Result(e);
        }

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
