package com.example.grpcclient.domo.controller;


import com.alibaba.fastjson2.JSONObject;
import com.example.grpcclient.domo.model.PersonInfoModel;
import com.example.grpcclient.domo.service.ClientConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/loginAction")
public class ClientController {

    @Autowired
    ClientConsumer clientConsumer;

    @PostMapping(value = "/v1/queryInfo", consumes = "application/json", produces = "application/json")
    public JSONObject queryInfo( @RequestBody PersonInfoModel customerListModel) {
       return clientConsumer.queryInfo(customerListModel);
    }

    @PostMapping(value = "/v1/querySomeData", produces = "application/json")
    public JSONObject querySomeData( @RequestParam int id) {
        return clientConsumer.querySomeData(id);
    }

    @PostMapping(value = "/v1/sendBooksInfo", produces = "application/json")
    public JSONObject sendBooksInfo(@RequestParam int id) {
        return clientConsumer.sendBooksInfo(id);
    }

    @PostMapping(value = "/v1/calculateSum", produces = "application/json")
    public JSONObject calculateSum(@RequestParam int id) {
        return clientConsumer.calculateSum(id);
    }
}
