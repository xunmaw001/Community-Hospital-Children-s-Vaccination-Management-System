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
 * 疫苗出库
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
@TableName("yimiaochuku")
public class YimiaochukuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YimiaochukuEntity() {
		
	}
	
	public YimiaochukuEntity(T t) {
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
	 * 产品规格
	 */
					
	private String chanpinguige;
	
	/**
	 * 生产厂家
	 */
					
	private String shengchanchangjia;
	
	/**
	 * 接种剂次
	 */
					
	private String jiezhongjici;
	
	/**
	 * 疫苗总价
	 */
					
	private Integer yimiaozongjia;
	
	/**
	 * 疫苗介绍
	 */
					
	private String yimiaojieshao;
	
	/**
	 * 注意事项
	 */
					
	private String zhuyishixiang;
	
	/**
	 * 接种地址
	 */
					
	private String jiezhongdizhi;
	
	/**
	 * 护士账号
	 */
					
	private String hushizhanghao;
	
	/**
	 * 护士姓名
	 */
					
	private String hushixingming;
	
	/**
	 * 出库时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chukushijian;
	
	/**
	 * 出库备注
	 */
					
	private String chukubeizhu;
	
	
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
	 * 设置：疫苗介绍
	 */
	public void setYimiaojieshao(String yimiaojieshao) {
		this.yimiaojieshao = yimiaojieshao;
	}
	/**
	 * 获取：疫苗介绍
	 */
	public String getYimiaojieshao() {
		return yimiaojieshao;
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
	 * 设置：出库时间
	 */
	public void setChukushijian(Date chukushijian) {
		this.chukushijian = chukushijian;
	}
	/**
	 * 获取：出库时间
	 */
	public Date getChukushijian() {
		return chukushijian;
	}
	/**
	 * 设置：出库备注
	 */
	public void setChukubeizhu(String chukubeizhu) {
		this.chukubeizhu = chukubeizhu;
	}
	/**
	 * 获取：出库备注
	 */
	public String getChukubeizhu() {
		return chukubeizhu;
	}

}
