package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Edu;

/**
 * 学生成绩Mapper接口
 * 
 * @author Xiehd
 * @date 2023-06-29
 */
public interface EduMapper 
{
    /**
     * 查询学生成绩
     * 
     * @param id 学生成绩主键
     * @return 学生成绩
     */
    public Edu selectEduById(Long id);

    /**
     * 查询学生成绩列表
     * 
     * @param edu 学生成绩
     * @return 学生成绩集合
     */
    public List<Edu> selectEduList(Edu edu);

    /**
     * 新增学生成绩
     * 
     * @param edu 学生成绩
     * @return 结果
     */
    public int insertEdu(Edu edu);

    /**
     * 修改学生成绩
     * 
     * @param edu 学生成绩
     * @return 结果
     */
    public int updateEdu(Edu edu);

    /**
     * 删除学生成绩
     * 
     * @param id 学生成绩主键
     * @return 结果
     */
    public int deleteEduById(Long id);

    /**
     * 批量删除学生成绩
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteEduByIds(String[] ids);
}
