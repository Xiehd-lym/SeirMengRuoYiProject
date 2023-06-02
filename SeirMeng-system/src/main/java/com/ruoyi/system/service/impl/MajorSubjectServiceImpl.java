package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MajorSubjectMapper;
import com.ruoyi.system.domain.MajorSubject;
import com.ruoyi.system.service.IMajorSubjectService;
import com.ruoyi.common.core.text.Convert;

/**
 * 意向专业Service业务层处理
 * 
 * @author Xiehd
 * @date 2023-06-02
 */
@Service
public class MajorSubjectServiceImpl implements IMajorSubjectService 
{
    @Autowired
    private MajorSubjectMapper majorSubjectMapper;

    /**
     * 查询意向专业
     * 
     * @param id 意向专业主键
     * @return 意向专业
     */
    @Override
    public MajorSubject selectMajorSubjectById(Long id)
    {
        return majorSubjectMapper.selectMajorSubjectById(id);
    }

    /**
     * 查询意向专业列表
     * 
     * @param majorSubject 意向专业
     * @return 意向专业
     */
    @Override
    public List<MajorSubject> selectMajorSubjectList(MajorSubject majorSubject)
    {
        return majorSubjectMapper.selectMajorSubjectList(majorSubject);
    }

    /**
     * 新增意向专业
     * 
     * @param majorSubject 意向专业
     * @return 结果
     */
    @Override
    public int insertMajorSubject(MajorSubject majorSubject)
    {
        return majorSubjectMapper.insertMajorSubject(majorSubject);
    }

    /**
     * 修改意向专业
     * 
     * @param majorSubject 意向专业
     * @return 结果
     */
    @Override
    public int updateMajorSubject(MajorSubject majorSubject)
    {
        return majorSubjectMapper.updateMajorSubject(majorSubject);
    }

    /**
     * 批量删除意向专业
     * 
     * @param ids 需要删除的意向专业主键
     * @return 结果
     */
    @Override
    public int deleteMajorSubjectByIds(String ids)
    {
        return majorSubjectMapper.deleteMajorSubjectByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除意向专业信息
     * 
     * @param id 意向专业主键
     * @return 结果
     */
    @Override
    public int deleteMajorSubjectById(Long id)
    {
        return majorSubjectMapper.deleteMajorSubjectById(id);
    }
}
