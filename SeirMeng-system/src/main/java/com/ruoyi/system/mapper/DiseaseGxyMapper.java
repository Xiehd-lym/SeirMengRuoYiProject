package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DiseaseGxy;

/**
 * 高血压Mapper接口
 * 
 * @author Xiehd
 * @date 2023-07-04
 */
public interface DiseaseGxyMapper 
{
    /**
     * 查询高血压
     * 
     * @param id 高血压主键
     * @return 高血压
     */
    public DiseaseGxy selectDiseaseGxyById(Long id);

    /**
     * 查询高血压列表
     * 
     * @param diseaseGxy 高血压
     * @return 高血压集合
     */
    public List<DiseaseGxy> selectDiseaseGxyList(DiseaseGxy diseaseGxy);

    /**
     * 新增高血压
     * 
     * @param diseaseGxy 高血压
     * @return 结果
     */
    public int insertDiseaseGxy(DiseaseGxy diseaseGxy);

    /**
     * 修改高血压
     * 
     * @param diseaseGxy 高血压
     * @return 结果
     */
    public int updateDiseaseGxy(DiseaseGxy diseaseGxy);

    /**
     * 删除高血压
     * 
     * @param id 高血压主键
     * @return 结果
     */
    public int deleteDiseaseGxyById(Long id);

    /**
     * 批量删除高血压
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDiseaseGxyByIds(String[] ids);
}
