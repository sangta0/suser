import Vue from 'vue';
import App from './App.vue'
import Router from 'vue-router';
import Login from './components/Login.vue'
import Register from './components/Register.vue'

Vue.use(Router);

const routes = [{
    path: '/app',
    component: App,
    children: [{
        path: '/login',
        component: Login
    }, {
        path: '/register',
        component: Register
    }
    ]
}]


// add route path
routes.forEach(route => {
    route.path = route.path || '/' + (route.name || '');
});

const router = new Router({routes});

router.beforeEach((to, from, next) => {
    const title = to.meta && to.meta.title;
    if (title) {
        document.title = title;
    }
    next();
});

export {
    router
};