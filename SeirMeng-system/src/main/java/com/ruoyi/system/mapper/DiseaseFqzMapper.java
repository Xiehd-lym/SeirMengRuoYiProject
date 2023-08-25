package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DiseaseFqz;

/**
 * 肺气肿Mapper接口
 * 
 * @author Xiehd
 * @date 2023-07-03
 */
public interface DiseaseFqzMapper 
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
     * 删除肺气肿
     * 
     * @param id 肺气肿主键
     * @return 结果
     */
    public int deleteDiseaseFqzById(Long id);

    /**
     * 批量删除肺气肿
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDiseaseFqzByIds(String[] ids);
}
