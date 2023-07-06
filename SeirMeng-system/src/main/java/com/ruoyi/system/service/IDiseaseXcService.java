package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DiseaseXc;

/**
 * 哮喘Service接口
 * 
 * @author Xiehd
 * @date 2023-07-06
 */
public interface IDiseaseXcService 
{
    /**
     * 查询哮喘
     * 
     * @param id 哮喘主键
     * @return 哮喘
     */
    public DiseaseXc selectDiseaseXcById(Long id);

    /**
     * 查询哮喘列表
     * 
     * @param diseaseXc 哮喘
     * @return 哮喘集合
     */
    public List<DiseaseXc> selectDiseaseXcList(DiseaseXc diseaseXc);

    /**
     * 新增哮喘
     * 
     * @param diseaseXc 哮喘
     * @return 结果
     */
    public int insertDiseaseXc(DiseaseXc diseaseXc);

    /**
     * 修改哮喘
     * 
     * @param diseaseXc 哮喘
     * @return 结果
     */
    public int updateDiseaseXc(DiseaseXc diseaseXc);

    /**
     * 批量删除哮喘
     * 
     * @param ids 需要删除的哮喘主键集合
     * @return 结果
     */
    public int deleteDiseaseXcByIds(String ids);

    /**
     * 删除哮喘信息
     * 
     * @param id 哮喘主键
     * @return 结果
     */
    public int deleteDiseaseXcById(Long id);
}
