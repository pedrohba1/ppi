import { createStore } from "vuex";
import authModule from "./modules/auth";
import signUpModule from "./modules/signup";

const store = createStore({
  modules: {
    auth: authModule,
    signup: signUpModule,
  },
});

export default store;
