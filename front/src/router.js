import { createRouter, createWebHistory } from 'vue-router'

// import ProductsView from './view/ProductsView'
// import HomeView from './view/HomeView'

const Home = { template: '<div>Home</div>' }
const About = { template: '<div>About</div>' }

const routes = [
  {
    path: '/',
    components: Home
  },
  {
    path: '/produtos',
    components: About
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
