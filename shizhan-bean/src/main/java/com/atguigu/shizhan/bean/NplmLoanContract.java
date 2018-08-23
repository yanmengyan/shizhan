package com.atguigu.shizhan.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 合同_贷款合同表
 * @author jdandian.com
 * @date 2018年08月19日
 */
public class NplmLoanContract implements Serializable {
    /**
     * id
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private String id;
    /**
     * 合同编号
     */
    @Column
    private String loanContractNum;
    /**
     * 借款人id
     */@Column
    private String borrowerId;
    /**
     * ECIF客户号
     */@Column
    private String ecifId;
    /**
     * 产品分类代码
     */@Column
    private String proCategoryCode;
    /**
     * 产品分类名称
     */@Column
    private String proCategoryName;
    /**
     * 产品信息id
     */@Column
    private Integer productInfoId;
    /**
     * 贷款分期数
     */@Column
    private Integer loanInstalments;
    /**
     * 贷款分期单位
     */@Column
    private String loanInstalmentUnit;
    /**
     * 贷款金额
     */@Column
    private Integer loanAmount;
    /**
     * 前期费用
     */@Column
    private Integer preFee;
    /**
     * 放款金额
     */@Column
    private Integer putAmount;
    /**
     * 贷款形式 1为信用，2为担保，3为抵押，4为其他
     */@Column
    private String creditType;
    /**
     * 支付方式 THIRD:第三方渠道  BANK:银行渠道
     */@Column
    private String payMod;
    /**
     * 还款方式\n            01-等额本息 \n            02-等额本金 \n            03-等本等息 \n            04-付息通\n            05-一次性还本付息\n            06-等比累进\n            07-等额累进\n            08-0+N\n            09-分阶段还款
     */@Column
    private String repayWay;
    /**
     * 放款模式：1:差额放款 3:先放款后收费 3:先收费后放款 4:先放款后收费（线下收取前期费用）
     */@Column
    private String loanType;
    /**
     * 销售部门id
     */@Column
    private Integer saleDepartmentId;
    /**
     * 还款账户姓名
     */@Column
    private String repayAccountName;
    /**
     * 还款账户证件类型
     */@Column
    private String repayAcctIdenType;
    /**
     * 还款账户证件号
     */@Column
    private String repayAcctIdenNum;
    /**
     * 还款账户
     */@Column
    private String repayAccount;
    /**
     * 还款账户卡折标识
     */@Column
    private String repayAccountType;
    /**
     * 还款账户银行行别代码
     */@Column
    private String repayAccountBankid;
    /**
     * 还款账户开户行行号(支付行号)
     */@Column
    private String repayActBranchNo;
    /**
     * 还款账户开户行名称
     */@Column
    private String repayAccountBankName;
    /**
     * 还款账户对公对私标识
     */@Column
    private String publicPrivate;
    /**
     * 还款账户开户省
     */@Column
    private String repayActProvince;
    /**
     * 还款账户开户市
     */@Column
    private String repayAccountCity;
    /**
     * POS验证状态 未验证 0014 已验证为空
     */@Column
    private String posStatus;
    /**
     * 首期还款日
     */@Column
    private Date startDate;
    /**
     * 末期还款日
     */@Column
    private Date endDate;
    /**
     * 合同来源：\n            NPLM_ICMP    综合信贷\n            NPLM_RZZL    融资租赁\n            NPLM_CDXT    车贷系统\n            NPLM_FDXT    房贷系统\n            
     */@Column
    private String contractSource;
    /**
     * 未分配还款额
     */@Column
    private Integer repayBalance;
    /**
     * 合同状态:\n            -1：合同废止\n            0：未放款，1：还款中，2：逾期，\n            9：正常还清，10：合同终止，11：合同核销，12：减免结清，13：特殊减免结清，14：提前结清，15：放款退回结清
     */@Column
    private String contractType;
    /**
     * 创建者
     */@Column
    private String creator;
    /**
     * 末次修改者
     */@Column
    private String updater;
    /**
     * 备注
     */@Column
    private String remark;
    /**
     * 循环授信编号
     */@Column
    private String cycleCreditId;
    /**
     * 修改类型
     */@Column
    private String updateType;
    @Column
    private String clientName;


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum;
    }

    @Column

    private String identityNum;

     @Transient
      List<NplmBorrowerInfo> borrowerInfos;
     @Transient
      List<NplmContractAttribute> contractAttributes;

    public List<NplmBorrowerInfo> getBorrowerInfos() {
        return borrowerInfos;
    }

    public void setBorrowerInfos(List<NplmBorrowerInfo> borrowerInfos) {
        this.borrowerInfos = borrowerInfos;
    }

    public List<NplmContractAttribute> getContractAttributes() {
        return contractAttributes;
    }

    public void setContractAttributes(List<NplmContractAttribute> contractAttributes) {
        this.contractAttributes = contractAttributes;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getLoanContractNum() {
        return loanContractNum;
    }
    public void setLoanContractNum(String loanContractNum) {
        this.loanContractNum = loanContractNum;
    }
    public String getBorrowerId() {
        return borrowerId;
    }
    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }
    public String getEcifId() {
        return ecifId;
    }
    public void setEcifId(String ecifId) {
        this.ecifId = ecifId;
    }
    public String getProCategoryCode() {
        return proCategoryCode;
    }
    public void setProCategoryCode(String proCategoryCode) {
        this.proCategoryCode = proCategoryCode;
    }
    public String getProCategoryName() {
        return proCategoryName;
    }
    public void setProCategoryName(String proCategoryName) {
        this.proCategoryName = proCategoryName;
    }
    public Integer getProductInfoId() {
        return productInfoId;
    }
    public void setProductInfoId(Integer productInfoId) {
        this.productInfoId = productInfoId;
    }
    public Integer getLoanInstalments() {
        return loanInstalments;
    }
    public void setLoanInstalments(Integer loanInstalments) {
        this.loanInstalments = loanInstalments;
    }
    public String getLoanInstalmentUnit() {
        return loanInstalmentUnit;
    }
    public void setLoanInstalmentUnit(String loanInstalmentUnit) {
        this.loanInstalmentUnit = loanInstalmentUnit;
    }
    public Integer getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }
    public Integer getPreFee() {
        return preFee;
    }
    public void setPreFee(Integer preFee) {
        this.preFee = preFee;
    }
    public Integer getPutAmount() {
        return putAmount;
    }
    public void setPutAmount(Integer putAmount) {
        this.putAmount = putAmount;
    }
    public String getCreditType() {
        return creditType;
    }
    public void setCreditType(String creditType) {
        this.creditType = creditType;
    }
    public String getPayMod() {
        return payMod;
    }
    public void setPayMod(String payMod) {
        this.payMod = payMod;
    }
    public String getRepayWay() {
        return repayWay;
    }
    public void setRepayWay(String repayWay) {
        this.repayWay = repayWay;
    }
    public String getLoanType() {
        return loanType;
    }
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }
    public Integer getSaleDepartmentId() {
        return saleDepartmentId;
    }
    public void setSaleDepartmentId(Integer saleDepartmentId) {
        this.saleDepartmentId = saleDepartmentId;
    }
    public String getRepayAccountName() {
        return repayAccountName;
    }
    public void setRepayAccountName(String repayAccountName) {
        this.repayAccountName = repayAccountName;
    }
    public String getRepayAcctIdenType() {
        return repayAcctIdenType;
    }
    public void setRepayAcctIdenType(String repayAcctIdenType) {
        this.repayAcctIdenType = repayAcctIdenType;
    }
    public String getRepayAcctIdenNum() {
        return repayAcctIdenNum;
    }
    public void setRepayAcctIdenNum(String repayAcctIdenNum) {
        this.repayAcctIdenNum = repayAcctIdenNum;
    }
    public String getRepayAccount() {
        return repayAccount;
    }
    public void setRepayAccount(String repayAccount) {
        this.repayAccount = repayAccount;
    }
    public String getRepayAccountType() {
        return repayAccountType;
    }
    public void setRepayAccountType(String repayAccountType) {
        this.repayAccountType = repayAccountType;
    }
    public String getRepayAccountBankid() {
        return repayAccountBankid;
    }
    public void setRepayAccountBankid(String repayAccountBankid) {
        this.repayAccountBankid = repayAccountBankid;
    }
    public String getRepayActBranchNo() {
        return repayActBranchNo;
    }
    public void setRepayActBranchNo(String repayActBranchNo) {
        this.repayActBranchNo = repayActBranchNo;
    }
    public String getRepayAccountBankName() {
        return repayAccountBankName;
    }
    public void setRepayAccountBankName(String repayAccountBankName) {
        this.repayAccountBankName = repayAccountBankName;
    }
    public String getPublicPrivate() {
        return publicPrivate;
    }
    public void setPublicPrivate(String publicPrivate) {
        this.publicPrivate = publicPrivate;
    }
    public String getRepayActProvince() {
        return repayActProvince;
    }
    public void setRepayActProvince(String repayActProvince) {
        this.repayActProvince = repayActProvince;
    }
    public String getRepayAccountCity() {
        return repayAccountCity;
    }
    public void setRepayAccountCity(String repayAccountCity) {
        this.repayAccountCity = repayAccountCity;
    }
    public String getPosStatus() {
        return posStatus;
    }
    public void setPosStatus(String posStatus) {
        this.posStatus = posStatus;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public String getContractSource() {
        return contractSource;
    }
    public void setContractSource(String contractSource) {
        this.contractSource = contractSource;
    }
    public Integer getRepayBalance() {
        return repayBalance;
    }
    public void setRepayBalance(Integer repayBalance) {
        this.repayBalance = repayBalance;
    }
    public String getContractType() {
        return contractType;
    }
    public void setContractType(String contractType) {
        this.contractType = contractType;
    }
    public String getCreator() {
        return creator;
    }
    public void setCreator(String creator) {
        this.creator = creator;
    }
    public String getUpdater() {
        return updater;
    }
    public void setUpdater(String updater) {
        this.updater = updater;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getCycleCreditId() {
        return cycleCreditId;
    }
    public void setCycleCreditId(String cycleCreditId) {
        this.cycleCreditId = cycleCreditId;
    }
    public String getUpdateType() {
        return updateType;
    }
    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

}