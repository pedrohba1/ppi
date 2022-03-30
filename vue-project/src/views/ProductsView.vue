<template>
  <div class="test">
    <nav class="main_nav">
      <div class="inner_content">
        <div class="left dflex">
          <router-link to="./"><h2>CLX</h2></router-link>
        </div>

        <router-link to="/login">
          <div class="item">
            <p>Olá,</p>
            <h5>entre com seu email</h5>
          </div>
        </router-link>

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

        <router-link to="/addproduto">ADICIONAR PRODUTOS</router-link>
      </div>
    </nav>
  </div>

  <div class="product_area" id="productListed">
    <div class="main_content">
      <div class="image_container">
        <img
          src="https://multimedia.bbycastatic.ca/multimedia/products/250x250/157/15736/15736356.jpg"
          alt=""
        />
      </div>

      <div class="info_container">
        <ul>
          <li>{{}}</li>
          <li><b>preço: {{}}</b></li>
          <li><b>Tipo: {{}}</b></li>
          <li><b>Categoria: {{}}</b></li>
          <li><b>Descriçao: {{}}</b></li>
        </ul>
      </div>
    </div>

    <div class="add_to_cart">
      <span>Adicionar ao carrinho</span>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {};
  },
};
</script>

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

.product_area {
  position: absolute;
  background: white;
  width: 1074px;
  height: 340px;
  top: 30%;
  left: 50%;
  border-radius: 20px;
  transform: translate(-50%, -50%);
  padding: 20px;
}

.main_content {
  width: 100%;
  height: 300px;
  float: left;
}

.image_container {
  float: left;
  width: 300px;
  height: 300px;
}

.image_container img {
  width: 100%;
  height: 100%;
}

.info_container {
  float: left;
}

.info_container ul {
  max-width: 700px;
  float: left;
}

.info_container li {
  list-style-type: none;
}

.info_container li:first-of-type {
  font-size: 2em;
  font-weight: bold;
}

.info_container p {
  word-wrap: break-word;
}

.add_to_cart {
  background-color: #27ae60;
  width: 250px;
  height: 60px;
  position: absolute;
  bottom: 20px;
  right: 20px;
  color: white;
  text-align: center;
  border-radius: 12px;
  cursor: pointer;
  transition: all ease-out 500ms;
}

.add_to_cart:hover {
  background-color: green;
}

.add_to_cart span {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}

b {
  color: #000;
}
</style>
