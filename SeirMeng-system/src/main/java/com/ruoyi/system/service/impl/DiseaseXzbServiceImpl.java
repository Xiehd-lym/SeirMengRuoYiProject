package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DiseaseXzbMapper;
import com.ruoyi.system.domain.DiseaseXzb;
import com.ruoyi.system.service.IDiseaseXzbService;
import com.ruoyi.common.core.text.Convert;

/**
 * 心脏性猝死Service业务层处理
 * 
 * @author Xiehd
 * @date 2023-06-29
 */
@Service
public class DiseaseXzbServiceImpl implements IDiseaseXzbService 
{
    @Autowired
    private DiseaseXzbMapper diseaseXzbMapper;

    /**
     * 查询心脏性猝死
     * 
     * @param id 心脏性猝死主键
     * @return 心脏性猝死
     */
    @Override
    public DiseaseXzb selectDiseaseXzbById(Long id)
    {
        return diseaseXzbMapper.selectDiseaseXzbById(id);
    }

    /**
     * 查询心脏性猝死列表
     * 
     * @param diseaseXzb 心脏性猝死
     * @return 心脏性猝死
     */
    @Override
    public List<DiseaseXzb> selectDiseaseXzbList(DiseaseXzb diseaseXzb)
    {
        return diseaseXzbMapper.selectDiseaseXzbList(diseaseXzb);
    }

    /**
     * 新增心脏性猝死
     * 
     * @param diseaseXzb 心脏性猝死
     * @return 结果
     */
    @Override
    public int insertDiseaseXzb(DiseaseXzb diseaseXzb)
    {
        return diseaseXzbMapper.insertDiseaseXzb(diseaseXzb);
    }

    /**
     * 修改心脏性猝死
     * 
     * @param diseaseXzb 心脏性猝死
     * @return 结果
     */
    @Override
    public int updateDiseaseXzb(DiseaseXzb diseaseXzb)
    {
        return diseaseXzbMapper.updateDiseaseXzb(diseaseXzb);
    }

    /**
     * 批量删除心脏性猝死
     * 
     * @param ids 需要删除的心脏性猝死主键
     * @return 结果
     */
    @Override
    public int deleteDiseaseXzbByIds(String ids)
    {
        return diseaseXzbMapper.deleteDiseaseXzbByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除心脏性猝死信息
     * 
     * @param id 心脏性猝死主键
     * @return 结果
     */
    @Override
    public int deleteDiseaseXzbById(Long id)
    {
        return diseaseXzbMapper.deleteDiseaseXzbById(id);
    }
}
