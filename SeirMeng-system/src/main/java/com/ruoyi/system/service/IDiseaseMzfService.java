package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DiseaseMzf;

/**
 * 慢阻肺Service接口
 * 
 * @author Xiehd
 * @date 2023-07-06
 */
public interface IDiseaseMzfService 
{
    /**
     * 查询慢阻肺
     * 
     * @param id 慢阻肺主键
     * @return 慢阻肺
     */
    public DiseaseMzf selectDiseaseMzfById(Long id);

    /**
     * 查询慢阻肺列表
     * 
     * @param diseaseMzf 慢阻肺
     * @return 慢阻肺集合
     */
    public List<DiseaseMzf> selectDiseaseMzfList(DiseaseMzf diseaseMzf);

    /**
     * 新增慢阻肺
     * 
     * @param diseaseMzf 慢阻肺
     * @return 结果
     */
    public int insertDiseaseMzf(DiseaseMzf diseaseMzf);

    /**
     * 修改慢阻肺
     * 
     * @param diseaseMzf 慢阻肺
     * @return 结果
     */
    public int updateDiseaseMzf(DiseaseMzf diseaseMzf);

    /**
     * 批量删除慢阻肺
     * 
     * @param ids 需要删除的慢阻肺主键集合
     * @return 结果
     */
    public int deleteDiseaseMzfByIds(String ids);

    /**
     * 删除慢阻肺信息
     * 
     * @param id 慢阻肺主键
     * @return 结果
     */
    public int deleteDiseaseMzfById(Long id);
}
