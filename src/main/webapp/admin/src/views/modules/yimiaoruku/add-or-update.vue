<template>
  <div class="addEdit-block">
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="80px"
	  :style="{backgroundColor:addEditForm.addEditBoxColor}"
    >
      <el-row >
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="疫苗名称" prop="yimiaomingcheng">
          <el-input v-model="ruleForm.yimiaomingcheng" 
              placeholder="疫苗名称" clearable  :readonly="ro.yimiaomingcheng"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="疫苗名称" prop="yimiaomingcheng">
              <el-input v-model="ruleForm.yimiaomingcheng" 
                placeholder="疫苗名称" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="疫苗类型" prop="yimiaoleixing">
          <el-input v-model="ruleForm.yimiaoleixing" 
              placeholder="疫苗类型" clearable  :readonly="ro.yimiaoleixing"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="疫苗类型" prop="yimiaoleixing">
              <el-input v-model="ruleForm.yimiaoleixing" 
                placeholder="疫苗类型" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="疫苗分类" prop="yimiaofenlei">
          <el-input v-model="ruleForm.yimiaofenlei" 
              placeholder="疫苗分类" clearable  :readonly="ro.yimiaofenlei"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="疫苗分类" prop="yimiaofenlei">
              <el-input v-model="ruleForm.yimiaofenlei" 
                placeholder="疫苗分类" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="适用年龄" prop="shiyongnianling">
          <el-input v-model="ruleForm.shiyongnianling" 
              placeholder="适用年龄" clearable  :readonly="ro.shiyongnianling"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="适用年龄" prop="shiyongnianling">
              <el-input v-model="ruleForm.shiyongnianling" 
                placeholder="适用年龄" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="数量" prop="shuliang">
          <el-input v-model="ruleForm.shuliang" 
              placeholder="数量" clearable  :readonly="ro.shuliang"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="数量" prop="shuliang">
              <el-input v-model="ruleForm.shuliang" 
                placeholder="数量" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="产品规格" prop="chanpinguige">
          <el-input v-model="ruleForm.chanpinguige" 
              placeholder="产品规格" clearable  :readonly="ro.chanpinguige"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="产品规格" prop="chanpinguige">
              <el-input v-model="ruleForm.chanpinguige" 
                placeholder="产品规格" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="生产厂家" prop="shengchanchangjia">
          <el-input v-model="ruleForm.shengchanchangjia" 
              placeholder="生产厂家" clearable  :readonly="ro.shengchanchangjia"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="生产厂家" prop="shengchanchangjia">
              <el-input v-model="ruleForm.shengchanchangjia" 
                placeholder="生产厂家" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="接种剂次" prop="jiezhongjici">
          <el-input v-model="ruleForm.jiezhongjici" 
              placeholder="接种剂次" clearable  :readonly="ro.jiezhongjici"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="接种剂次" prop="jiezhongjici">
              <el-input v-model="ruleForm.jiezhongjici" 
                placeholder="接种剂次" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="疫苗总价" prop="yimiaozongjia">
          <el-input v-model="ruleForm.yimiaozongjia" 
              placeholder="疫苗总价" clearable  :readonly="ro.yimiaozongjia"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="疫苗总价" prop="yimiaozongjia">
              <el-input v-model="ruleForm.yimiaozongjia" 
                placeholder="疫苗总价" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="注意事项" prop="zhuyishixiang">
          <el-input v-model="ruleForm.zhuyishixiang" 
              placeholder="注意事项" clearable  :readonly="ro.zhuyishixiang"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="注意事项" prop="zhuyishixiang">
              <el-input v-model="ruleForm.zhuyishixiang" 
                placeholder="注意事项" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="接种地址" prop="jiezhongdizhi">
          <el-input v-model="ruleForm.jiezhongdizhi" 
              placeholder="接种地址" clearable  :readonly="ro.jiezhongdizhi"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="接种地址" prop="jiezhongdizhi">
              <el-input v-model="ruleForm.jiezhongdizhi" 
                placeholder="接种地址" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="护士账号" prop="hushizhanghao">
          <el-input v-model="ruleForm.hushizhanghao" 
              placeholder="护士账号" clearable  :readonly="ro.hushizhanghao"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="护士账号" prop="hushizhanghao">
              <el-input v-model="ruleForm.hushizhanghao" 
                placeholder="护士账号" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="护士姓名" prop="hushixingming">
          <el-input v-model="ruleForm.hushixingming" 
              placeholder="护士姓名" clearable  :readonly="ro.hushixingming"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="护士姓名" prop="hushixingming">
              <el-input v-model="ruleForm.hushixingming" 
                placeholder="护士姓名" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="date" v-if="type!='info'" label="入库时间" prop="rukushijian">
            <el-date-picker
                value-format="yyyy-MM-dd HH:mm:ss"
                v-model="ruleForm.rukushijian" 
                type="datetime"
                :readonly="ro.rukushijian"
                placeholder="入库时间">
            </el-date-picker>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" v-if="ruleForm.rukushijian" label="入库时间" prop="rukushijian">
              <el-input v-model="ruleForm.rukushijian" 
                placeholder="入库时间" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      <el-col :span="12">
        <el-form-item class="input" v-if="type!='info'"  label="入库备注" prop="rukubeizhu">
          <el-input v-model="ruleForm.rukubeizhu" 
              placeholder="入库备注" clearable  :readonly="ro.rukubeizhu"></el-input>
        </el-form-item>
        <div v-else>
          <el-form-item class="input" label="入库备注" prop="rukubeizhu">
              <el-input v-model="ruleForm.rukubeizhu" 
                placeholder="入库备注" readonly></el-input>
          </el-form-item>
        </div>
      </el-col>
      </el-row>
          <el-row>
            <el-col :span="24">
              <el-form-item v-if="type!='info'"  label="疫苗介绍" prop="yimiaojieshao">
                <editor 
                    style="min-width: 200px; max-width: 600px;"
                    v-model="ruleForm.yimiaojieshao" 
                    class="editor" 
                    action="file/upload">
                </editor>
              </el-form-item>
              <div v-else>
                <el-form-item v-if="ruleForm.yimiaojieshao" label="疫苗介绍" prop="yimiaojieshao">
                    <span v-html="ruleForm.yimiaojieshao"></span>
                </el-form-item>
              </div>
            </el-col>
          </el-row>
      <el-form-item class="btn">
        <el-button  v-if="type!='info'" type="primary" class="btn-success" @click="onSubmit">提交</el-button>
        <el-button v-if="type!='info'" class="btn-close" @click="back()">取消</el-button>
        <el-button v-if="type=='info'" class="btn-close" @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
  data() {
    let self = this
    var validateIdCard = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!checkIdCard(value)) {
        callback(new Error("请输入正确的身份证号码"));
      } else {
        callback();
      }
    };
    var validateUrl = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isURL(value)) {
        callback(new Error("请输入正确的URL地址"));
      } else {
        callback();
      }
    };
    var validateMobile = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isMobile(value)) {
        callback(new Error("请输入正确的手机号码"));
      } else {
        callback();
      }
    };
    var validatePhone = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isPhone(value)) {
        callback(new Error("请输入正确的电话号码"));
      } else {
        callback();
      }
    };
    var validateEmail = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isEmail(value)) {
        callback(new Error("请输入正确的邮箱地址"));
      } else {
        callback();
      }
    };
    var validateNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isNumber(value)) {
        callback(new Error("请输入数字"));
      } else {
        callback();
      }
    };
    var validateIntNumber = (rule, value, callback) => {
      if(!value){
        callback();
      } else if (!isIntNumer(value)) {
        callback(new Error("请输入整数"));
      } else {
        callback();
      }
    };
    return {
	  addEditForm: {"btnSaveFontColor":"#fff","selectFontSize":"14px","btnCancelBorderColor":"rgba(8, 8, 8, 1)","inputBorderRadius":"4px","inputFontSize":"14px","textareaBgColor":"#fff","btnSaveFontSize":"14px","textareaBorderRadius":"4px","uploadBgColor":"#fff","textareaBorderStyle":"solid","btnCancelWidth":"88px","textareaHeight":"120px","dateBgColor":"#fff","btnSaveBorderRadius":"40px","uploadLableFontSize":"14px","textareaBorderWidth":"1px","inputLableColor":"#606266","addEditBoxColor":"#fff","dateIconFontSize":"14px","btnSaveBgColor":"rgba(173, 215, 230, 1)","uploadIconFontColor":"#8c939d","textareaBorderColor":"rgba(0, 0, 0, 1)","btnCancelBgColor":"rgba(197, 197, 197, 1)","selectLableColor":"#606266","btnSaveBorderStyle":"solid","dateBorderWidth":"1px","dateLableFontSize":"14px","dateBorderRadius":"4px","btnCancelBorderStyle":"solid","selectLableFontSize":"14px","selectBorderStyle":"solid","selectIconFontColor":"rgba(0, 0, 0, 1)","btnCancelHeight":"44px","inputHeight":"40px","btnCancelFontColor":"rgba(246, 246, 246, 1)","dateBorderColor":"rgba(0, 0, 0, 1)","dateIconFontColor":"rgba(0, 0, 0, 1)","uploadBorderStyle":"solid","dateBorderStyle":"solid","dateLableColor":"#606266","dateFontSize":"14px","inputBorderWidth":"1px","uploadIconFontSize":"28px","selectHeight":"40px","inputFontColor":"#606266","uploadHeight":"148px","textareaLableColor":"#606266","textareaLableFontSize":"14px","btnCancelFontSize":"14px","inputBorderStyle":"solid","btnCancelBorderRadius":"40px","inputBgColor":"#fff","inputLableFontSize":"14px","uploadLableColor":"#606266","uploadBorderRadius":"4px","btnSaveHeight":"44px","selectBgColor":"#fff","btnSaveWidth":"88px","selectIconFontSize":"14px","dateHeight":"40px","selectBorderColor":"rgba(0, 0, 0, 1)","inputBorderColor":"rgba(0, 0, 0, 1)","uploadBorderColor":"rgba(0, 0, 0, 1)","textareaFontColor":"#606266","selectBorderWidth":"1px","dateFontColor":"#606266","btnCancelBorderWidth":"1px 1px 5px 1px","uploadBorderWidth":"1px","textareaFontSize":"14px","selectBorderRadius":"4px","selectFontColor":"#606266","btnSaveBorderColor":"rgba(0, 0, 0, 1)","btnSaveBorderWidth":"1px 1px 5px 1px"},
      id: '',
      type: '',
      ro:{
	yimiaomingcheng : false,
	yimiaoleixing : false,
	yimiaofenlei : false,
	shiyongnianling : false,
	shuliang : false,
	chanpinguige : false,
	shengchanchangjia : false,
	jiezhongjici : false,
	yimiaozongjia : false,
	yimiaojieshao : false,
	zhuyishixiang : false,
	jiezhongdizhi : false,
	hushizhanghao : false,
	hushixingming : false,
	rukushijian : false,
	rukubeizhu : false,
      },
      ruleForm: {
        yimiaomingcheng: '',
        yimiaoleixing: '',
        yimiaofenlei: '',
        shiyongnianling: '',
        shuliang: '',
        chanpinguige: '',
        shengchanchangjia: '',
        jiezhongjici: '',
        yimiaozongjia: '',
        yimiaojieshao: '',
        zhuyishixiang: '',
        jiezhongdizhi: '',
        hushizhanghao: '',
        hushixingming: '',
        rukushijian: '',
        rukubeizhu: '',
      },
      rules: {
          yimiaomingcheng: [
                { required: true, message: '疫苗名称不能为空', trigger: 'blur' },
          ],
          yimiaoleixing: [
                { required: true, message: '疫苗类型不能为空', trigger: 'blur' },
          ],
          yimiaofenlei: [
                { required: true, message: '疫苗分类不能为空', trigger: 'blur' },
          ],
          shiyongnianling: [
          ],
          shuliang: [
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          chanpinguige: [
          ],
          shengchanchangjia: [
          ],
          jiezhongjici: [
          ],
          yimiaozongjia: [
                { required: true, message: '疫苗总价不能为空', trigger: 'blur' },
                { validator: validateIntNumber, trigger: 'blur' },
          ],
          yimiaojieshao: [
          ],
          zhuyishixiang: [
          ],
          jiezhongdizhi: [
          ],
          hushizhanghao: [
          ],
          hushixingming: [
          ],
          rukushijian: [
          ],
          rukubeizhu: [
          ],
      }
    };
  },
  props: ["parent"],
  computed: {



  },
  created() {
	this.ruleForm.rukushijian = this.getCurDateTime()

	this.addEditStyleChange()
	this.addEditUploadStyleChange()
  },
  methods: {
    // 下载
    download(file){
      window.open(`${file}`)
    },
    // 初始化
    init(id,type) {
      if (id) {
        this.id = id;
        this.type = type;
      }
      if(this.type=='info'||this.type=='else'){
        this.info(id);
      }else if(this.type=='logistics'){
        this.logistics=false;
        this.info(id);
      }else if(this.type=='cross'){
        var obj = this.$storage.getObj('crossObj');
        for (var o in obj){
          if(o=='yimiaomingcheng'){
            this.ruleForm.yimiaomingcheng = obj[o];
	    this.ro.yimiaomingcheng = true;
            continue;
          }
          if(o=='yimiaoleixing'){
            this.ruleForm.yimiaoleixing = obj[o];
	    this.ro.yimiaoleixing = true;
            continue;
          }
          if(o=='yimiaofenlei'){
            this.ruleForm.yimiaofenlei = obj[o];
	    this.ro.yimiaofenlei = true;
            continue;
          }
          if(o=='shiyongnianling'){
            this.ruleForm.shiyongnianling = obj[o];
	    this.ro.shiyongnianling = true;
            continue;
          }
          if(o=='shuliang'){
            this.ruleForm.shuliang = obj[o];
	    this.ro.shuliang = true;
            continue;
          }
          if(o=='chanpinguige'){
            this.ruleForm.chanpinguige = obj[o];
	    this.ro.chanpinguige = true;
            continue;
          }
          if(o=='shengchanchangjia'){
            this.ruleForm.shengchanchangjia = obj[o];
	    this.ro.shengchanchangjia = true;
            continue;
          }
          if(o=='jiezhongjici'){
            this.ruleForm.jiezhongjici = obj[o];
	    this.ro.jiezhongjici = true;
            continue;
          }
          if(o=='yimiaozongjia'){
            this.ruleForm.yimiaozongjia = obj[o];
	    this.ro.yimiaozongjia = true;
            continue;
          }
          if(o=='yimiaojieshao'){
            this.ruleForm.yimiaojieshao = obj[o];
	    this.ro.yimiaojieshao = true;
            continue;
          }
          if(o=='zhuyishixiang'){
            this.ruleForm.zhuyishixiang = obj[o];
	    this.ro.zhuyishixiang = true;
            continue;
          }
          if(o=='jiezhongdizhi'){
            this.ruleForm.jiezhongdizhi = obj[o];
	    this.ro.jiezhongdizhi = true;
            continue;
          }
          if(o=='hushizhanghao'){
            this.ruleForm.hushizhanghao = obj[o];
	    this.ro.hushizhanghao = true;
            continue;
          }
          if(o=='hushixingming'){
            this.ruleForm.hushixingming = obj[o];
	    this.ro.hushixingming = true;
            continue;
          }
          if(o=='rukushijian'){
            this.ruleForm.rukushijian = obj[o];
	    this.ro.rukushijian = true;
            continue;
          }
          if(o=='rukubeizhu'){
            this.ruleForm.rukubeizhu = obj[o];
	    this.ro.rukubeizhu = true;
            continue;
          }
        }
        this.ruleForm.shuliang = 0
	    this.ro.shuliang = false;
      }
      // 获取用户信息
      this.$http({
        url: `${this.$storage.get('sessionTable')}/session`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          var json = data.data;
		if(json.hushizhanghao!=''&&json.hushizhanghao){
                this.ruleForm.hushizhanghao = json.hushizhanghao
	    		this.ro.hushizhanghao = true;
		}
		if(json.hushixingming!=''&&json.hushixingming){
                this.ruleForm.hushixingming = json.hushixingming
	    		this.ro.hushixingming = true;
		}
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 多级联动参数
    info(id) {
      this.$http({
        url: `yimiaoruku/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
	//解决前台上传图片后台不显示的问题
	let reg=new RegExp('../../../upload','g')//g代表全部
	this.ruleForm.yimiaojieshao = this.ruleForm.yimiaojieshao.replace(reg,'../../../ssm84ui9/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {

































var objcross = this.$storage.getObj('crossObj');
      var table = this.$storage.getObj('crossTable');
      if(objcross!=null) {
	      objcross.shuliang = parseFloat(objcross.shuliang) + parseFloat(this.ruleForm.shuliang)
                }

      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(!statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                              this.$http({
                                  url: `${table}/update`,
                                  method: "post",
                                  data: objcross
                                }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
       this.$refs["ruleForm"].validate(valid => {
         if (valid) {
		 if(crossrefid && crossuserid) {
			 this.ruleForm.crossuserid = crossuserid;
			 this.ruleForm.crossrefid = crossrefid;
			let params = { 
				page: 1, 
				limit: 10, 
				crossuserid:this.ruleForm.crossuserid,
				crossrefid:this.ruleForm.crossrefid,
			} 
			this.$http({ 
				url: "yimiaoruku/page", 
				method: "get", 
				params: params 
			}).then(({ 
				data 
			}) => { 
				if (data && data.code === 0) { 
				       if(data.data.total>=crossoptnum) {
					     this.$message.error(this.$storage.get('tips'));
					       return false;
				       } else {
					 this.$http({
					   url: `yimiaoruku/${!this.ruleForm.id ? "save" : "update"}`,
					   method: "post",
					   data: this.ruleForm
					 }).then(({ data }) => {
					   if (data && data.code === 0) {
					     this.$message({
					       message: "操作成功",
					       type: "success",
					       duration: 1500,
					       onClose: () => {
						 this.parent.showFlag = true;
						 this.parent.addOrUpdateFlag = false;
						 this.parent.yimiaorukuCrossAddOrUpdateFlag = false;
						 this.parent.search();
						 this.parent.contentStyleChange();
					       }
					     });
                      this.$http({
                          url: `${table}/update`,
                          method: "post",
                          data: objcross
                        }).then(({ data }) => {});
					   } else {
					     this.$message.error(data.msg);
					   }
					 });

				       }
				} else { 
				} 
			});
		 } else {
			 this.$http({
			   url: `yimiaoruku/${!this.ruleForm.id ? "save" : "update"}`,
			   method: "post",
			   data: this.ruleForm
			 }).then(({ data }) => {
			   if (data && data.code === 0) {
                  this.$http({
                      url: `${table}/update`,
                      method: "post",
                      data: objcross
                    }).then(({ data }) => {});
			     this.$message({
			       message: "操作成功",
			       type: "success",
			       duration: 1500,
			       onClose: () => {
				 this.parent.showFlag = true;
				 this.parent.addOrUpdateFlag = false;
				 this.parent.yimiaorukuCrossAddOrUpdateFlag = false;
				 this.parent.search();
				 this.parent.contentStyleChange();
			       }
			     });
			   } else {
			     this.$message.error(data.msg);
			   }
			 });
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.yimiaorukuCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
	addEditStyleChange() {
	  this.$nextTick(()=>{
	    // input
	    document.querySelectorAll('.addEdit-block .input .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputFontColor
	      el.style.fontSize = this.addEditForm.inputFontSize
	      el.style.borderWidth = this.addEditForm.inputBorderWidth
	      el.style.borderStyle = this.addEditForm.inputBorderStyle
	      el.style.borderColor = this.addEditForm.inputBorderColor
	      el.style.borderRadius = this.addEditForm.inputBorderRadius
	      el.style.backgroundColor = this.addEditForm.inputBgColor
	    })
	    document.querySelectorAll('.addEdit-block .input .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.inputHeight
	      el.style.color = this.addEditForm.inputLableColor
	      el.style.fontSize = this.addEditForm.inputLableFontSize
	    })
	    // select
	    document.querySelectorAll('.addEdit-block .select .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectFontColor
	      el.style.fontSize = this.addEditForm.selectFontSize
	      el.style.borderWidth = this.addEditForm.selectBorderWidth
	      el.style.borderStyle = this.addEditForm.selectBorderStyle
	      el.style.borderColor = this.addEditForm.selectBorderColor
	      el.style.borderRadius = this.addEditForm.selectBorderRadius
	      el.style.backgroundColor = this.addEditForm.selectBgColor
	    })
	    document.querySelectorAll('.addEdit-block .select .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.selectHeight
	      el.style.color = this.addEditForm.selectLableColor
	      el.style.fontSize = this.addEditForm.selectLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .select .el-select__caret').forEach(el=>{
	      el.style.color = this.addEditForm.selectIconFontColor
	      el.style.fontSize = this.addEditForm.selectIconFontSize
	    })
	    // date
	    document.querySelectorAll('.addEdit-block .date .el-input__inner').forEach(el=>{
	      el.style.height = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateFontColor
	      el.style.fontSize = this.addEditForm.dateFontSize
	      el.style.borderWidth = this.addEditForm.dateBorderWidth
	      el.style.borderStyle = this.addEditForm.dateBorderStyle
	      el.style.borderColor = this.addEditForm.dateBorderColor
	      el.style.borderRadius = this.addEditForm.dateBorderRadius
	      el.style.backgroundColor = this.addEditForm.dateBgColor
	    })
	    document.querySelectorAll('.addEdit-block .date .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.dateHeight
	      el.style.color = this.addEditForm.dateLableColor
	      el.style.fontSize = this.addEditForm.dateLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .date .el-input__icon').forEach(el=>{
	      el.style.color = this.addEditForm.dateIconFontColor
	      el.style.fontSize = this.addEditForm.dateIconFontSize
	      el.style.lineHeight = this.addEditForm.dateHeight
	    })
	    // upload
	    let iconLineHeight = parseInt(this.addEditForm.uploadHeight) - parseInt(this.addEditForm.uploadBorderWidth) * 2 + 'px'
	    document.querySelectorAll('.addEdit-block .upload .el-upload--picture-card').forEach(el=>{
	      el.style.width = this.addEditForm.uploadHeight
	      el.style.height = this.addEditForm.uploadHeight
	      el.style.borderWidth = this.addEditForm.uploadBorderWidth
	      el.style.borderStyle = this.addEditForm.uploadBorderStyle
	      el.style.borderColor = this.addEditForm.uploadBorderColor
	      el.style.borderRadius = this.addEditForm.uploadBorderRadius
	      el.style.backgroundColor = this.addEditForm.uploadBgColor
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-form-item__label').forEach(el=>{
	      el.style.lineHeight = this.addEditForm.uploadHeight
	      el.style.color = this.addEditForm.uploadLableColor
	      el.style.fontSize = this.addEditForm.uploadLableFontSize
	    })
	    document.querySelectorAll('.addEdit-block .upload .el-icon-plus').forEach(el=>{
	      el.style.color = this.addEditForm.uploadIconFontColor
	      el.style.fontSize = this.addEditForm.uploadIconFontSize
	      el.style.lineHeight = iconLineHeight
	      el.style.display = 'block'
	    })
	    // 多文本输入框
	    document.querySelectorAll('.addEdit-block .textarea .el-textarea__inner').forEach(el=>{
	      el.style.height = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaFontColor
	      el.style.fontSize = this.addEditForm.textareaFontSize
	      el.style.borderWidth = this.addEditForm.textareaBorderWidth
	      el.style.borderStyle = this.addEditForm.textareaBorderStyle
	      el.style.borderColor = this.addEditForm.textareaBorderColor
	      el.style.borderRadius = this.addEditForm.textareaBorderRadius
	      el.style.backgroundColor = this.addEditForm.textareaBgColor
	    })
	    document.querySelectorAll('.addEdit-block .textarea .el-form-item__label').forEach(el=>{
	      // el.style.lineHeight = this.addEditForm.textareaHeight
	      el.style.color = this.addEditForm.textareaLableColor
	      el.style.fontSize = this.addEditForm.textareaLableFontSize
	    })
	    // 保存
	    document.querySelectorAll('.addEdit-block .btn .btn-success').forEach(el=>{
	      el.style.width = this.addEditForm.btnSaveWidth
	      el.style.height = this.addEditForm.btnSaveHeight
	      el.style.color = this.addEditForm.btnSaveFontColor
	      el.style.fontSize = this.addEditForm.btnSaveFontSize
	      el.style.borderWidth = this.addEditForm.btnSaveBorderWidth
	      el.style.borderStyle = this.addEditForm.btnSaveBorderStyle
	      el.style.borderColor = this.addEditForm.btnSaveBorderColor
	      el.style.borderRadius = this.addEditForm.btnSaveBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnSaveBgColor
	    })
	    // 返回
	    document.querySelectorAll('.addEdit-block .btn .btn-close').forEach(el=>{
	      el.style.width = this.addEditForm.btnCancelWidth
	      el.style.height = this.addEditForm.btnCancelHeight
	      el.style.color = this.addEditForm.btnCancelFontColor
	      el.style.fontSize = this.addEditForm.btnCancelFontSize
	      el.style.borderWidth = this.addEditForm.btnCancelBorderWidth
	      el.style.borderStyle = this.addEditForm.btnCancelBorderStyle
	      el.style.borderColor = this.addEditForm.btnCancelBorderColor
	      el.style.borderRadius = this.addEditForm.btnCancelBorderRadius
	      el.style.backgroundColor = this.addEditForm.btnCancelBgColor
	    })
	  })
	},
	addEditUploadStyleChange() {
		this.$nextTick(()=>{
		  document.querySelectorAll('.addEdit-block .upload .el-upload-list--picture-card .el-upload-list__item').forEach(el=>{
			el.style.width = this.addEditForm.uploadHeight
			el.style.height = this.addEditForm.uploadHeight
			el.style.borderWidth = this.addEditForm.uploadBorderWidth
			el.style.borderStyle = this.addEditForm.uploadBorderStyle
			el.style.borderColor = this.addEditForm.uploadBorderColor
			el.style.borderRadius = this.addEditForm.uploadBorderRadius
			el.style.backgroundColor = this.addEditForm.uploadBgColor
		  })
	  })
	},
  }
};
</script>
<style lang="scss">
.editor{
  height: 500px;
  
  & /deep/ .ql-container {
	  height: 310px;
  }
}
.amap-wrapper {
  width: 100%;
  height: 500px;
}
.search-box {
  position: absolute;
}
.addEdit-block {
	margin: -10px;
}
.detail-form-content {
	padding: 12px;
	background-color: transparent;
}
.btn .el-button {
  padding: 0;
}
</style>
