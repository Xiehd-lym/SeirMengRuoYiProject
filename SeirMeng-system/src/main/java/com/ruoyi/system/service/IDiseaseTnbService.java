package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DiseaseTnb;

/**
 * 糖尿病Service接口
 * 
 * @author Xiehd
 * @date 2023-07-06
 */
public interface IDiseaseTnbService 
{
    /**
     * 查询糖尿病
     * 
     * @param id 糖尿病主键
     * @return 糖尿病
     */
    public DiseaseTnb selectDiseaseTnbById(Long id);

    /**
     * 查询糖尿病列表
     * 
     * @param diseaseTnb 糖尿病
     * @return 糖尿病集合
     */
    public List<DiseaseTnb> selectDiseaseTnbList(DiseaseTnb diseaseTnb);

    /**
     * 新增糖尿病
     * 
     * @param diseaseTnb 糖尿病
     * @return 结果
     */
    public int insertDiseaseTnb(DiseaseTnb diseaseTnb);

    /**
     * 修改糖尿病
     * 
     * @param diseaseTnb 糖尿病
     * @return 结果
     */
    public int updateDiseaseTnb(DiseaseTnb diseaseTnb);

    /**
     * 批量删除糖尿病
     * 
     * @param ids 需要删除的糖尿病主键集合
     * @return 结果
     */
    public int deleteDiseaseTnbByIds(String ids);

    /**
     * 删除糖尿病信息
     * 
     * @param id 糖尿病主键
     * @return 结果
     */
    public int deleteDiseaseTnbById(Long id);
}
