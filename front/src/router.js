import {createRouter, createWebHistory} from "vue-router"

import ProductsView from "./view/ProductsView.vue";
import HomeView from "./view/HomeView.vue";

const routes = [
    {
        path: '/',
        components: HomeView
    },
    {
        path: '/produtos',
        components: ProductsView
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
});

export default router;