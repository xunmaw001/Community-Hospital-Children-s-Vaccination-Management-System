package com.entity.vo;

import com.entity.YimiaoyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 疫苗预约
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-25 18:34:14
 */
public class YimiaoyuyueVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 疫苗名称
	 */
	
	private String yimiaomingcheng;
		
	/**
	 * 疫苗类型
	 */
	
	private String yimiaoleixing;
		
	/**
	 * 疫苗分类
	 */
	
	private String yimiaofenlei;
		
	/**
	 * 适用年龄
	 */
	
	private String shiyongnianling;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 生产厂家
	 */
	
	private String shengchanchangjia;
		
	/**
	 * 接种剂次
	 */
	
	private String jiezhongjici;
		
	/**
	 * 产品规格
	 */
	
	private String chanpinguige;
		
	/**
	 * 疫苗总价
	 */
	
	private Integer yimiaozongjia;
		
	/**
	 * 注意事项
	 */
	
	private String zhuyishixiang;
		
	/**
	 * 接种地址
	 */
	
	private String jiezhongdizhi;
		
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
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：疫苗类型
	 */
	 
	public void setYimiaoleixing(String yimiaoleixing) {
		this.yimiaoleixing = yimiaoleixing;
	}
	
	/**
	 * 获取：疫苗类型
	 */
	public String getYimiaoleixing() {
		return yimiaoleixing;
	}
				
	
	/**
	 * 设置：疫苗分类
	 */
	 
	public void setYimiaofenlei(String yimiaofenlei) {
		this.yimiaofenlei = yimiaofenlei;
	}
	
	/**
	 * 获取：疫苗分类
	 */
	public String getYimiaofenlei() {
		return yimiaofenlei;
	}
				
	
	/**
	 * 设置：适用年龄
	 */
	 
	public void setShiyongnianling(String shiyongnianling) {
		this.shiyongnianling = shiyongnianling;
	}
	
	/**
	 * 获取：适用年龄
	 */
	public String getShiyongnianling() {
		return shiyongnianling;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：生产厂家
	 */
	 
	public void setShengchanchangjia(String shengchanchangjia) {
		this.shengchanchangjia = shengchanchangjia;
	}
	
	/**
	 * 获取：生产厂家
	 */
	public String getShengchanchangjia() {
		return shengchanchangjia;
	}
				
	
	/**
	 * 设置：接种剂次
	 */
	 
	public void setJiezhongjici(String jiezhongjici) {
		this.jiezhongjici = jiezhongjici;
	}
	
	/**
	 * 获取：接种剂次
	 */
	public String getJiezhongjici() {
		return jiezhongjici;
	}
				
	
	/**
	 * 设置：产品规格
	 */
	 
	public void setChanpinguige(String chanpinguige) {
		this.chanpinguige = chanpinguige;
	}
	
	/**
	 * 获取：产品规格
	 */
	public String getChanpinguige() {
		return chanpinguige;
	}
				
	
	/**
	 * 设置：疫苗总价
	 */
	 
	public void setYimiaozongjia(Integer yimiaozongjia) {
		this.yimiaozongjia = yimiaozongjia;
	}
	
	/**
	 * 获取：疫苗总价
	 */
	public Integer getYimiaozongjia() {
		return yimiaozongjia;
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
	 * 设置：接种地址
	 */
	 
	public void setJiezhongdizhi(String jiezhongdizhi) {
		this.jiezhongdizhi = jiezhongdizhi;
	}
	
	/**
	 * 获取：接种地址
	 */
	public String getJiezhongdizhi() {
		return jiezhongdizhi;
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
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
