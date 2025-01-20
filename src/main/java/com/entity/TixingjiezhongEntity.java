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
 * 提醒接种
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
@TableName("tixingjiezhong")
public class TixingjiezhongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TixingjiezhongEntity() {
		
	}
	
	public TixingjiezhongEntity(T t) {
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
	 * 接种次数
	 */
					
	private String jiezhongcishu;
	
	/**
	 * 注意事项
	 */
					
	private String zhuyishixiang;
	
	/**
	 * 家长账号
	 */
					
	private String jiazhangzhanghao;
	
	/**
	 * 家长姓名
	 */
					
	private String jiazhangxingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 儿童姓名
	 */
					
	private String ertongxingming;
	
	/**
	 * 关系
	 */
					
	private String guanxi;
	
	/**
	 * 接种时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jiezhongshijian;
	
	/**
	 * 护士账号
	 */
					
	private String hushizhanghao;
	
	/**
	 * 护士姓名
	 */
					
	private String hushixingming;
	
	/**
	 * 提醒时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date tixingshijian;
	
	
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
	 * 设置：接种次数
	 */
	public void setJiezhongcishu(String jiezhongcishu) {
		this.jiezhongcishu = jiezhongcishu;
	}
	/**
	 * 获取：接种次数
	 */
	public String getJiezhongcishu() {
		return jiezhongcishu;
	}
	/**
	 * 设置：注意事项
	 */
	public void setZhuyishixiang(String zhuyishixiang) {
		this.zhuyishixiang = zhuyishixiang;
	}
	/**
	 * 获取：注意事项
	 */
	public String getZhuyishixiang() {
		return zhuyishixiang;
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
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
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
	 * 设置：接种时间
	 */
	public void setJiezhongshijian(Date jiezhongshijian) {
		this.jiezhongshijian = jiezhongshijian;
	}
	/**
	 * 获取：接种时间
	 */
	public Date getJiezhongshijian() {
		return jiezhongshijian;
	}
	/**
	 * 设置：护士账号
	 */
	public void setHushizhanghao(String hushizhanghao) {
		this.hushizhanghao = hushizhanghao;
	}
	/**
	 * 获取：护士账号
	 */
	public String getHushizhanghao() {
		return hushizhanghao;
	}
	/**
	 * 设置：护士姓名
	 */
	public void setHushixingming(String hushixingming) {
		this.hushixingming = hushixingming;
	}
	/**
	 * 获取：护士姓名
	 */
	public String getHushixingming() {
		return hushixingming;
	}
	/**
	 * 设置：提醒时间
	 */
	public void setTixingshijian(Date tixingshijian) {
		this.tixingshijian = tixingshijian;
	}
	/**
	 * 获取：提醒时间
	 */
	public Date getTixingshijian() {
		return tixingshijian;
	}

}
