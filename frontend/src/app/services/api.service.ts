import { Injectable } from '@angular/core';
import axios from 'axios';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root',
})
export class ApiService {
  private baseUrl = environment.apiUrl;

  async get(endpoint: string, params = {}) {
    return axios.get(`${this.baseUrl}/${endpoint}`, { params });
  }

  async post(endpoint: string, data = {}) {
    return axios.post(`${this.baseUrl}/${endpoint}`, data);
  }

  async put(endpoint: string, data = {}) {
    return axios.put(`${this.baseUrl}/${endpoint}`, data);
  }

  async delete(endpoint: string) {
    return axios.delete(`${this.baseUrl}/${endpoint}`);
  }
}
