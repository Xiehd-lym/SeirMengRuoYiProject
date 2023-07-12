package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DiseaseFqz;

/**
 * 肺气肿Service接口
 * 
 * @author Xiehd
 * @date 2023-07-03
 */
public interface IDiseaseFqzService 
{
    /**
     * 查询肺气肿
     * 
     * @param id 肺气肿主键
     * @return 肺气肿
     */
    public DiseaseFqz selectDiseaseFqzById(Long id);

    /**
     * 查询肺气肿列表
     * 
     * @param diseaseFqz 肺气肿
     * @return 肺气肿集合
     */
    public List<DiseaseFqz> selectDiseaseFqzList(DiseaseFqz diseaseFqz);

    /**
     * 新增肺气肿
     * 
     * @param diseaseFqz 肺气肿
     * @return 结果
     */
    public int insertDiseaseFqz(DiseaseFqz diseaseFqz);

    /**
     * 修改肺气肿
     * 
     * @param diseaseFqz 肺气肿
     * @return 结果
     */
    public int updateDiseaseFqz(DiseaseFqz diseaseFqz);

    /**
     * 批量删除肺气肿
     * 
     * @param ids 需要删除的肺气肿主键集合
     * @return 结果
     */
    public int deleteDiseaseFqzByIds(String ids);

    /**
     * 删除肺气肿信息
     * 
     * @param id 肺气肿主键
     * @return 结果
     */
    public int deleteDiseaseFqzById(Long id);
}
