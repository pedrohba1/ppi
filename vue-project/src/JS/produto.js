const clx = {
  data() {
    return {
      products: [],
      productLink: [],
    };
  },
  mounted() {
    axios.get("http://localhost:8080/tesing.json").then((response) => {
      this.products = response.data;
    });
  },
};
Vue.createApp(clx).mount("#productList");
