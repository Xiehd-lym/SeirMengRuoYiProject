package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Wages;

/**
 * 工资Service接口
 * 
 * @author Xiehd
 * @date 2023-06-29
 */
public interface IWagesService 
{
    /**
     * 查询工资
     * 
     * @param id 工资主键
     * @return 工资
     */
    public Wages selectWagesById(Long id);

    /**
     * 查询工资列表
     * 
     * @param wages 工资
     * @return 工资集合
     */
    public List<Wages> selectWagesList(Wages wages);

    /**
     * 新增工资
     * 
     * @param wages 工资
     * @return 结果
     */
    public int insertWages(Wages wages);

    /**
     * 修改工资
     * 
     * @param wages 工资
     * @return 结果
     */
    public int updateWages(Wages wages);

    /**
     * 批量删除工资
     * 
     * @param ids 需要删除的工资主键集合
     * @return 结果
     */
    public int deleteWagesByIds(String ids);

    /**
     * 删除工资信息
     * 
     * @param id 工资主键
     * @return 结果
     */
    public int deleteWagesById(Long id);
}
