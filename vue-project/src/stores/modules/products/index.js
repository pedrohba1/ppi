import axios from "axios";

const state = () => ({});

const mutations = {};

const actions = {
  async getProducts({ commit }, payload) {
    const axiosInstance = axios.create({
      baseURL: import.meta.env.VITE_API_HOST,
      headers: { "Access-Control-Allow-Origin": "true" },
    });

    const response = await axiosInstance
      .get(`product`, payload)
      .catch((err) => {
        console.log(err);
      });

    return response.data;
  },

  async createProduct({ commit, rootState }, payload) {
    const axiosInstance = axios.create({
      baseURL: import.meta.env.VITE_API_HOST,
      headers: { "Access-Control-Allow-Origin": "true" },
    });

    console.log(payload);
    console.log(rootState.loginApiStatus);
    // const response = await axiosInstance
    //   .post(`product`, payload)
    //   .catch((err) => {
    //     console.log(err);
    //   });

    return {};
  },
};

const getters = {};

export default {
  namespaced: true,
  state,
  getters,
  actions,
  mutations,
};
