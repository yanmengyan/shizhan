package com.atguigu.shizhan.bean;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 合同_合同属性表
 * @author jdandian.com
 * @date 2018年08月19日
 */
public class NplmContractAttribute implements Serializable {
    /**
     * 主键
     */@Column
    @Id
    private int id;
    /**
     * 合同id
     */@Column
    private int loanContractId;
    /**
     * 合同编号
     */@Column
    private int loanContractNum;
    /**
     * 业务模式 1:转债权 2:火凤凰 3:信托 4:互联网 5:融资租赁 6:房贷一对一
     */@Column
    private String businessType;
    /**
     * 是否加急 Y : 是   N ： 否
     */@Column
    private String isExpedited;
    /**
     * 签约方式 1：纸质  2：电子签约
     */@Column
    private int signType;
    /**
     * 审核日期
     */@Column
    private String approveDate;
    /**
     * 首期还款时间
     */@Column
    private String firstRepayDate;
    /**
     * 收费方式 1:趸缴 2:双棒 3:期缴
     */@Column
    private int feeFlag;
    /**
     * 计息方式 M:按月,S:按季,H:按半年,Y:按年,E:利随本清,D30:按30天
     */@Column
    private String interestFlag;
    /**
     * 计息类型 1: 按期计息 2 :按实际天数计息\n            
     */@Column
    private int interestType;
    /**
     * 宽限期
     */@Column
    private int graceDays;
    /**
     * IRR
     */@Column
    private int irr;
    /**
     * 利率
     */@Column
    private int lnsRate;
    /**
     * 进件渠道代码：GD，CX，XW，RZ
     */@Column
    private String channelCode;
    /**
     * 进件渠道：个贷、创新、小微、融资
     */@Column
    private String channelName;
    /**
     * 所属信贷员ID
     */@Column
    private String loanOfficerId;
    /**
     * 管辖城市ID
     */@Column
    private String cityid;
    /**
     * 管辖城市
     */@Column
    private String city;
    /**
     * 是否合同变更 Y:是  N:否
     */@Column
    private String isModify;
    /**
     * 是否还款方案变更 Y:是  N:否
     */@Column
    private String isSchemeModify;
    /**
     * 循环贷方式 1:差额  2:先结清旧合同 后放新合同款
     */@Column
    private int recycleWay;
    /**
     * 是否循环贷 Y:是  N:否
     */@Column
    private String isRecycleLoad;
    /**
     * 循环贷次数
     */@Column
    private int recycleLoanCnt;
    /**
     * 旧合同号
     */@Column
    private String oldContractNum;
    /**
     * 循环贷结清上一笔金额
     */@Column
    private int settleAmount;
    /**
     * 合同变更后新合同编号
     */@Column
    private String newContractNum;
    /**
     * 是否缩期 Y:是  N:否
     */@Column
    private String isShorten;
    /**
     * 是否展期 Y:是  N:否
     */@Column
    private String isExtend;
    /**
     * 是否转产品
     */@Column
    private String isChangeProduce;
    /**
     * 是否违约 Y:是  N:否
     */@Column
    private String isOverdue;
    /**
     * 是否一次性提前还款
     */@Column
    private String isPayAhead;
    /**
     * 是否部分提前还款
     */@Column
    private String isPayPart;
    /**
     * 借款用途
     */@Column
    private String purpose;
    /**
     * 借款子用途
     */@Column
    private String purposeSon;
    /**
     * 详细借款用途
     */@Column
    private String purposeDetail;
    /**
     * 是否分账户回款 Y：是  N：否
     */@Column
    private String isDivAccount;
    /**
     * 合同所属系统 0:新贷后   1：迁移-房贷系统   2：迁移-贷后系统
     */@Column
    private String systemType;
    /**
     * 高危标识 1:高位 0或空 非高危
     */@Column
    private String highRisk;
    /**
     * 是否买断 Y：是  N：否
     */@Column
    private String isBuyout;
    /**
     * 前期费用处理模式 1:线上   2:线下? 默认线上
     */@Column
    private String feeProcessType;
    /**
     * 助学贷合作机构名称
     */@Column
    private String studentCorpName;
    /**
     * 合同结清日期
     */@Column
    private String settleDate;
    /**
     * 习惯打款时间
     */@Column
    private String habitTime;
    /**
     * 还款日
     */@Column
    private String repayday;
    /**
     * 系统申请进件编号
     */@Column
    private String applyId;
    /**
     * 系统申请进件父编号
     */@Column
    private String oldApplyId;
    /**
     * 营业部编号
     */@Column
    private String deptId;
    /**
     * 营业部名称
     */@Column
    private String deptName;
    /**
     * 创建者
     */@Column
    private String creator;
    /**
     * 末次修改者
     */@Column
    private String updater;
    /**
     * 修改类型
     */@Column
    private String updateType;
    /**
     * 前期服务费折扣
     */@Column
    private int frontChargeDiscount;
    /**
     * 月管理费率
     */@Column
    private int monthMRate;
    /**
     * 手续费率
     */@Column
    private int handleChargeRate;
    /**
     * 贷款次数
     */@Column
    private int loanTimes;
    /**
     * 抵押物
     */@Column
    private String pawn;
    /**
     * 手续费
     */@Column
    private int handleCharge;
    /**
     * 分期服务费折扣
     */@Column
    private int monthChargeDiscount;
    /**
     * 担保费
     */@Column
    private int guaranteeFee;
    /**
     * 担保公司
     */@Column
    private String guaranteeCompany;

