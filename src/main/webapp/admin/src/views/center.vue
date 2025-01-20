<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
	  style="background: transparent;"
    >  
     <el-row>
      <el-col :span="12">
        <el-form-item   v-if="flag=='jiazhang'"  label="家长账号" prop="jiazhangzhanghao">
          <el-input v-model="ruleForm.jiazhangzhanghao" readonly              placeholder="家长账号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='jiazhang'"  label="家长姓名" prop="jiazhangxingming">
          <el-input v-model="ruleForm.jiazhangxingming"               placeholder="家长姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='jiazhang'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in jiazhangxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='jiazhang'" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="jiazhangtouxiangUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='jiazhang'" label="居住地址" prop="juzhudizhi">
          <el-select  @change="jiazhangjuzhudizhiChange"  v-model="ruleForm.juzhudizhi" placeholder="请选择居住地址">
            <el-option
                v-for="(item,index) in jiazhangjuzhudizhiOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='jiazhang'"  label="儿童姓名" prop="ertongxingming">
          <el-input v-model="ruleForm.ertongxingming"               placeholder="儿童姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='jiazhang'"  label="儿童月龄" prop="ertongyueling">
          <el-input v-model="ruleForm.ertongyueling"               placeholder="儿童月龄" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='jiazhang'"  label="关系" prop="guanxi">
          <el-select v-model="ruleForm.guanxi"  placeholder="请选择关系">
            <el-option
                v-for="(item,index) in jiazhangguanxiOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='jiazhang'"  label="家长邮箱" prop="jiazhangyouxiang">
          <el-input v-model="ruleForm.jiazhangyouxiang"               placeholder="家长邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='jiazhang'"  label="手机" prop="shouji">
          <el-input v-model="ruleForm.shouji"               placeholder="手机" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='hushi'"  label="护士工号" prop="hushigonghao">
          <el-input v-model="ruleForm.hushigonghao" readonly              placeholder="护士工号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='hushi'"  label="护士姓名" prop="hushixingming">
          <el-input v-model="ruleForm.hushixingming"               placeholder="护士姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='hushi'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in hushixingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='hushi'"  label="联系电话" prop="lianxidianhua">
          <el-input v-model="ruleForm.lianxidianhua"               placeholder="联系电话" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='hushi'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
      jiazhangxingbieOptions: [],
      jiazhangjuzhudizhiOptions: [],
      jiazhangguanxiOptions: [],
      hushixingbieOptions: [],
    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.jiazhangxingbieOptions = "男,女".split(',')
    this.$http({
      url: `option/ertongxinxi/juzhudizhi`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.jiazhangjuzhudizhiOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.jiazhangguanxiOptions = "母女,母子,父女,父子,其他".split(',')
    this.hushixingbieOptions = "男,女".split(',')
  },
  methods: {
    // 下二随
    jiazhangjuzhudizhiChange () {
      this.$http({
        url: `follow/ertongxinxi/juzhudizhi?columnValue=`+ this.ruleForm.juzhudizhi,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          console.log('下2随')
              if(data.data.ertongxingming){
                this.ruleForm.ertongxingming = data.data.ertongxingming
              }
              if(data.data.ertongyueling){
                this.ruleForm.ertongyueling = data.data.ertongyueling
              }
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    jiazhangtouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
    onUpdateHandler() {
      if((!this.ruleForm.jiazhangzhanghao)&& 'jiazhang'==this.flag){
        this.$message.error('家长账号不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'jiazhang'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
        if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
        }
      if( 'jiazhang' ==this.flag && this.ruleForm.jiazhangyouxiang&&(!isEmail(this.ruleForm.jiazhangyouxiang))){
        this.$message.error(`家长邮箱应输入邮箱格式`);
        return
      }
      if( 'jiazhang' ==this.flag && this.ruleForm.shouji&&(!isMobile(this.ruleForm.shouji))){
        this.$message.error(`手机应输入手机格式`);
        return
      }
      if((!this.ruleForm.hushigonghao)&& 'hushi'==this.flag){
        this.$message.error('护士工号不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'hushi'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
      if((!this.ruleForm.hushixingming)&& 'hushi'==this.flag){
        this.$message.error('护士姓名不能为空');
        return
      }
      if( 'hushi' ==this.flag && this.ruleForm.lianxidianhua&&(!isMobile(this.ruleForm.lianxidianhua))){
        this.$message.error(`联系电话应输入手机格式`);
        return
      }
      if( 'hushi' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
	this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
