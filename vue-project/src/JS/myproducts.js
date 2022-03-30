const clx = {
  data() {
    return {
      products: [],
    };
  },
  mounted() {
    axios.get("http://localhost:8080/tesing.json").then((response) => {
      this.products = response.data;
      console.log(response.data);
    });
  },
};
Vue.createApp(clx).mount("#productListed");
