package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DiseaseMxzqgy;

/**
 * 慢性支气管炎Service接口
 * 
 * @author Xiehd
 * @date 2023-07-06
 */
public interface IDiseaseMxzqgyService 
{
    /**
     * 查询慢性支气管炎
     * 
     * @param id 慢性支气管炎主键
     * @return 慢性支气管炎
     */
    public DiseaseMxzqgy selectDiseaseMxzqgyById(Long id);

    /**
     * 查询慢性支气管炎列表
     * 
     * @param diseaseMxzqgy 慢性支气管炎
     * @return 慢性支气管炎集合
     */
    public List<DiseaseMxzqgy> selectDiseaseMxzqgyList(DiseaseMxzqgy diseaseMxzqgy);

    /**
     * 新增慢性支气管炎
     * 
     * @param diseaseMxzqgy 慢性支气管炎
     * @return 结果
     */
    public int insertDiseaseMxzqgy(DiseaseMxzqgy diseaseMxzqgy);

    /**
     * 修改慢性支气管炎
     * 
     * @param diseaseMxzqgy 慢性支气管炎
     * @return 结果
     */
    public int updateDiseaseMxzqgy(DiseaseMxzqgy diseaseMxzqgy);

    /**
     * 批量删除慢性支气管炎
     * 
     * @param ids 需要删除的慢性支气管炎主键集合
     * @return 结果
     */
    public int deleteDiseaseMxzqgyByIds(String ids);

    /**
     * 删除慢性支气管炎信息
     * 
     * @param id 慢性支气管炎主键
     * @return 结果
     */
    public int deleteDiseaseMxzqgyById(Long id);
}
