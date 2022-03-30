<template>
  <div class="test">
    <nav class="main_nav">
      <div class="inner_content">
        <div class="left dflex">
          <router-link to="./"><h2>CLX</h2></router-link>
        </div>

        <div class="item">
          <p>Ola,</p>
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

  <div class="main_70_left">
    <section class="main_container">
      <h1 class="text_gray_400 header_main">Meu carrinho({{}})</h1>

      <div class="table_titles flex text_gray_400">
        <h2 class="flex_grow">Produto</h2>
        <h2 class="fixed_with_vl">Valor do produto</h2>
      </div>

      <div>
        <div class="cart-items flex">
          <div class="cart-item-image image_size">
            <img
              src="https://multimedia.bbycastatic.ca/multimedia/products/250x250/157/15736/15736356.jpg"
              alt=""
            />
          </div>

          <div class="cart-item-details flex_grow">
            <div class="cart-item-title">{{}}</div>

            <div class="cart-item-brand">
              {{}}}
            </div>
          </div>

          <div class="total-cost fixed_with_vl">R${{}}</div>
        </div>

        <hr />
      </div>
    </section>
  </div>

  <div class="main_30_right">
    <div class="buy_cripto_block_menu">
      <div class="full">
        <span style="font-weight: bold">FINALIZAR PAGAMENTO</span>
        <hr />
        <div class="horizontal_info_content">
          <span class="horizontal_info_content_left">Total em real</span>
          <span class="horizontal_info_content_right">R$ {{}}</span>
        </div>
        <hr />

        <div class="payment" style="width: 100%; margin-top: 40px">
          <p>Selecione o metodo de pagamento:</p>
          <div class="radio-items">
            <div class="col-6">
              <input
                id="a1"
                class="only-sr checked"
                type="radio"
                onclick="actionChanged(this)"
                name="temp1"
                value="buy"
                checked
              />
              <label for="a1">Criptomoeda</label>
            </div>
          </div>
        </div>

        <button
          id="fns_shop_action"
          class="fns_shop"
          type="button"
          name="button"
        >
          Finalizar compra
        </button>
      </div>
    </div>
  </div>
</template>

<style>
.test {
  width: 100%;
  position: fixed;
  z-index: 9999;
  color: white;
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
  font-family: "Open Sans", sans-serif;
  color: #000;
}
span {
  color: black;
}
.green {
  color: #34c759;
}

.main_70_left {
  width: 70%;
  z-index: 1;
  float: left;
  overflow-x: hidden;
  padding-top: 20px;
}

.main_30_right {
  height: 100%;
  width: 30%;
  position: fixed;
  z-index: 1;
  top: 0;
  right: 0;
  overflow-x: hidden;
  padding-top: 20px;
}

.buy_cripto_block_menu {
  position: absolute;
  width: 90%;
  height: 40%;
  border-radius: 20px;
  left: 50%;
  top: 50%;
  background-color: white;
  transform: translate(-50%, -50%);
}

.full {
  position: absolute;
  width: 90%;
  left: 50%;
  top: 50%;
  transform: translate(-50%, -50%);
}

.horizontal_info_content {
  width: 100%;
  height: 26px;
  font-weight: bold;
}

.horizontal_info_content_left {
  float: left;
}

.horizontal_info_content_right {
  float: right;
}

/* temp grid */
.col-6 {
  width: 50%;
}

.only-sr {
  overflow: hidden !important;
  position: absolute !important;
  left: -9999px !important;
  width: 1px;
  height: 1px;
}

/* form | radio */
.radio-items {
  display: table;
  width: 100%;
  border: 1px solid #454a60;
  border-radius: 4px;
  box-sizing: border-box;
}
.radio-items > div {
  display: table-cell;
  height: 40px;
  line-height: 40px;
  border-left: 1px solid #454a60;
  text-align: center;
}
.radio-items > div:first-child {
  border-left: none;
  width: auto !important;
}
.radio-items label {
  display: block;
  width: 100%;
  height: 100%;
  color: #454a60;
  vertical-align: middle;
  box-sizing: border-box;
  cursor: pointer;
}
.radio-items input[type="radio"]:checked + label {
  background-color: black;
  color: #fff;
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
}

.select select option {
  background-color: white;
  color: black;
}

.payment p {
  font-size: 14px;
  font-weight: 600;
  color: #a9a9a9;
  margin-bottom: 3px;
}

.select_quantity {
  width: 100%;
  height: 40px;
}

.select_quantity input {
  height: 100%;
  background-color: white;
  border-radius: 4px;
  width: 100%;
  border-width: thin;
  padding: 0;
}

.bottom_content {
  margin-top: 60px;
}

.bottom_content_less {
  margin-top: 20px;
}

.fns_shop {
  margin-top: 40px;
  height: 40px;
  border-radius: 4px;
  background-color: green;
  width: 100%;
  color: white;
  border: none;
}

.main_container {
  width: 90%;
  padding: 5em;
}

.text_gray_400 {
  color: gray;
  font-weight: bold;
}

.table_titles {
  padding-bottom: 20px;
}

.table_titles h2 {
  font-size: 16px;
  color: black;
}

.flex {
  display: flex;
}

.flex_grow {
  flex-grow: 5;
}

.fixed_with_vl {
  width: 150px;
}

.image_size img {
  width: 80px;
  height: 80px;
  border-radius: 5px;
}

.cart-item-details {
  margin-left: 25px;
}

.cart-item-title {
  font-weight: bold;
  color: #95a5a6;
}

.cart-item-brand {
  color: #bdc3c7;
}

.total-cost {
  font-weight: bold;
  color: #95a5a6;
}
</style>
