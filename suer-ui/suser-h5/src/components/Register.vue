<template>
    <div>
        <van-row class="user-links">
            <van-cell-group>
                <van-field
                        v-model="username"
                        required
                        clearable
                        label="用户名"
                        right-icon="question-o"
                        placeholder="请输入用户名"
                />

                <van-field
                        v-model="password"
                        type="password"
                        label="密码"
                        placeholder="请输入密码"
                        required
                />
            </van-cell-group>
        </van-row>
        <van-row>
            <van-cell-group>
                <van-button type="primary" @click="register">注册</van-button>
            </van-cell-group>
        </van-row>
    </div>
</template>

<script>
    export default {
        name: "register",
        data(){
            return{
                username:'',
                password:''
            }
        },
        methods:{
            register(){
                let parms={
                    accountName:this.username,
                    accountPwd:this.password
                }
                this.$axios.post('http://127.0.0.1:8080/account/addAccount',parms).then((response)=>{
                    console.log(response);
                }).catch((response)=>{
                    console.log(response);
                })

            }
        }
    }
</script>

<style scoped>

</style>