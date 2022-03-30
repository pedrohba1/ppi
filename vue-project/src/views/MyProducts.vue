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

        <router-link to="./meusprodutos">MEUS PRODUTOS</router-link>
      </div>
    </nav>
  </div>

  <div class="my_product_area">
    <section class="main_container" id="productListed">
      <h1 class="text_gray_400 header_main">Meus produtos</h1>

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

            <div class="cart-item-brand">{{}}</div>
          </div>

          <div class="total-cost fixed_with_vl">R$ {{}}</div>
        </div>
        <hr />
      </div>
    </section>
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
}

.my_product_area {
  position: absolute;
  background: white;
  width: 1074px;
  margin-top: 290px;
  left: 50%;
  border-radius: 20px;
  transform: translate(-50%, -50%);
  padding: 20px;
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
