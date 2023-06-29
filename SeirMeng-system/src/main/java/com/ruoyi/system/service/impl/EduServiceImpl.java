package com.ruoyi.system.service.impl;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EduMapper;
import com.ruoyi.system.domain.Edu;
import com.ruoyi.system.service.IEduService;
import com.ruoyi.common.core.text.Convert;

/**
 * 学生成绩Service业务层处理
 * 
 * @author Xiehd
 * @date 2023-06-29
 */
@Service
public class EduServiceImpl implements IEduService 
{
    @Autowired
    private EduMapper eduMapper;

    /**
     * 查询学生成绩
     * 
     * @param id 学生成绩主键
     * @return 学生成绩
     */
    @Override
    public Edu selectEduById(Long id)
    {
        return eduMapper.selectEduById(id);
    }

    /**
     * 查询学生成绩列表
     * 
     * @param edu 学生成绩
     * @return 学生成绩
     */
    @Override
    public List<Edu> selectEduList(Edu edu)
    {
        List<Edu> edus = eduMapper.selectEduList(edu);
        for (Edu edusdemo : edus) {
            BigDecimal eduKeguanti = edusdemo.getEduKeguanti();
            BigDecimal eduPduan = edusdemo.getEduPduan();
            BigDecimal eduZhuguan = edusdemo.getEduZhuguan();
            BigDecimal eduJiafenti = edusdemo.getEduJiafenti();

            BigDecimal add = eduKeguanti.add(eduPduan);
            BigDecimal add1 = add.add(eduZhuguan);
            BigDecimal add2 = add1.add(eduPduan);
            BigDecimal add3 = add2.add(eduJiafenti);

            edusdemo.setEduZongfen(add3);
        }
        return edus;
    }

    /**
     * 新增学生成绩
     * 
     * @param edu 学生成绩
     * @return 结果
     */
    @Override
    public int insertEdu(Edu edu)
    {
        return eduMapper.insertEdu(edu);
    }

    /**
     * 修改学生成绩
     * 
     * @param edu 学生成绩
     * @return 结果
     */
    @Override
    public int updateEdu(Edu edu)
    {
        return eduMapper.updateEdu(edu);
    }

    /**
     * 批量删除学生成绩
     * 
     * @param ids 需要删除的学生成绩主键
     * @return 结果
     */
    @Override
    public int deleteEduByIds(String ids)
    {
        return eduMapper.deleteEduByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学生成绩信息
     * 
     * @param id 学生成绩主键
     * @return 结果
     */
    @Override
    public int deleteEduById(Long id)
    {
        return eduMapper.deleteEduById(id);
    }
}
