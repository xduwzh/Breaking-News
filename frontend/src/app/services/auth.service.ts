import { Injectable } from '@angular/core';
import { ApiService } from './api.service';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  constructor(private api: ApiService) {}

  async login(username: string, password: string) {
    const response = await this.api.post('user/login', { username, password });
    if (response.data.code === 0) {
      localStorage.setItem('token', response.data.data);
    }
    return response.data;
  }

  async register(username: string, password: string) {
    return this.api.post('user/register', { username, password });
  }

  logout() {
    localStorage.removeItem('token');
  }

  isAuthenticated(): boolean {
    return !!localStorage.getItem('token');
  }
}
