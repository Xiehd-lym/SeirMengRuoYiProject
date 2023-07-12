package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.DiseaseNcz;

/**
 * 脑卒中Service接口
 * 
 * @author Xiehd
 * @date 2023-07-06
 */
public interface IDiseaseNczService 
{
    /**
     * 查询脑卒中
     * 
     * @param id 脑卒中主键
     * @return 脑卒中
     */
    public DiseaseNcz selectDiseaseNczById(Long id);

    /**
     * 查询脑卒中列表
     * 
     * @param diseaseNcz 脑卒中
     * @return 脑卒中集合
     */
    public List<DiseaseNcz> selectDiseaseNczList(DiseaseNcz diseaseNcz);

    /**
     * 新增脑卒中
     * 
     * @param diseaseNcz 脑卒中
     * @return 结果
     */
    public int insertDiseaseNcz(DiseaseNcz diseaseNcz);

    /**
     * 修改脑卒中
     * 
     * @param diseaseNcz 脑卒中
     * @return 结果
     */
    public int updateDiseaseNcz(DiseaseNcz diseaseNcz);

    /**
     * 批量删除脑卒中
     * 
     * @param ids 需要删除的脑卒中主键集合
     * @return 结果
     */
    public int deleteDiseaseNczByIds(String ids);

    /**
     * 删除脑卒中信息
     * 
     * @param id 脑卒中主键
     * @return 结果
     */
    public int deleteDiseaseNczById(Long id);
}
