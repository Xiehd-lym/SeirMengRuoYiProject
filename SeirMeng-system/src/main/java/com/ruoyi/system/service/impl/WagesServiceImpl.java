package com.ruoyi.system.service.impl;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WagesMapper;
import com.ruoyi.system.domain.Wages;
import com.ruoyi.system.service.IWagesService;
import com.ruoyi.common.core.text.Convert;

/**
 * 工资Service业务层处理
 * 
 * @author Xiehd
 * @date 2023-06-29
 */
@Service
public class WagesServiceImpl implements IWagesService 
{
    @Autowired
    private WagesMapper wagesMapper;

    /**
     * 查询工资
     * 
     * @param id 工资主键
     * @return 工资
     */
    @Override
    public Wages selectWagesById(Long id)
    {
        return wagesMapper.selectWagesById(id);
    }

    /**
     * 查询工资列表
     * 
     * @param wages 工资
     * @return 工资
     */
    @Override
    public List<Wages> selectWagesList(Wages wages)
    {
        List<Wages> list = wagesMapper.selectWagesList(wages);
        for (Wages wagesDemo : list) {
            BigDecimal jibenMoney = wagesDemo.getJibenMoney();
            BigDecimal koukuan = wagesDemo.getKoukuan();
            BigDecimal wxyj = wagesDemo.getWxyj();
            BigDecimal geshui = wagesDemo.getGeshui();
            BigDecimal buzhu = wagesDemo.getBuzhu();

            BigDecimal subtract = jibenMoney.subtract(koukuan);
            BigDecimal subtract1 = subtract.subtract(wxyj);
            BigDecimal subtract2 = subtract1.subtract(geshui);
            BigDecimal add = subtract2.add(buzhu);
            wagesDemo.setShifa(add);
        }
        return list;
    }

    /**
     * 新增工资
     * 
     * @param wages 工资
     * @return 结果
     */
    @Override
    public int insertWages(Wages wages)
    {
        return wagesMapper.insertWages(wages);
    }

    /**
     * 修改工资
     * 
     * @param wages 工资
     * @return 结果
     */
    @Override
    public int updateWages(Wages wages)
    {
        return wagesMapper.updateWages(wages);
    }

    /**
     * 批量删除工资
     * 
     * @param ids 需要删除的工资主键
     * @return 结果
     */
    @Override
    public int deleteWagesByIds(String ids)
    {
        return wagesMapper.deleteWagesByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除工资信息
     * 
     * @param id 工资主键
     * @return 结果
     */
    @Override
    public int deleteWagesById(Long id)
    {
        return wagesMapper.deleteWagesById(id);
    }
}
