import { Routes } from '@angular/router';
import { provideRouter } from '@angular/router';

import { LoginComponent } from './pages/login/login.component';
import { RegisterComponent } from './pages/register/register.component';
import { ArticlesComponent } from './pages/articles/articles.component';
import { CategoriesComponent } from './pages/categories/categories.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { HomeComponent } from './pages/home/home.component';

export const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'articles', component: ArticlesComponent },
  { path: 'categories', component: CategoriesComponent },
  { path: 'profile', component: ProfileComponent },
  { path: 'home', component: HomeComponent },
];

export const appRouting = provideRouter(routes);
