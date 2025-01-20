package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 儿童信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
@TableName("ertongxinxi")
public class ErtongxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ErtongxinxiEntity() {
		
	}
	
	public ErtongxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 儿童姓名
	 */
					
	private String ertongxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 出生日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chushengriqi;
	
	/**
	 * 居住地址
	 */
					
	private String juzhudizhi;
	
	/**
	 * 关系
	 */
					
	private String guanxi;
	
	/**
	 * 儿童月龄
	 */
					
	private String ertongyueling;
	
	/**
	 * 儿童年龄
	 */
					
	private String ertongnianling;
	
	/**
	 * 家长账号
	 */
					
	private String jiazhangzhanghao;
	
	/**
	 * 家长姓名
	 */
					
	private String jiazhangxingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：儿童姓名
	 */
	public void setErtongxingming(String ertongxingming) {
		this.ertongxingming = ertongxingming;
	}
	/**
	 * 获取：儿童姓名
	 */
	public String getErtongxingming() {
		return ertongxingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：出生日期
	 */
	public void setChushengriqi(Date chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	/**
	 * 获取：出生日期
	 */
	public Date getChushengriqi() {
		return chushengriqi;
	}
	/**
	 * 设置：居住地址
	 */
	public void setJuzhudizhi(String juzhudizhi) {
		this.juzhudizhi = juzhudizhi;
	}
	/**
	 * 获取：居住地址
	 */
	public String getJuzhudizhi() {
		return juzhudizhi;
	}
	/**
	 * 设置：关系
	 */
	public void setGuanxi(String guanxi) {
		this.guanxi = guanxi;
	}
	/**
	 * 获取：关系
	 */
	public String getGuanxi() {
		return guanxi;
	}
	/**
	 * 设置：儿童月龄
	 */
	public void setErtongyueling(String ertongyueling) {
		this.ertongyueling = ertongyueling;
	}
	/**
	 * 获取：儿童月龄
	 */
	public String getErtongyueling() {
		return ertongyueling;
	}
	/**
	 * 设置：儿童年龄
	 */
	public void setErtongnianling(String ertongnianling) {
		this.ertongnianling = ertongnianling;
	}
	/**
	 * 获取：儿童年龄
	 */
	public String getErtongnianling() {
		return ertongnianling;
	}
	/**
	 * 设置：家长账号
	 */
	public void setJiazhangzhanghao(String jiazhangzhanghao) {
		this.jiazhangzhanghao = jiazhangzhanghao;
	}
	/**
	 * 获取：家长账号
	 */
	public String getJiazhangzhanghao() {
		return jiazhangzhanghao;
	}
	/**
	 * 设置：家长姓名
	 */
	public void setJiazhangxingming(String jiazhangxingming) {
		this.jiazhangxingming = jiazhangxingming;
	}
	/**
	 * 获取：家长姓名
	 */
	public String getJiazhangxingming() {
		return jiazhangxingming;
	}

}
