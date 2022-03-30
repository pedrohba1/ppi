<template>
  <div class="test">
    <nav class="main_nav">
      <div class="inner_content">
        <div class="left dflex">
          <router-link to="./"><h2>CLX</h2></router-link>
        </div>

        <div class="item">
          <p>Olá,</p>
          <h5>entre com seu email</h5>
        </div>

        <div class="searchBox dFlex">
          <div class="box">
            <div class="dflex">
              <input
                type="text"
                placeholder="Busque algum produto:"
                name=""
                value=""
              />
              <button type="button" class="search" name="submit">
                Pesquisar
              </button>
            </div>
          </div>
        </div>

        <div class="right dFlex">
          <router-link to="/addproduto">ADICIONAR PRODUTOS</router-link>
        </div>
      </div>
    </nav>
  </div>

  <div class="main-addProduct">
    <div class="header-add">
      <span>Anunciar produto</span>
    </div>

    <form action="" method="" class="input-content">
      <div class="select select_quantity">
        <p>Qual o nome do produto?</p>
        <input
          type="text"
          id="txtProductName"
          name="productName"
          v-model="productName"
          placeholder="Nome"
        />
      </div>

      <div class="select select_quantity">
        <p>Qual o tipo do produto?</p>
        <input
          type="text"
          id="txtProductType"
          v-model="productType"
          name="productType"
          placeholder="Tipo do produto"
        />
      </div>

      <div class="select select_quantity">
        <p>Imagem produto</p>
        <input
          type="text"
          id="txtProductImage"
          v-model="productImage"
          name="productImage"
          placeholder="URL da imagem do produto"
        />
      </div>

      <div class="select select_quantity">
        <p>Qual o preço do produto?</p>
        <input type="text" class="price_product" placeholder="" />
      </div>

      <div class="select select_quantity">
        <p>Insira uma descrição para o produto</p>
        <input
          type="text"
          id="txtProductDesc"
          name="productDesc"
          v-model="productDesc"
          placeholder="Descrição"
        />
      </div>
      <div class="select select_quantity error_div">
        <span class="error_span"></span>
      </div>

      <button type="button" class="addBtn" onclick="validate()" name="button">
        Anunciar
      </button>
    </form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      productName: "",
      productType: "",
      productDesc: "",
      productImage: "",
    };
  },
};
</script>

<style>
.test {
  width: 100%;
  position: fixed;
  z-index: 9999;
}

a {
  text-decoration: none;
  color: white;
}

nav {
  width: 100%;
  background-color: black;
}

.inner_content {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 4px 15px 4px 10px;
}

.dFlex {
  display: flex;
  align-items: center;
}

.item {
  padding: 10px 10px;
}

.item:hover {
  border: 1px solid #fff;
  border-radius: 2px;
  margin: -1;
  cursor: pointer;
}

.main_nav {
  height: 70px;
}

p {
  font-size: 12px;
}

nav input {
  width: 760px;
  padding: 10px;
  font-size: 17px;
  border: none;
  outline: none;
  color: #000;
}

nav button {
  padding: 10px 10px;
  color: #000;
  font-size: 17px;
  border: none;
  border-radius: 5px 0 0 5px;
  cursor: pointer;
}

nav .all {
  background: #ddd;
  border-radius: 5px 0 0 5px;
}

nav .search {
  padding: 10px 17px;
  margin: -2px;
  background: rgba(247, 155, 80, 1);
  border-radius: 0 5px 5px 0;
}

.right a {
  cursor: pointer;
  color: white;
  text-decoration: none;
}

.right:hover {
  text-decoration: underline;
}

* {
  margin: 0;
  box-sizing: border-box;
  font-family: "Open Sans", sans-serif;
}

html,
body {
  height: 100%;
  width: 100%;
  background: #e7e7ec;
}

.main-addProduct {
  position: fixed;
  width: 720px;
  height: 80vh;
  border-radius: 20px;
  left: 50%;
  top: 50%;
  background-color: white;
  transform: translate(-50%, -50%);
}

.header-add {
  width: 100%;
  text-align: left;
  background-color: #ddd;
  border-radius: 20px 20px 0 0;
  padding: 25px;
}

.header-add span {
  font-size: 25px;
  font-weight: bold;
  color: black;
}

.input-content {
  padding: 25px;
  color: black;
}
.input-content p {
  color: black;
  font-size: 16px;
}

input {
  background: #ddd;
  color: black;
}

input::placeholder {
  color: gray;
}

.select {
  margin-top: 40px;
  width: 100%;
  height: 40px;
}

.select select {
  width: 100%;
  -webkit-appearance: menulist-button;
  height: 40px;
  background-color: white;
  border-radius: 4px;
  font-size: 20px;
  background: #ddd;
  color: black;
}

.select select option {
  background-color: white;
  color: black;
}

.select_quantity input {
  height: 100%;
  background-color: gray;
  border-radius: 4px;
  width: 100%;
  border-width: thin;
  padding: 0;
  font-size: 20px;
}

.addBtn {
  position: absolute;
  width: 90%;
  height: 40px;
  background-color: #3498db;
  border-radius: 4px;
  font-size: 20px;
  margin-top: 150px;
  border: none;
  border-radius: 10px;
  color: white;
  cursor: pointer;
  text-align: center;
  left: 50%;
  top: 70%;
  transform: translate(-50%, -50%);
  transition: all ease-out 500ms;
}

.addBtn:hover {
  background-color: #2ecc71;
  font-weight: bold;
}

.error_div {
  width: 100%;
  height: 20px;
  float: left;
  visibility: hidden;
}

.error_span {
  font-size: 14px;
  color: red;
  width: 100%;
}
</style>
