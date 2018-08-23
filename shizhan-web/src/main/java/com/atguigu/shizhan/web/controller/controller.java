package com.atguigu.shizhan.web.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.shizhan.bean.*;
import com.atguigu.shizhan.inter.HeTongInterface;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.stream.events.StartDocument;
import java.lang.annotation.Repeatable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class controller {

@Reference
private HeTongInterface heTongInterface;




    @RequestMapping("/smp")
    public String index(){
        return "smp";
    }

    @RequestMapping("放款列表/放款列表.html")
    public String fangkuan(){


        return "放款列表";
    }

    @RequestMapping("合同列表/合同列表.htm")
    public String hetong(){

        return "合同列表/合同列表";


    }



    @RequestMapping("前期费用查询/前期费用查询列表.htm")
    public String qianqifeiyong(){

        return "前期费用查询/前期费用查询列表";
    }


    @RequestMapping("selectByInfo")
    @ResponseBody
  public Map<String,Object> list(NplmLoanContract info, HttpServletRequest request){
       /* String pageNumber = request.getParameter("pageNumber");
        String pageSize = request.getParameter("pageSize");
        Page page=new Page();
        page.setPageNumber(pageNumber);
        page.setPageSize(pageSize);
        String start= String.valueOf((Integer.parseInt(pageNumber)-1)*Integer.parseInt(pageSize));
        page.setStart(start);*/


        String page1 = request.getParameter("page");
        String rows = request.getParameter("rows");
         Integer start=(Integer.parseInt((String)page1)-1)*Integer.parseInt((String)rows);
         Integer totalSize=0;
        if(Integer.parseInt(rows)%Integer.parseInt(page1)==0){
            totalSize=Integer.parseInt(rows)/Integer.parseInt(page1);
        }else{
            totalSize=Integer.parseInt(rows)/Integer.parseInt(page1)+1;
        }

        Page page=new Page();

        page.setStart(String.valueOf(start));
        page.setPageNumber(String.valueOf(page1));
        page.setPageSize(String.valueOf(Integer.parseInt((String)rows)));
        request.setAttribute("pageSize",Integer.parseInt(rows));
            List<NplmLoanContract> searchResult = heTongInterface.selectByInfo(info,page);
            Map<String,Object> map =new HashMap<>();
            map.put("rows",searchResult);
            Integer total=heTongInterface.getTotal();
            map.put("total",total);
            return  map;


    }


    @RequestMapping("/common/查看还款情况页面.html")
    public String serachLoanContract(javax.servlet.http.HttpServletRequest request){
        String loanContractNum = request.getParameter("loanContractNum");
        NplmLoanContract nplmLoanContract= heTongInterface.getLoanAttribute(loanContractNum);
        String clientName = nplmLoanContract.getClientName();
        String id = nplmLoanContract.getBorrowerId();
        NplmBorrowerInfo nplmBorrowerInfo= heTongInterface.getBorrowerInfo(id);
        request.setAttribute("nplmBorrowerInfo",nplmBorrowerInfo);
        request.setAttribute("clientName",clientName);
        request.setAttribute("loanContractNum",loanContractNum);
        request.setAttribute("nplmLoanContract",nplmLoanContract);

        List<NplmRepaymentDetail> nplmRepaymentDetail= heTongInterface.getDetail(loanContractNum);
        List<NplmRepaymentPlan> nplmRepaymentPlan= heTongInterface.getPlan(loanContractNum);
        List<NplmRepaymentRecord> nplmRepaymentRecord=heTongInterface.getRecord(loanContractNum);
        request.setAttribute("nplmRepaymentDetail",nplmRepaymentDetail);
        request.setAttribute("nplmRepaymentPlan",nplmRepaymentPlan);
        request.setAttribute("nplmRepaymentRecord",nplmRepaymentRecord);



        return "/common/查看还款情况页面";
    }

    @RequestMapping("common/修改还款情况页面.html")
    public String updateLoanContract(javax.servlet.http.HttpServletRequest request){
        String loanContractNum = request.getParameter("loanContractNum");



        return "common/修改还款情况页面";

    }


}
