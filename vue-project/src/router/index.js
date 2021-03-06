import { createRouter, createWebHistory } from "vue-router";
import HomeView from "../views/HomeView.vue";
import ProductsView from "../views/ProductsView.vue";
import LoginView from "../views/LoginView.vue";
import SignupView from "../views/SignupView.vue";
import AddProductView from "../views/AddProductView.vue";
import CartView from "../views/CartView.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "home",
      component: HomeView,
    },
    {
      path: "/produto",
      name: "produto",
      component: ProductsView,
    },
    {
      path: "/login",
      name: "login",
      component: LoginView,
    },
    {
      path: "/addproduto",
      name: "AddProduct",
      component: AddProductView,
    },

    {
      path: "/cadastro",
      name: "cadastro",
      component: SignupView,
    },
    {
      path: "/carrinho",
      name: "carrinho",
      component: CartView,
    },
  ],
});

export default router;
