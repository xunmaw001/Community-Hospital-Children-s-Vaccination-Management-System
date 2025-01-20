const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm84ui9/",
            name: "ssm84ui9",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm84ui9/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "社区医院儿童预防接种管理系统"
        } 
    }
}
export default base
