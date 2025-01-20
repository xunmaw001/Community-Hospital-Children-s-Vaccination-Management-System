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
 * 疫苗供应
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
@TableName("yimiaogongying")
public class YimiaogongyingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YimiaogongyingEntity() {
		
	}
	
	public YimiaogongyingEntity(T t) {
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
	 * 疫苗名称
	 */
					
	private String yimiaomingcheng;
	
	/**
	 * 供应厂家
	 */
					
	private String gongyingchangjia;
	
	/**
	 * 生产批号
	 */
					
	private String shengchanpihao;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 负责人
	 */
					
	private String fuzeren;
	
	/**
	 * 职务
	 */
					
	private String zhiwu;
	
	/**
	 * 厂家地址
	 */
					
	private String changjiadizhi;
	
	
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
	 * 设置：疫苗名称
	 */
	public void setYimiaomingcheng(String yimiaomingcheng) {
		this.yimiaomingcheng = yimiaomingcheng;
	}
	/**
	 * 获取：疫苗名称
	 */
	public String getYimiaomingcheng() {
		return yimiaomingcheng;
	}
	/**
	 * 设置：供应厂家
	 */
	public void setGongyingchangjia(String gongyingchangjia) {
		this.gongyingchangjia = gongyingchangjia;
	}
	/**
	 * 获取：供应厂家
	 */
	public String getGongyingchangjia() {
		return gongyingchangjia;
	}
	/**
	 * 设置：生产批号
	 */
	public void setShengchanpihao(String shengchanpihao) {
		this.shengchanpihao = shengchanpihao;
	}
	/**
	 * 获取：生产批号
	 */
	public String getShengchanpihao() {
		return shengchanpihao;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：负责人
	 */
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
	/**
	 * 设置：职务
	 */
	public void setZhiwu(String zhiwu) {
		this.zhiwu = zhiwu;
	}
	/**
	 * 获取：职务
	 */
	public String getZhiwu() {
		return zhiwu;
	}
	/**
	 * 设置：厂家地址
	 */
	public void setChangjiadizhi(String changjiadizhi) {
		this.changjiadizhi = changjiadizhi;
	}
	/**
	 * 获取：厂家地址
	 */
	public String getChangjiadizhi() {
		return changjiadizhi;
	}

}
