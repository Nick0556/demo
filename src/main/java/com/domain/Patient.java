package com.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Patient {
    /**
     * 编号
     */
    private Integer id;

    /**
     * 病患来源
     */
    private String source;

    /**
     * 姓名
     */
    private String name;

    /**
     * 卡片编号
     */
    private Integer card;

    /**
     * 性别
     */
    private String sex;

    /**
     * 身份证号
     */
    private String identity;

    /**
     * 出生日期
     */
    private Date birth;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 联系电话
     */
    private Long tel;

    /**
     * 应急联系人
     */
    private String contactsname;

    /**
     * 应急人电话
     */
    private Long contactstel;

    /**
     * 保险类别
     */
    private String insurancecategory;

    /**
     * 医保号
     */
    private String medicinenum;

    /**
     * 血型
     */
    private String bloodtype;

    /**
     * 传染病
     */
    private String disease;

    /**
     * 家庭住址
     */
    private String addr;

    /**
     * 血管通路类型
     */
    private String vasculartype;

    /**
     * 透析器类型
     */
    private String dialyzermodel;

    /**
     * 管路型号
     */
    private String pipetype;

    /**
     * 住院科室
     */
    private String department;

    /**
     * 住院号
     */
    private String hospitalizationnum;

    /**
     * 经治医生
     */
    private String doctor;

    /**
     * 是否停用
     */
    private Date addtime;

    private Integer isDelete;

    /**
     * 总结
     */
    private String sum;

    /**
     * 婚姻
     */
    private String marriage;

    /**
     * 名族
     */
    private String nation;

    /**
     * 职业
     */
    private String occupation;

    /**
     * 出生地
     */
    private String nativel;

    /**
     * 透析方式
     */
    private String mode;

    /**
     * 原发病
     */
    private String protopathy;

    /**
     * 并发症
     */
    private String complication;

    /**
     * 伴随病
     */
    private String saf;

    /**
     * 过敏史
     */
    private String allergy;

    /**
     * 首次透析时间
     */
    private Date newst;

    /**
     * 本院开始时间
     */
    private Date newstg;

    /**
     * 干体重
     */
    private Double dry;

    /**
     * 周频次
     */
    private String tiw;

    /**
     * 透析时长
     */
    private String longtime;

    /**
     * 是否死亡
     */
    private String deadmark;

    /**
     * 在院状态
     */
    private String changestatus;

    /**
     * 转归原因
     */
    private String changemode;

    /**
     * 血型
     */
    private String bloodtyperh;

    /**
     * 民族
     */
    private String nat;

    /**
     * 职业
     */
    private String profe;

    /**
     * 床号
     */
    private String chn;

    /**
     * 籍贯
     */
    private String jiguan;

    /**
     * 身份证类型
     */
    private String idtype;

    private String jcnu;


}