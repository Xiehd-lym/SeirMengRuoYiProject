package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.MajorSubject;

/**
 * 意向专业Service接口
 * 
 * @author Xiehd
 * @date 2023-06-02
 */
public interface IMajorSubjectService 
{
    /**
     * 查询意向专业
     * 
     * @param id 意向专业主键
     * @return 意向专业
     */
    public MajorSubject selectMajorSubjectById(Long id);

    /**
     * 查询意向专业列表
     * 
     * @param majorSubject 意向专业
     * @return 意向专业集合
     */
    public List<MajorSubject> selectMajorSubjectList(MajorSubject majorSubject);

    /**
     * 新增意向专业
     * 
     * @param majorSubject 意向专业
     * @return 结果
     */
    public int insertMajorSubject(MajorSubject majorSubject);

    /**
     * 修改意向专业
     * 
     * @param majorSubject 意向专业
     * @return 结果
     */
    public int updateMajorSubject(MajorSubject majorSubject);

    /**
     * 批量删除意向专业
     * 
     * @param ids 需要删除的意向专业主键集合
     * @return 结果
     */
    public int deleteMajorSubjectByIds(String ids);

    /**
     * 删除意向专业信息
     * 
     * @param id 意向专业主键
     * @return 结果
     */
    public int deleteMajorSubjectById(Long id);
}
