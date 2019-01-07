package com.zme.work.service;

import com.zme.work.model.dao.MachineMapper;
import com.zme.work.model.entity.Machine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auth zme on 2019/1/7 10:46
 **/
@Service("machineService")
public class MachineServiceImpl implements MachineService{
    @Autowired
    MachineMapper machineMapper;
    public Machine getMachineByPkid(Integer pkid) {
        Machine machine = machineMapper.selectByPrimaryKey(pkid);
        return machine;
    }

    public List<Machine> getAllMachine() {
        List<Machine> allMachine = machineMapper.getAllMachine();
        return allMachine;
    }


    public void deleteMechineByPkid(Integer pkid) {
        machineMapper.deleteByPrimaryKey(pkid);
    }

    public void insertMachine(Machine machine) {
        machineMapper.insertSelective(machine);
    }

    public void modifyMachineByPkid(Machine machine) {
        machineMapper.updateByPrimaryKey(machine);
    }
}
