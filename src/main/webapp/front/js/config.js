
var projectName = '社区医院儿童预防接种管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '疫苗信息',
	url: './pages/yimiaoxinxi/list.html'
}, 

{
	name: '医院简介',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssm84ui9/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"家长","menuJump":"列表","tableName":"jiazhang"}],"menu":"家长管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除"],"menu":"护士","menuJump":"列表","tableName":"hushi"}],"menu":"护士管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除"],"menu":"疫苗类型","menuJump":"列表","tableName":"yimiaoleixing"}],"menu":"疫苗类型管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["新增","查看","修改","删除","查看评论","预约","入库","报表","出库"],"menu":"疫苗信息","menuJump":"列表","tableName":"yimiaoxinxi"}],"menu":"疫苗信息管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","修改","删除","报表","接种"],"menu":"疫苗预约","menuJump":"列表","tableName":"yimiaoyuyue"}],"menu":"疫苗预约管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","修改","删除","报表","接种异常","提醒接种"],"menu":"接种信息","menuJump":"列表","tableName":"jiezhongxinxi"}],"menu":"接种信息管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","修改","删除","报表"],"menu":"疫苗入库","menuJump":"列表","tableName":"yimiaoruku"}],"menu":"疫苗入库管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","修改","删除","报表"],"menu":"疫苗出库","menuJump":"列表","tableName":"yimiaochuku"}],"menu":"疫苗出库管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","修改","删除"],"menu":"提醒接种","menuJump":"列表","tableName":"tixingjiezhong"}],"menu":"提醒接种管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","修改","删除","报表"],"menu":"接种异常","menuJump":"列表","tableName":"jiezhongyichang"}],"menu":"接种异常管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["新增","查看","修改","删除"],"menu":"疫苗供应","menuJump":"列表","tableName":"yimiaogongying"}],"menu":"疫苗供应管理"},{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"医院简介","tableName":"news"},{"appFrontIcon":"cuIcon-service","buttons":["新增","查看","修改","删除"],"menu":"在线咨询","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","查看评论","预约"],"menu":"疫苗信息列表","menuJump":"列表","tableName":"yimiaoxinxi"}],"menu":"疫苗信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","删除","支付"],"menu":"疫苗预约","menuJump":"列表","tableName":"yimiaoyuyue"}],"menu":"疫苗预约管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看"],"menu":"接种信息","menuJump":"列表","tableName":"jiezhongxinxi"}],"menu":"接种信息管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看"],"menu":"提醒接种","menuJump":"列表","tableName":"tixingjiezhong"}],"menu":"提醒接种管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除"],"menu":"儿童信息","menuJump":"列表","tableName":"ertongxinxi"}],"menu":"儿童信息管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看"],"menu":"接种异常","menuJump":"列表","tableName":"jiezhongyichang"}],"menu":"接种异常管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","查看评论","预约"],"menu":"疫苗信息列表","menuJump":"列表","tableName":"yimiaoxinxi"}],"menu":"疫苗信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"家长","tableName":"jiazhang"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看","入库","查看评论","出库"],"menu":"疫苗信息","menuJump":"列表","tableName":"yimiaoxinxi"}],"menu":"疫苗信息管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","接种"],"menu":"疫苗预约","menuJump":"列表","tableName":"yimiaoyuyue"}],"menu":"疫苗预约管理"},{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","删除","接种异常","提醒接种"],"menu":"接种信息","menuJump":"列表","tableName":"jiezhongxinxi"}],"menu":"接种信息管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","删除"],"menu":"疫苗入库","menuJump":"列表","tableName":"yimiaoruku"}],"menu":"疫苗入库管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","删除"],"menu":"疫苗出库","menuJump":"列表","tableName":"yimiaochuku"}],"menu":"疫苗出库管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","修改","删除"],"menu":"提醒接种","menuJump":"列表","tableName":"tixingjiezhong"}],"menu":"提醒接种管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","删除"],"menu":"接种异常","menuJump":"列表","tableName":"jiezhongyichang"}],"menu":"接种异常管理"},{"child":[{"appFrontIcon":"cuIcon-vipcard","buttons":["查看"],"menu":"疫苗供应","menuJump":"列表","tableName":"yimiaogongying"}],"menu":"疫苗供应管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","查看评论","预约"],"menu":"疫苗信息列表","menuJump":"列表","tableName":"yimiaoxinxi"}],"menu":"疫苗信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"护士","tableName":"hushi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
