package com.atguigu.shizhan.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.shizhan.bean.*;
import com.atguigu.shizhan.inter.HeTongInterface;
import com.atguigu.shizhan.mapper.*;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
public class HeTong implements HeTongInterface {

    @Autowired
    private HeTongMapper heTongMapper;
    @Autowired
    private NplmBorrowerInfoMapper nplmBorrowerInfoMapper;
    @Autowired
    private NplmRepaymentDetailMapper nplmRepaymentDetailMapper;
    @Autowired
    private NplmRepaymentPlanMapper nplmRepaymentPlanMapper;
    @Autowired
    private NplmRepaymentRecordMapper nplmRepaymentRecordMapper;




    @Override
    public List<NplmLoanContract> getSearchResult(String loanContractNum) {
        Example example=new Example(NplmLoanContract.class);
        example.createCriteria().andEqualTo(loanContractNum);
        List<NplmLoanContract> list = heTongMapper.selectByExample(example);
        return list;

    }

    @Override
    public List<NplmLoanContract> getAll() {
        List<NplmLoanContract> list = heTongMapper.selectAll();
        return list;
    }

    @Override
    public List<NplmLoanContract> selectByInfo(NplmLoanContract info,Page page) {
        List<NplmLoanContract> list=null;
        if(info.getLoanContractNum()!=null) {
            String id = info.getLoanContractNum();
            Example example = new Example(NplmLoanContract.class);
            Example.Criteria loanContractNum = example.createCriteria().andEqualTo("loanContractNum", id);
            PageHelper.startPage(Integer.parseInt(page.getStart()),Integer.parseInt(page.getPageSize()));
            list = heTongMapper.selectByExample(example);
        }else {
            PageHelper.startPage(Integer.parseInt(page.getStart()),Integer.parseInt(page.getPageSize()));
            list = heTongMapper.select(info);
        }
        return list;
    }

    @Override
    public List<NplmRepaymentDetail> getDetail(String loanContractNum) {
        Example example=new Example(NplmRepaymentDetail.class);
        example.createCriteria().andEqualTo("loanContractNum",loanContractNum);
        List<NplmRepaymentDetail> list = nplmRepaymentDetailMapper.selectByExample(example);

        return list;
    }

    @Override
    public List<NplmRepaymentPlan> getPlan(String loanContractNum) {
        Example example=new Example(NplmRepaymentPlan.class);
        example.createCriteria().andEqualTo("loanContractNum",loanContractNum);
        List<NplmRepaymentPlan> list = nplmRepaymentPlanMapper.selectByExample(example);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        for (NplmRepaymentPlan nplmRepaymentPlan : list) {
            Date repaymentDate = nplmRepaymentPlan.getRepaymentDate();

            String format = simpleDateFormat.format(repaymentDate);
            Date parse=null;
            try {
                 parse = simpleDateFormat.parse(format);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            nplmRepaymentPlan.setRepaymentDate(parse);

        }


        return list;
    }

    @Override
    public List<NplmRepaymentRecord> getRecord(String loanContractNum) {
        Example example=new Example(NplmRepaymentRecord.class);
        example.createCriteria().andEqualTo("loanContractNum",loanContractNum);
        List<NplmRepaymentRecord> list = nplmRepaymentRecordMapper.selectByExample(example);

        return list;
    }

    @Override
    public NplmLoanContract getLoanAttribute(String loanContractNum) {
        Example example=new Example(NplmLoanContract.class);
        example.createCriteria().andEqualTo("loanContractNum",loanContractNum);
        List<NplmLoanContract> nplmLoanContract = heTongMapper.selectByExample(example);
        NplmLoanContract nplmLoanContract1 = nplmLoanContract.get(0);
        return nplmLoanContract1;
    }

    @Override
    public NplmBorrowerInfo getBorrowerInfo(String id) {
        NplmBorrowerInfo nplmBorrowerInfo = nplmBorrowerInfoMapper.selectByPrimaryKey(Integer.parseInt(id));
        return nplmBorrowerInfo;
    }

    @Override
    public Integer getTotal() {
        int total = heTongMapper.selectCount(null);
        return total;
    }


}
