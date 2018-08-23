package com.atguigu.shizhan.inter;

import com.atguigu.shizhan.bean.*;

import java.util.List;

public interface HeTongInterface {

    List<NplmLoanContract> getSearchResult(String loanContractNum);

    List<NplmLoanContract> getAll();

    List<NplmLoanContract> selectByInfo(NplmLoanContract info,Page page);

    List<NplmRepaymentDetail> getDetail(String loanContractNum);

    List<NplmRepaymentPlan> getPlan(String loanContractNum);

    List<NplmRepaymentRecord> getRecord(String loanContractNum);

    NplmLoanContract getLoanAttribute(String loanContractNum);

    NplmBorrowerInfo getBorrowerInfo(String id);

    Integer getTotal();

}


