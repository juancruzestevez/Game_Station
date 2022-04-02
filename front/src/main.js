import { createApp } from 'vue'
import App from './App.vue'
import Vuesax from 'vuesax3'
import 'vuesax3/dist/vuesax.css'
import router from './router'
import './styles/global.css'


let app = createApp(App)
app.use(router)
app.use(Vuesax)
app.mount('#app')