import axios from 'axios';

// Create an Axios instance
const api = axios.create({
  baseURL: 'http://localhost:8081/backend', // Backend base URL
});

export default api;
