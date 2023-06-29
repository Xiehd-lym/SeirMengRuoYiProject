package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DiseaseXzb;

/**
 * 心脏性猝死Service接口
 * 
 * @author Xiehd
 * @date 2023-06-29
 */
public interface IDiseaseXzbService 
{
    /**
     * 查询心脏性猝死
     * 
     * @param id 心脏性猝死主键
     * @return 心脏性猝死
     */
    public DiseaseXzb selectDiseaseXzbById(Long id);

    /**
     * 查询心脏性猝死列表
     * 
     * @param diseaseXzb 心脏性猝死
     * @return 心脏性猝死集合
     */
    public List<DiseaseXzb> selectDiseaseXzbList(DiseaseXzb diseaseXzb);

    /**
     * 新增心脏性猝死
     * 
     * @param diseaseXzb 心脏性猝死
     * @return 结果
     */
    public int insertDiseaseXzb(DiseaseXzb diseaseXzb);

    /**
     * 修改心脏性猝死
     * 
     * @param diseaseXzb 心脏性猝死
     * @return 结果
     */
    public int updateDiseaseXzb(DiseaseXzb diseaseXzb);

    /**
     * 批量删除心脏性猝死
     * 
     * @param ids 需要删除的心脏性猝死主键集合
     * @return 结果
     */
    public int deleteDiseaseXzbByIds(String ids);

    /**
     * 删除心脏性猝死信息
     * 
     * @param id 心脏性猝死主键
     * @return 结果
     */
    public int deleteDiseaseXzbById(Long id);
}
