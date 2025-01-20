package com.entity.vo;

import com.entity.TixingjiezhongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 提醒接种
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
public class TixingjiezhongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
