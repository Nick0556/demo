package com.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.domain.Profession;
import com.mapper.ProfessionMapper;
import com.service.ProfessionService;
@Service
public class ProfessionServiceImpl implements ProfessionService{

    @Resource
    private ProfessionMapper professionMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return professionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Profession record) {
        return professionMapper.insert(record);
    }

    @Override
    public int insertSelective(Profession record) {
        return professionMapper.insertSelective(record);
    }

    @Override
    public Profession selectByPrimaryKey(Integer id) {
        return professionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Profession record) {
        return professionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Profession record) {
        return professionMapper.updateByPrimaryKey(record);
    }

}
