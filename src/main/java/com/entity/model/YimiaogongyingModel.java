package com.entity.model;

import com.entity.YimiaogongyingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 疫苗供应
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
public class YimiaogongyingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
