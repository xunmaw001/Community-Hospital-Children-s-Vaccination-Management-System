package com.entity.vo;

import com.entity.JiazhangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 家长
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-25 18:34:14
 */
public class JiazhangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 家长姓名
	 */
	
	private String jiazhangxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 居住地址
	 */
	
	private String juzhudizhi;
		
	/**
	 * 儿童姓名
	 */
	
	private String ertongxingming;
		
	/**
	 * 儿童月龄
	 */
	
	private String ertongyueling;
		
	/**
	 * 关系
	 */
	
	private String guanxi;
		
	/**
	 * 家长邮箱
	 */
	
	private String jiazhangyouxiang;
		
	/**
	 * 手机
	 */
	
	private String shouji;
				
	
	/**
	 * 设置：密码
	 */
	 
	public void setMima(String mima) {
		this.mima = mima;
	}
	
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	 * 设置：头像
	 */
	 
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
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
	 * 设置：家长邮箱
	 */
	 
	public void setJiazhangyouxiang(String jiazhangyouxiang) {
		this.jiazhangyouxiang = jiazhangyouxiang;
	}
	
	/**
	 * 获取：家长邮箱
	 */
	public String getJiazhangyouxiang() {
		return jiazhangyouxiang;
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
			
}
