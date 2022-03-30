import { createStore } from "vuex";
import authModule from "./modules/auth";
import signUpModule from "./modules/signup";
import productsModule from "./modules/products";

const store = createStore({
  modules: {
    auth: authModule,
    signup: signUpModule,
    products: productsModule,
  },
});

export default store;
