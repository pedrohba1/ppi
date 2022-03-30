import axios from "axios";

const state = () => ({
  signUpStatus: "",
});

const mutations = {
  setSignUpStatus(state, data) {
    state.signUpStatus = data;
  },
};

const actions = {
  async signupApi({ commit }, payload) {
    const axiosInstance = axios.create({
      baseURL: import.meta.env.VITE_API_HOST,
      headers: { "Access-Control-Allow-Origin": "true" },
    });

    const response = await axiosInstance
      .post(`user/create`, payload)
      .catch((err) => {
        console.log(err);
      });

    if (response && response.data) {
      commit("setSignUpStatus", "registered");
    } else {
      commit("setSignUpStatus", "failed");
    }
  },
};

const getters = {
  getSignUpStatus(state) {
    return state.signUpStatus;
  },
};

export default {
  namespaced: true,
  state,
  getters,
  actions,
  mutations,
};
