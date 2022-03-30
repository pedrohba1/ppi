new Vue({
  el: "#productList",
  data: function () {
    return {
      id: 0,
      mainArray: [],
    };
  },

  methods: {
    add: function (e) {
      //this.mainArray.push({id: this.id});
      //console.log(1);
      console.log("dsadsaas");
    },
    saveFile: function () {
      const data = JSON.stringify(this.mainArray);
      window.localStorage.setItem("cartIds", data);
      console.log(JSON.parse(window.localStorage.getItem("cartIds")));
    },
  },
});
