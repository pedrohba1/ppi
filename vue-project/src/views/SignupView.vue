<template>
  <div class="all">
    <div class="container-login100 backgroun-img">
      <div class="wrap-login100">
        <form
          class="login100-form validate-form"
          name="formulario"
          id="formulario"
        >
          <span class="login100-form-title"> Cadastro </span>
          <div class="wrap-input100">
            <span class="label-input100">Usuário</span>
            <input
              class="input100 has-val"
              type="text"
              name="username"
              id="txtUsername"
              v-model="username"
              placeholder="Informe o usuário"
            />
            <span class="icons"><img src="../static/user.png" /></span>
          </div>
          <div class="wrap-input100">
            <span class="label-input100">Senha</span>
            <input
              class="input100"
              type="password"
              name="password"
              id="txtPassword"
              v-model="password"
              placeholder="Informe a senha"
            />
            <span class="icons"><img src="../static/padlock.png" /></span>
          </div>
          <div class="wrap-input100">
            <span class="label-input100">E-mail</span>
            <input
              class="input100 has-val"
              type="email"
              name="email"
              id="txtEmail"
              v-model="email"
              placeholder="Informe seu e-mail"
            />
            <span class="icons"><img src="../static/o-email.png" /></span>
          </div>

          <div class="wrap-input100">
            <span class="label-input100">Endereço de carteira</span>
            <input
              class="input100 has-val"
              name="wallet"
              id="txtWallet"
              v-model="walletAddress"
              placeholder="Endereço de carteira"
            />
          </div>

          <span class="erro_span" id="erro_span"></span>
          <div class="text-right">
            <a href="/login"> Já possui uma conta? Entre agora </a>
          </div>
          <div class="container-login100-form-btn">
            <div class="wrap-login100-form-btn">
              <button class="btn" type="button" @click="signup()">
                Cadastrar
              </button>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>
</template>

<script>
import { mapActions, mapGetters } from "vuex";

export default {
  data() {
    return {
      username: "",
      password: "",
      email: "",
      walletAddress: "",
    };
  },
  computed: {
    ...mapGetters("signup", {
      getSignUpStatus: "getSignUpStatus",
    }),
  },
  methods: {
    ...mapActions("signup", {
      actionSignUpApi: "signupApi",
    }),
    async signup() {
      const payload = {
        username: this.username,
        password: this.password,
        email: this.email,
        walletAddress: this.walletAddress,
      };

      await this.actionSignUpApi(payload);
      if (this.getSignUpStatus === "") return;
      if (this.getSignUpStatus === "failed") return;
      this.$router.push("/login");
    },
  },
  name: "LoginView",
};
</script>

<style>
/*Formatações gerais*/

* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;

  font-family: "Open Sans", sans-serif;
}

body {
  margin: 0;
  font-size: 1rem;
  font-weight: 400;
  line-height: 1.5;
  color: #212529;
  background-color: #fff;
}

.backgroun-img {
  background-image: url("../static/bg-01.jpg");
}

all {
  width: 100%;
  margin: 0 auto;
}

div {
  display: block;
}

input {
  outline: none;
  border: none;
}

a {
  font-size: 14px;
  line-height: 1.7;
  color: #666666;
  margin: 0px;
  transition: color ease-out 300ms;
}

a:hover {
  color: #d05fec;
}

/*Formatação do formulario*/

.container-login100 {
  width: 100%;
  min-height: 100vh;
  display: -webkit-box;
  display: -webkit-flex;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  align-items: center;
  padding: 15px;
  background-repeat: no-repeat;
  background-position: center;
  background-size: cover;
}
.wrap-login100 {
  width: 500px;
  background: #fff;
  border-radius: 10px;
  overflow: hidden;
  padding-top: 65px;
  padding-bottom: 54px;
  padding-left: 55px;
  padding-right: 55px;
}

.login100-form-title {
  display: block;
  font-size: 39px;
  color: #333333;
  line-height: 1.2;
  text-align: center;
  padding-bottom: 49px;
  font-weight: bold;
}

.wrap-input100 {
  width: 100%;
  position: relative;
  border-bottom: 2px solid #d9d9d9;
  margin-bottom: 23px;
}

.label-input100 {
  font-size: 14px;
  color: #333333;
  line-height: 1.5;
  padding-left: 7px;
}

.input100 {
  font-size: 16px;
  color: #333333;
  line-height: 1.2;
  display: block;
  width: 100%;
  height: 55px;
  background: transparent;
  padding: 0 7px 0 43px;
}

.icons {
  position: absolute;
  display: block;
  width: 100%;
  height: 50%;
  top: 50%;
  left: 1%;
  pointer-events: none;
}

.text-right {
  text-align: right !important;
  padding-top: 8px;
  padding-bottom: 31px;
}

/*Formatação do botao e das midias sociais*/

.container-login100-form-btn {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
}

.wrap-login100-form-btn {
  width: 100%;
  display: block;
  position: relative;
  z-index: 1;
  border-radius: 25px;
  overflow: hidden;
  margin: 0 auto;
}

.btn {
  width: 100%;
  font-size: 16px;
  font-weight: 600;
  color: #fff;
  cursor: pointer;
  height: 55px;
  text-align: center;
  border: none;
  background-size: 300% 100%;
  background-image: linear-gradient(
    to right,
    #00dbde,
    #fc00ff,
    #00dbde,
    #fc00ff
  );
  box-shadow: 0 4px 15px 0 rgba(49, 196, 190, 0.75);

  border-radius: 50px;
  -o-transition: all 0.4s ease-in-out;
  -webkit-transition: all 0.4s ease-in-out;
  transition: all 0.4s ease-in-out;
}

.btn:hover {
  background-position: 100% 0;
  -o-transition: all 0.4s ease-in-out;
  -webkit-transition: all 0.4s ease-in-out;
  transition: all 0.6s ease-in-out;
}

.btn:focus {
  outline: none;
}

.txt1 {
  font-size: 14px;
  line-height: 1.5;
  color: #666666;
  padding-bottom: 20px;
  padding-top: 54px;
}

.text-center {
  text-align: center !important;
}

.social-medias {
  display: -webkit-box;
  display: -webkit-flex;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  justify-content: center;
  -ms-align-items: center;
  align-items: center;
}

.login100-social-item {
  font-size: 25px;
  color: #fff;
  display: -webkit-box;
  display: -webkit-flex;
  display: -moz-box;
  display: -ms-flexbox;
  display: flex;
  justify-content: center;
  align-items: center;
  width: 50px;
  height: 50px;
  border-radius: 50%;
  margin: 5px;
}

.bg1 {
  background-color: #3b5998;
  transition: background-color ease-out 500ms;
}
.bg2 {
  background-color: #1da1f2;
  transition: background-color ease-out 500ms;
}
.bg3 {
  background-color: #ea4335;
  transition: background-color ease-out 500ms;
}

.bg1:hover,
.bg2:hover,
.bg3:hover {
  background-color: #333333;
}

.fa {
  display: inline-block;
  font: normal normal normal 14px/1 FontAwesome;
  font-size: inherit;
  text-rendering: auto;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}

.fa img {
  width: 24px;
}
.fa-twitter img {
  width: 30px;
}

.Cadastrar {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.txt2 {
  font-size: 14px;
  line-height: 1.5;
  color: #333333;
  text-transform: uppercase;
  padding-top: 54px;
}

.erro_span {
  font-size: 14px;
  color: red;
  visibility: hidden;
}
</style>
