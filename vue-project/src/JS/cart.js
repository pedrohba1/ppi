const clx = {
  data() {
    return {
      totalItens: 0,
      totalSumValues: 0.0,
      products: [],
    };
  },
  mounted() {
    axios.get("http://localhost:8080/tesing.json").then((response) => {
      this.products = response.data;
      this.totalItens = this.products.length;
      var res = this.products
        .map((bill) => bill.productPrice)
        .reduce((acc, amount) => acc + amount);
      this.totalSumValues = res;
    });
  },
};
Vue.createApp(clx).mount("#cartList");
