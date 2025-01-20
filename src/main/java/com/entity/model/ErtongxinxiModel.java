package com.entity.model;

import com.entity.ErtongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 儿童信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
public class ErtongxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 出生日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
