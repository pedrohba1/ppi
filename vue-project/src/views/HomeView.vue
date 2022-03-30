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
          <router-link to="./meusprodutos">MEUS PRODUTOS</router-link>
        </div>
      </div>
    </nav>
    <nav class="subnavigation">
      <ul class="submenu">
        <a href="#" class="flex_grow"><li>Itens selecionados: 3</li></a>
        <a href="#"><li>categoria 1</li></a>
        <a href="#"><li>categoria 2</li></a>
        <a href="#"><li>categoria 3</li></a>
        <a href="#"><li>categoria 4</li></a>
        <a href="#"><li>categoria 5</li></a>
        <a href="#"><li>categoria 6</li></a>
      </ul>
    </nav>

    <div class="filter-grid">
      <div class="inner-wrap">
        <div class="filter-cell">
          <select class="form-control">
            <option value="*">Tipo do produto</option>
            <option value="square">Eletrodomestico</option>
            <option value="circular">Limpeza</option>
          </select>
        </div>
        <div class="filter-cell">
          <select class="form-control" disabled="true">
            <option>Preço</option>
          </select>
        </div>
        <div class="filter-cell">
          <select class="form-control" disabled="true">
            <option>Marca</option>
          </select>
        </div>
      </div>
    </div>
  </div>

  <div class="inner-wrap content-wrap" id="productList">
    <div class="product-grid">
      <div>
        <div class="grid-product square fav">
          <a href="">
            <div class="img-name watch">
              <h4>{{}}</h4>
            </div>
          </a>
          <p class="price">
            R${{}}<button class="add-to-cart js-add-to-cart btnfd">Add</button>
          </p>
          <p></p>
        </div>
      </div>
    </div>
  </div>

  <router-link to="./carrinho">
    <div class="go-to-cart">
      <div class="rlv">
        <ul>
          <li><img src="../static/icon/shopping-cart.png" alt="" /></li>
          <li><span>Ir para o carrinho</span></li>
        </ul>
      </div>
    </div>
  </router-link>
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
  padding: 0;
  box-sizing: border-box;
  color: white;
  font-family: "Open Sans", sans-serif;
}

.subnavigation {
  background-color: #232f3e;
  padding: 6px 15px;
}

.submenu {
  display: flex;
  align-items: center;
  justify-content: space-around;
}

ul li {
  list-style: none;
  font-weight: 500;
  padding: 1px 5px;
  font-size: 14px;
}

.flex_grow {
  flex-grow: 5;
}

.filter-grid {
  position: fixed;
  left: 0;
  z-index: 8999;
  width: 100%;
  padding-top: 10px;
  padding-bottom: 10px;
  background-color: #434f5b;
}

.filter-grid .filter-cell {
  float: left;
  width: 33%;
  padding: 7px;
}
.filter-grid select {
  font-weight: 600;
}

.product-grid {
  width: 100%;
  padding-top: 150px;
}
.grid-product {
  width: 25%;
  padding: 7px;
  margin: 0;
  float: left;
}
.grid-product .img-name {
  position: relative;
  width: 100%;
  height: 190px;
  background-color: #fff;
  background-size: cover;
  background-position: center center;
  background-repeat: no-repeat;
  border: 1px solid #aab5c0;
  border-radius: 15px 15px 0 0;
}
.grid-product .img-name h4 {
  position: absolute;
  bottom: 0;
  left: 0;
  width: 100%;
  margin: 0;
  padding-bottom: 15px;
  padding-left: 15px;
  padding-right: 15px;
  padding-top: 15px;
  font-size: 18px;
  color: #2b2e35;
  background-color: rgba(242, 242, 242, 0.8);
}
.grid-product .img-name img {
  width: 100%;
}
.grid-product .price {
  position: relative;
  padding: 15px;
  font-weight: bold;
  background-color: black;
  border-radius: 0 0 15px 15px;
}
.grid-product .add-to-cart {
  position: absolute;
  top: 7px;
  right: 7px;
  color: #fff;
  background-color: #27ae60;
}
.grid-product .add-to-cart:hover {
  color: #b8d87f;
  background-color: #2b2e35;
}

.content-wrap {
  position: relative;
  padding-top: 30px;
  padding-bottom: 30px;
}

.inner-wrap {
  width: 1024px;
  margin: 0 auto;
}

.btnfd {
  width: 60px;
  height: 30px;
  border: none;
  outline: none;
  border-radius: 8px;
  cursor: pointer;
}

.watch {
  background-image: url(https://multimedia.bbycastatic.ca/multimedia/products/250x250/157/15736/15736356.jpg);
}

.go-to-cart {
  position: fixed;
  bottom: 16px;
  right: 16px;
  width: 250px;
  height: 80px;
  background-color: #2ecc71;
  transition: right ease-out 750ms;
  border-radius: 20px;
  cursor: pointer;
}

.go-to-cart:hover {
  right: 32px;
}

.rlv {
  position: relative;
  width: 100%;
  height: 100%;
}

.rlv span {
  font-size: 16px;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  width: 100%;
  text-align: center;
}

.rlv img {
  position: absolute;
  width: 21px;
  top: 50%;
  left: 18%;
  transform: translate(-50%, -50%);
}
</style>
