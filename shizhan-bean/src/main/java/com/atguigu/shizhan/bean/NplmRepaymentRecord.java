package com.atguigu.shizhan.bean;

import java.io.Serializable;
import java.util.Date;
/**
 * 还款_还款记录表
 * @author jdandian.com
 * @date 2018年08月19日
 */
public class NplmRepaymentRecord implements Serializable {
    /**
     * id
     */
    private Integer id;
    /**
     * 业务请求ID
     */
    private Integer businessRequestId;
    /**
     * 合同编号
     */
    private Integer loanContractNum;
    /**
     * 还款请求日期
     */
    private Date repaymentDate;
    /**
     * 逾期天数
     */
    private Integer overdueDays;
    /**
     * 逾期总金额
     */
    private Integer overdueAmount;
    /**
     * 扣款金额
     */
    private Integer repaymentAmount;
    /**
     * 成功金额
     */
    private Integer successAmount;
    /**
     * 还款状态\n            0	处理中\n            1	成功\n            2	失败\n            3	部分成功\n            4	已撤销\n            5              不执行\n            
     */
    private String status;
    /**
     * 备注
     */
    private String remark;
    /**
     * 划扣特殊标识
     */
    private String specialCode;
    /**
     * 扣款顺序
     */
    private Integer sort;
    /**
     * 数据创建类型：\n            0	前期费用(先放后收模式)\n            1	正常\n            2	逾期\n            3	预约-逾期\n            4	预约-正常\n            5	预约-一次性提前还款\n            6	预约-部分提前还款\n            7	预约-前期费用\n            8	展期\n            9	转产品\n            10	部分提前还款\n            11	循环贷结清\n            12	退款-保证金\n            13	退款-还款\n            14	退款-前期费用\n            15	减免\n            16	减免结清\n            17	线下-正常\n            18	保证金抵偿\n            19	前期费用(先收后放模式)\n            20	线下-提前还款\n            21	晚确认提前还款结清\n            22	前期费用（差额放款模式）\n            23	线下-前期费用\n            24	线下-展期费用\n            25	逾期-晚回盘补算逾期\n            26	逾期-前期费用
     */
    private String dataCreateType;
    /**
     * 创建者
     */
    private String creator;
    /**
     * 末次修改者
     */
    private String updater;
    /**
     * 账户姓名
     */
    private String accountName;
    /**
     * 账户证件类型
     */
    private String acctIdenType;
    /**
     * 账户证件号
     */
    private String acctIdenNum;
    /**
     * 账户
     */
    private String accountNo;
    /**
     * 账户卡折标识
     */
    private String accountType;
    /**
     * 账户银行行别代码
     */
    private String accountBankid;
    /**
     * 账户开户行行号(支付行号)
     */
    private String accountBranchNo;
    /**
     * 账户开户行名称
     */
    private String accountBankName;
    /**
     * 账户对公对私标识
     */
    private String publicPrivate;
    /**
     * 账户开户省
     */
    private String actProvince;
    /**
     * 账户开户市
     */
    private String accountCity;
    /**
     * 修改类型
     */
    private String updateType;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getBusinessRequestId() {
        return businessRequestId;
    }
    public void setBusinessRequestId(Integer businessRequestId) {
        this.businessRequestId = businessRequestId;
    }
    public Integer getLoanContractNum() {
        return loanContractNum;
    }
    public void setLoanContractNum(Integer loanContractNum) {
        this.loanContractNum = loanContractNum;
    }
    public Date getRepaymentDate() {
        return repaymentDate;
    }
    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }
    public Integer getOverdueDays() {
        return overdueDays;
    }
    public void setOverdueDays(Integer overdueDays) {
        this.overdueDays = overdueDays;
    }
    public Integer getOverdueAmount() {
        return overdueAmount;
    }
    public void setOverdueAmount(Integer overdueAmount) {
        this.overdueAmount = overdueAmount;
    }
    public Integer getRepaymentAmount() {
        return repaymentAmount;
    }
    public void setRepaymentAmount(Integer repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }
    public Integer getSuccessAmount() {
        return successAmount;
    }
    public void setSuccessAmount(Integer successAmount) {
        this.successAmount = successAmount;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getSpecialCode() {
        return specialCode;
    }
    public void setSpecialCode(String specialCode) {
        this.specialCode = specialCode;
    }
    public Integer getSort() {
        return sort;
    }
    public void setSort(Integer sort) {
        this.sort = sort;
    }
    public String getDataCreateType() {
        return dataCreateType;
    }
    public void setDataCreateType(String dataCreateType) {
        this.dataCreateType = dataCreateType;
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
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public String getAcctIdenType() {
        return acctIdenType;
    }
    public void setAcctIdenType(String acctIdenType) {
        this.acctIdenType = acctIdenType;
    }
    public String getAcctIdenNum() {
        return acctIdenNum;
    }
    public void setAcctIdenNum(String acctIdenNum) {
        this.acctIdenNum = acctIdenNum;
    }
    public String getAccountNo() {
        return accountNo;
    }
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public String getAccountBankid() {
        return accountBankid;
    }
    public void setAccountBankid(String accountBankid) {
        this.accountBankid = accountBankid;
    }
    public String getAccountBranchNo() {
        return accountBranchNo;
    }
    public void setAccountBranchNo(String accountBranchNo) {
        this.accountBranchNo = accountBranchNo;
    }
    public String getAccountBankName() {
        return accountBankName;
    }
    public void setAccountBankName(String accountBankName) {
        this.accountBankName = accountBankName;
    }
    public String getPublicPrivate() {
        return publicPrivate;
    }
    public void setPublicPrivate(String publicPrivate) {
        this.publicPrivate = publicPrivate;
    }
    public String getActProvince() {
        return actProvince;
    }
    public void setActProvince(String actProvince) {
        this.actProvince = actProvince;
    }
    public String getAccountCity() {
        return accountCity;
    }
    public void setAccountCity(String accountCity) {
        this.accountCity = accountCity;
    }
    public String getUpdateType() {
        return updateType;
    }
    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

}