package com.zme.work.service;

import com.zme.work.model.entity.Machine;

import java.util.List;

/**
 * @auth zme on 2019/1/7 10:57
 **/
public interface MachineService {
    Machine getMachineByPkid(Integer pkid);
    List<Machine> getAllMachine();
    void deleteMechineByPkid(Integer pkid);
    void insertMachine(Machine machine);
    void modifyMachineByPkid(Machine machine);
}
