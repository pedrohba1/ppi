import axios from "axios";

const state = () => ({
  loginApiStatus: "",
});

const mutations = {
  setLoginApiStatus(state, data) {
    state.loginApiStatus = data;
  },
};

const actions = {
  async loginApi({ commit }, payload) {
    console.log("chegou aqui");

    const axiosInstance = axios.create({
      baseURL: import.meta.env.VITE_API_HOST,
      headers: { "Access-Control-Allow-Origin": "true" },
    });

    const response = await axiosInstance.post(`login`, payload).catch((err) => {
      console.log(err);
    });

    if (response && response.data) {
      commit("setLoginApiStatus", response.data.Authorization);
    } else {
      commit("setLoginApiStatus", "failed");
    }
  },
};

const getters = {
  getLoginApiStatus(state) {
    return state.loginApiStatus;
  },
};

export default {
  namespaced: true,
  state,
  getters,
  actions,
  mutations,
};
