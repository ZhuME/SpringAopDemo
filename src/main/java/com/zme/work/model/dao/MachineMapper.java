package com.zme.work.model.dao;

import com.zme.work.model.entity.Machine;
import org.springframework.stereotype.Repository;

import java.util.List;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    @Repository
public interface MachineMapper {
    int deleteByPrimaryKey(Integer pkid);

    int insert(Machine record);

    int insertSelective(Machine record);

    Machine selectByPrimaryKey(Integer pkid);

    int updateByPrimaryKeySelective(Machine record);

    int updateByPrimaryKey(Machine record);

    List<Machine> getAllMachine();
}