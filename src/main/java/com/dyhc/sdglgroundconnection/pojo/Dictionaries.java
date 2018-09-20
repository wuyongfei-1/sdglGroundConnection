package com.dyhc.sdglgroundconnection.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * this class by created wuyongfei on 2018/6/5 13:50
 * 字典表
 **/
@Table(name = "dictionaries")
public class Dictionaries implements Serializable {
    @Id
    @Column(name = "dictionariesId")
    private int dictionariesId; // 字典编号
    @Column(name = "typeCode")
    private String typeCode; // 编码（AAA、BBB）varch
    @Column(name = "typeName")
    private String typeName; // 编码名称（景点等级、餐厅类型）
    @Column(name = "valueId")
    private Integer valueId; // 内容编号int
    @Column(name = "valueContent1")
    private String valueContent1; // 内容1（例如：餐饭名、AAAAA级）
    @Column(name = "valueContent2")
    private String valueContent2; // 内容2（餐饭价格）
    @Column(name = "valueContent3")
    private String valueContent3; // 内容3（餐饭价格）
    @Column(name = "whetherDel")
    private Integer whetherDel; // 是否删除（1代表已删除，0代表未删除）
    @Column(name = "createBy")
    private Integer createBy; // 创建人 （外键，与人员表关联）
    @Column(name = "updateBy")
    private Integer updateBy; // 修改人（外键，与人员表关联）
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "updateDate")
    private Date updateDate; // 修改日期
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "createDate")
    private Date createDate; // 创建时间
    private String value1;
    private String value2;
    private String value3;

    @Id
    @Column(name = "dictionariesId")
    public int getDictionariesId() {
        return dictionariesId;
    }

    public void setDictionariesId(int dictionariesId) {
        this.dictionariesId = dictionariesId;
    }

    @Basic
    @Column(name = "typeCode")
    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    @Basic
    @Column(name = "typeName")
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Basic
    @Column(name = "valueId")
    public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
    }

    @Basic
    @Column(name = "valueContent1")
    public String getValueContent1() {
        return valueContent1;
    }

    public void setValueContent1(String valueContent1) {
        this.valueContent1 = valueContent1;
    }

    @Basic
    @Column(name = "valueContent2")
    public String getValueContent2() {
        return valueContent2;
    }

    public void setValueContent2(String valueContent2) {
        this.valueContent2 = valueContent2;
    }

    @Basic
    @Column(name = "whetherDel")
    public Integer getWhetherDel() {
        return whetherDel;
    }

    public void setWhetherDel(Integer whetherDel) {
        this.whetherDel = whetherDel;
    }

    @Basic
    @Column(name = "createBy")
    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "updateBy")
    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "updateDate")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "createDate")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "value1")
    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    @Basic
    @Column(name = "value2")
    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    @Basic
    @Column(name = "value3")
    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dictionaries that = (Dictionaries) o;
        return dictionariesId == that.dictionariesId &&
                Objects.equals(typeCode, that.typeCode) &&
                Objects.equals(typeName, that.typeName) &&
                Objects.equals(valueId, that.valueId) &&
                Objects.equals(valueContent1, that.valueContent1) &&
                Objects.equals(valueContent2, that.valueContent2) &&
                Objects.equals(whetherDel, that.whetherDel) &&
                Objects.equals(createBy, that.createBy) &&
                Objects.equals(updateBy, that.updateBy) &&
                Objects.equals(updateDate, that.updateDate) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(value1, that.value1) &&
                Objects.equals(value2, that.value2) &&
                Objects.equals(value3, that.value3);
    }

    @Override
    public int hashCode() {

        return Objects.hash(dictionariesId, typeCode, typeName, valueId, valueContent1, valueContent2, whetherDel, createBy, updateBy, updateDate, createDate, value1, value2, value3);
    }

    public String getValueContent3() {
        return valueContent3;
    }

    public void setValueContent3(String valueContent3) {
        this.valueContent3 = valueContent3;
    }
}
