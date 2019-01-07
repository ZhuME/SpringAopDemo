package com.zme.work.controller;

import com.zme.work.model.entity.Machine;
import com.zme.work.service.MachineService;
import com.zme.work.service.MachineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @auth zme on 2019/1/7 10:49
 **/
@RestController
public class MachineController {
    @Autowired
    private MachineService machineService;
    @RequestMapping(value = "/getMachine")
    public Machine getMachine(){
        Machine machine = new Machine();
        machine.setBirth(new Date(System.currentTimeMillis()));
        machine.setVersion("1.0");
        machine.setChangshang("华为");
        machineService.insertMachine(machine);
        return machine;
    }
}
