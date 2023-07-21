package com.ruoyi.system.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.ruoyi.common.utils.IDCardUtil;
import javafx.scene.input.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DiseaseFqzMapper;
import com.ruoyi.system.domain.DiseaseFqz;
import com.ruoyi.system.service.IDiseaseFqzService;
import com.ruoyi.common.core.text.Convert;

/**
 * 肺气肿Service业务层处理
 * 
 * @author Xiehd
 * @date 2023-07-03
 */
@Service
public class DiseaseFqzServiceImpl implements IDiseaseFqzService 
{
    @Autowired
    private DiseaseFqzMapper diseaseFqzMapper;

    /**
     * 查询肺气肿
     * 
     * @param id 肺气肿主键
     * @return 肺气肿
     */
    @Override
    public DiseaseFqz selectDiseaseFqzById(Long id)
    {
        return diseaseFqzMapper.selectDiseaseFqzById(id);
    }

    /**
     * 查询肺气肿列表
     * 
     * @param diseaseFqz 肺气肿
     * @return 肺气肿
     */
    @Override
    public List<DiseaseFqz> selectDiseaseFqzList(DiseaseFqz diseaseFqz)
    {
        return diseaseFqzMapper.selectDiseaseFqzList(diseaseFqz);
    }

    /**
     * 新增肺气肿
     * 
     * @param diseaseFqz 肺气肿
     * @return 结果
     */
    @Override
    public int insertDiseaseFqz(DiseaseFqz diseaseFqz)
    {
        //
        String birthday = IDCardUtil.getBirthday(diseaseFqz.getCardNo());
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            diseaseFqz.setBirthday(sdf.parse(birthday));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        //
        diseaseFqz.setGenerate(IDCardUtil.getSex(diseaseFqz.getCardNo()));

//        户籍详细地址
        diseaseFqz.setHujiAddress(diseaseFqz.getChangzhuDetail());
//        户籍地址(编码)
        diseaseFqz.setHujiAddressCode(diseaseFqz.getChangzhuAddressCode());
//        户籍地址类型
        diseaseFqz.setHujiAddressType(diseaseFqz.getChangzhuAddress());

        return diseaseFqzMapper.insertDiseaseFqz(diseaseFqz);
    }

    /**
     * 修改肺气肿
     * 
     * @param diseaseFqz 肺气肿
     * @return 结果
     */
    @Override
    public int updateDiseaseFqz(DiseaseFqz diseaseFqz)
    {
        //
        String birthday = IDCardUtil.getBirthday(diseaseFqz.getCardNo());
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            diseaseFqz.setBirthday(sdf.parse(birthday));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        //
        diseaseFqz.setGenerate(IDCardUtil.getSex(diseaseFqz.getCardNo()));

        diseaseFqz.setHujiAddress(diseaseFqz.getChangzhuAddress());
        diseaseFqz.setHujiAddressCode(diseaseFqz.getChangzhuAddressCode());
        diseaseFqz.setHujiAddressType(diseaseFqz.getChangzhuAddress());

        return diseaseFqzMapper.updateDiseaseFqz(diseaseFqz);
    }

    /**
     * 批量删除肺气肿
     * 
     * @param ids 需要删除的肺气肿主键
     * @return 结果
     */
    @Override
    public int deleteDiseaseFqzByIds(String ids)
    {
        return diseaseFqzMapper.deleteDiseaseFqzByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除肺气肿信息
     * 
     * @param id 肺气肿主键
     * @return 结果
     */
    @Override
    public int deleteDiseaseFqzById(Long id)
    {
        return diseaseFqzMapper.deleteDiseaseFqzById(id);
    }
}
