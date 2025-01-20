package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YimiaogongyingEntity;
import com.entity.view.YimiaogongyingView;

import com.service.YimiaogongyingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 疫苗供应
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-25 18:34:15
 */
@RestController
@RequestMapping("/yimiaogongying")
public class YimiaogongyingController {
    @Autowired
    private YimiaogongyingService yimiaogongyingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YimiaogongyingEntity yimiaogongying, 
		HttpServletRequest request){

        EntityWrapper<YimiaogongyingEntity> ew = new EntityWrapper<YimiaogongyingEntity>();
		PageUtils page = yimiaogongyingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yimiaogongying), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YimiaogongyingEntity yimiaogongying, 
		HttpServletRequest request){
        EntityWrapper<YimiaogongyingEntity> ew = new EntityWrapper<YimiaogongyingEntity>();
		PageUtils page = yimiaogongyingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yimiaogongying), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YimiaogongyingEntity yimiaogongying){
       	EntityWrapper<YimiaogongyingEntity> ew = new EntityWrapper<YimiaogongyingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yimiaogongying, "yimiaogongying")); 
        return R.ok().put("data", yimiaogongyingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YimiaogongyingEntity yimiaogongying){
        EntityWrapper< YimiaogongyingEntity> ew = new EntityWrapper< YimiaogongyingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yimiaogongying, "yimiaogongying")); 
		YimiaogongyingView yimiaogongyingView =  yimiaogongyingService.selectView(ew);
		return R.ok("查询疫苗供应成功").put("data", yimiaogongyingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YimiaogongyingEntity yimiaogongying = yimiaogongyingService.selectById(id);
        return R.ok().put("data", yimiaogongying);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YimiaogongyingEntity yimiaogongying = yimiaogongyingService.selectById(id);
        return R.ok().put("data", yimiaogongying);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YimiaogongyingEntity yimiaogongying, HttpServletRequest request){
    	yimiaogongying.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yimiaogongying);

        yimiaogongyingService.insert(yimiaogongying);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YimiaogongyingEntity yimiaogongying, HttpServletRequest request){
    	yimiaogongying.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yimiaogongying);

        yimiaogongyingService.insert(yimiaogongying);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YimiaogongyingEntity yimiaogongying, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yimiaogongying);
        yimiaogongyingService.updateById(yimiaogongying);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yimiaogongyingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YimiaogongyingEntity> wrapper = new EntityWrapper<YimiaogongyingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yimiaogongyingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
