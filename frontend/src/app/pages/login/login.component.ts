import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../../services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
})
export class LoginComponent {
  username = '';
  password = '';
  errorMessage = '';

  constructor(private authService: AuthService, private router: Router) {}

  async login() {
    try {
      const result = await this.authService.login(this.username, this.password);
      if (result.code === 0) {
        this.router.navigate(['/articles']); // Redirect to articles page
      } else {
        this.errorMessage = result.message;
      }
    } catch (error) {
      this.errorMessage = 'Login failed, please check your credentials';
    }
  }
}
