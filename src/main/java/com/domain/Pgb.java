package com.domain;

import lombok.Data;

@Data
public class Pgb {
    private Integer id;

    /**
    * 姓名
    */
    private String pname;

    /**
    * 身份证
    */
    private String identity;

    /**
    * 日期
    */
    private String rq;

    /**
    * 住院号
    */
    private String zyh;

    /**
    * 性别
    */
    private String sex;

    /**
    * 年龄
    */
    private String age;

    /**
    * 精神状况
    */
    private String jszk;

    /**
    * 生活自理能力
    */
    private String sznl;

    /**
    * 社会功能
    */
    private String shgn;

    /**
    * 睡眠质量
    */
    private String smzl;

    /**
    * 饮食情况
    */
    private String ysqk;

    /**
    * 尿量
    */
    private String nl;

    /**
    * 尿量值
    */
    private String nlS;

    /**
    * 尿量颜色
    */
    private String nlCo;

    /**
    * 大便
    */
    private String db;

    /**
    * 大便次数
    */
    private String dbCs;

    /**
    * 大便其它
    */
    private String dbQt;

    /**
    * 临床症状
    */
    private String lczz;

    /**
    * 体征
    */
    private String tz1;

    /**
    * 体征2
    */
    private String tz2;

    /**
    * 水肿
    */
    private String sz;

    /**
    * 水肿部位
    */
    private String szbw;

    /**
    * 肺部呼吸音
    */
    private String fbhxy;

    /**
    * 肺部啰音
    */
    private String fbly;

    /**
    * 腹部
    */
    private String fb;

    /**
    * 目前干体重
    */
    private String dry;

    /**
    * 体重增长
    */
    private String dryadd;

    /**
    * 占干体重比例
    */
    private String dryDt;

    /**
    * KT/V
    */
    private String ktV;

    /**
    * URR
    */
    private String urr;

    /**
    * RBC
    */
    private String rbc;

    /**
    * HB
    */
    private String hb;

    /**
    * PTL
    */
    private String ptl;

    /**
    * ALB
    */
    private String alb;

    /**
    * TCH
    */
    private String tch;

    /**
    * TG
    */
    private String tg;

    /**
    * FBG
    */
    private String fbg;

    /**
    * CRP
    */
    private String crp;

    /**
    * BUN
    */
    private String bun;

    /**
    * Scr
    */
    private String scr;

    /**
    * UA
    */
    private String ua;

    /**
    * K
    */
    private String k;

    /**
    * na
    */
    private String na;

    /**
    * ca
    */
    private String ca;

    /**
    * p
    */
    private String p;

    /**
    * iPTH
    */
    private String ipth;

    /**
    * SF
    */
    private String sf;

    /**
    * TSAT
    */
    private String tsat;

    /**
    * CTXdt
    */
    private String ctxdt;

    /**
    * CTX
    */
    private String ctx;

    /**
    * 心超
    */
    private String xc;

    /**
    * 心超其它
    */
    private String xcqt;

    /**
    * 并发症
    */
    private String bfz;

    /**
    * 透析频率
    */
    private String txpl;

    /**
    * 透析频更改
    */
    private String txgg;

    /**
    * 透析更改值
    */
    private String txggz;

    /**
    * 透析时间
    */
    private String txsj;

    /**
    * 透析时间更改
    */
    private String txsjgg;

    /**
    * 透析时间更改值
    */
    private String txsjggz;

    /**
    * 透析方式
    */
    private String txfs;

    /**
    * 透析方式gg
    */
    private String txfsgg;

    /**
    * 透析方式ggz
    */
    private String txfsggz;

    /**
    * 血管通路
    */
    private String xgtl;

    /**
    * 目前血管通路评价
    */
    private String xxgtlpj;

    /**
    * 目前血管通路评价gg
    */
    private String xggg;

    /**
    * 透析充分性
    */
    private String cfx;

    /**
    * 营养状况
    */
    private String yy;

    /**
    * 改进计划
    */
    private String gj;

    /**
    * 改进计划其它
    */
    private String gjqt;

    @Override
    public String toString(){
        return getCtx();
    }
}