    private String loanPinzhong;

    private String yewuMoshi;
    private String xintuoJigou;
    private String xintuoChanpin;
    private String xintuoJihua;

    public String getLoanPinzhong() {
        return loanPinzhong;
    }

    public void setLoanPinzhong(String loanPinzhong) {
        this.loanPinzhong = loanPinzhong;
    }

    public String getYewuMoshi() {
        return yewuMoshi;
    }

    public void setYewuMoshi(String yewuMoshi) {
        this.yewuMoshi = yewuMoshi;
    }

    public String getXintuoJigou() {
        return xintuoJigou;
    }

    public void setXintuoJigou(String xintuoJigou) {
        this.xintuoJigou = xintuoJigou;
    }

    public String getXintuoChanpin() {
        return xintuoChanpin;
    }

    public void setXintuoChanpin(String xintuoChanpin) {
        this.xintuoChanpin = xintuoChanpin;
    }

    public String getXintuoJihua() {
        return xintuoJihua;
    }

    public void setXintuoJihua(String xintuoJihua) {
        this.xintuoJihua = xintuoJihua;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getLoanContractId() {
        return loanContractId;
    }
    public void setLoanContractId(int loanContractId) {
        this.loanContractId = loanContractId;
    }
    public int getLoanContractNum() {
        return loanContractNum;
    }
    public void setLoanContractNum(int loanContractNum) {
        this.loanContractNum = loanContractNum;
    }
    public String getBusinessType() {
        return businessType;
    }
    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
    public String getIsExpedited() {
        return isExpedited;
    }
    public void setIsExpedited(String isExpedited) {
        this.isExpedited = isExpedited;
    }
    public int getSignType() {
        return signType;
    }
    public void setSignType(int signType) {
        this.signType = signType;
    }
    public String getApproveDate() {
        return approveDate;
    }
    public void setApproveDate(String approveDate) {
        this.approveDate = approveDate;
    }
    public String getFirstRepayDate() {
        return firstRepayDate;
    }
    public void setFirstRepayDate(String firstRepayDate) {
        this.firstRepayDate = firstRepayDate;
    }
    public int getFeeFlag() {
        return feeFlag;
    }
    public void setFeeFlag(int feeFlag) {
        this.feeFlag = feeFlag;
    }
    public String getInterestFlag() {
        return interestFlag;
    }
    public void setInterestFlag(String interestFlag) {
        this.interestFlag = interestFlag;
    }
    public int getInterestType() {
        return interestType;
    }
    public void setInterestType(int interestType) {
        this.interestType = interestType;
    }
    public int getGraceDays() {
        return graceDays;
    }
    public void setGraceDays(int graceDays) {
        this.graceDays = graceDays;
    }
    public int getIrr() {
        return irr;
    }
    public void setIrr(int irr) {
        this.irr = irr;
    }
    public int getLnsRate() {
        return lnsRate;
    }
    public void setLnsRate(int lnsRate) {
        this.lnsRate = lnsRate;
    }
    public String getChannelCode() {
        return channelCode;
    }
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }
    public String getChannelName() {
        return channelName;
    }
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
    public String getLoanOfficerId() {
        return loanOfficerId;
    }
    public void setLoanOfficerId(String loanOfficerId) {
        this.loanOfficerId = loanOfficerId;
    }
    public String getCityid() {
        return cityid;
    }
    public void setCityid(String cityid) {
        this.cityid = cityid;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getIsModify() {
        return isModify;
    }
    public void setIsModify(String isModify) {
        this.isModify = isModify;
    }
    public String getIsSchemeModify() {
        return isSchemeModify;
    }
    public void setIsSchemeModify(String isSchemeModify) {
        this.isSchemeModify = isSchemeModify;
    }
    public int getRecycleWay() {
        return recycleWay;
    }
    public void setRecycleWay(int recycleWay) {
        this.recycleWay = recycleWay;
    }
    public String getIsRecycleLoad() {
        return isRecycleLoad;
    }
    public void setIsRecycleLoad(String isRecycleLoad) {
        this.isRecycleLoad = isRecycleLoad;
    }
    public int getRecycleLoanCnt() {
        return recycleLoanCnt;
    }
    public void setRecycleLoanCnt(int recycleLoanCnt) {
        this.recycleLoanCnt = recycleLoanCnt;
    }
    public String getOldContractNum() {
        return oldContractNum;
    }
    public void setOldContractNum(String oldContractNum) {
        this.oldContractNum = oldContractNum;
    }
    public int getSettleAmount() {
        return settleAmount;
    }
    public void setSettleAmount(int settleAmount) {
        this.settleAmount = settleAmount;
    }
    public String getNewContractNum() {
        return newContractNum;
    }
    public void setNewContractNum(String newContractNum) {
        this.newContractNum = newContractNum;
    }
    public String getIsShorten() {
        return isShorten;
    }
    public void setIsShorten(String isShorten) {
        this.isShorten = isShorten;
    }
    public String getIsExtend() {
        return isExtend;
    }
    public void setIsExtend(String isExtend) {
        this.isExtend = isExtend;
    }
    public String getIsChangeProduce() {
        return isChangeProduce;
    }
    public void setIsChangeProduce(String isChangeProduce) {
        this.isChangeProduce = isChangeProduce;
    }
    public String getIsOverdue() {
        return isOverdue;
    }
    public void setIsOverdue(String isOverdue) {
        this.isOverdue = isOverdue;
    }
    public String getIsPayAhead() {
        return isPayAhead;
    }
    public void setIsPayAhead(String isPayAhead) {
        this.isPayAhead = isPayAhead;
    }
    public String getIsPayPart() {
        return isPayPart;
    }
    public void setIsPayPart(String isPayPart) {
        this.isPayPart = isPayPart;
    }
    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
    public String getPurposeSon() {
        return purposeSon;
    }
    public void setPurposeSon(String purposeSon) {
        this.purposeSon = purposeSon;
    }
    public String getPurposeDetail() {
        return purposeDetail;
    }
    public void setPurposeDetail(String purposeDetail) {
        this.purposeDetail = purposeDetail;
    }
    public String getIsDivAccount() {
        return isDivAccount;
    }
    public void setIsDivAccount(String isDivAccount) {
        this.isDivAccount = isDivAccount;
    }
    public String getSystemType() {
        return systemType;
    }
    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }
    public String getHighRisk() {
        return highRisk;
    }
    public void setHighRisk(String highRisk) {
        this.highRisk = highRisk;
    }
    public String getIsBuyout() {
        return isBuyout;
    }
    public void setIsBuyout(String isBuyout) {
        this.isBuyout = isBuyout;
    }
    public String getFeeProcessType() {
        return feeProcessType;
    }
    public void setFeeProcessType(String feeProcessType) {
        this.feeProcessType = feeProcessType;
    }
    public String getStudentCorpName() {
        return studentCorpName;
    }
    public void setStudentCorpName(String studentCorpName) {
        this.studentCorpName = studentCorpName;
    }
    public String getSettleDate() {
        return settleDate;
    }
    public void setSettleDate(String settleDate) {
        this.settleDate = settleDate;
    }
    public String getHabitTime() {
        return habitTime;
    }
    public void setHabitTime(String habitTime) {
        this.habitTime = habitTime;
    }
    public String getRepayday() {
        return repayday;
    }
    public void setRepayday(String repayday) {
        this.repayday = repayday;
    }
    public String getApplyId() {
        return applyId;
    }
    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }
    public String getOldApplyId() {
        return oldApplyId;
    }
    public void setOldApplyId(String oldApplyId) {
        this.oldApplyId = oldApplyId;
    }
    public String getDeptId() {
        return deptId;
    }
    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
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
    public String getUpdateType() {
        return updateType;
    }
    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }
    public int getFrontChargeDiscount() {
        return frontChargeDiscount;
    }
    public void setFrontChargeDiscount(int frontChargeDiscount) {
        this.frontChargeDiscount = frontChargeDiscount;
    }
    public int getMonthMRate() {
        return monthMRate;
    }
    public void setMonthMRate(int monthMRate) {
        this.monthMRate = monthMRate;
    }
    public int getHandleChargeRate() {
        return handleChargeRate;
    }
    public void setHandleChargeRate(int handleChargeRate) {
        this.handleChargeRate = handleChargeRate;
    }
    public int getLoanTimes() {
        return loanTimes;
    }
    public void setLoanTimes(int loanTimes) {
        this.loanTimes = loanTimes;
    }
    public String getPawn() {
        return pawn;
    }
    public void setPawn(String pawn) {
        this.pawn = pawn;
    }
    public int getHandleCharge() {
        return handleCharge;
    }
    public void setHandleCharge(int handleCharge) {
        this.handleCharge = handleCharge;
    }
    public int getMonthChargeDiscount() {
        return monthChargeDiscount;
    }
    public void setMonthChargeDiscount(int monthChargeDiscount) {
        this.monthChargeDiscount = monthChargeDiscount;
    }
    public int getGuaranteeFee() {
        return guaranteeFee;
    }
    public void setGuaranteeFee(int guaranteeFee) {
        this.guaranteeFee = guaranteeFee;
    }
    public String getGuaranteeCompany() {
        return guaranteeCompany;
    }
    public void setGuaranteeCompany(String guaranteeCompany) {
        this.guaranteeCompany = guaranteeCompany;
    }


}