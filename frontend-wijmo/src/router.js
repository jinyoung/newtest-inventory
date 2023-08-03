
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CompanyManager from "./components/ui/CompanyGrid"
import CompanyDetail from "./components/ui/CompanyDetail"
import ProductManager from "./components/ui/ProductGrid"
import ProductDetail from "./components/ui/ProductDetail"

import SalesOrderManager from "./components/ui/SalesOrderGrid"
import SalesOrderDetail from "./components/ui/SalesOrderDetail"

import InventoryManager from "./components/ui/InventoryGrid"
import InventoryDetail from "./components/ui/InventoryDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/companies',
                name: 'CompanyManager',
                component: CompanyManager
            },
            {
                path: '/companies/:id',
                name: 'CompanyDetail',
                component: CompanyDetail
            },
            {
                path: '/products',
                name: 'ProductManager',
                component: ProductManager
            },
            {
                path: '/products/:id',
                name: 'ProductDetail',
                component: ProductDetail
            },

            {
                path: '/salesOrders',
                name: 'SalesOrderManager',
                component: SalesOrderManager
            },
            {
                path: '/salesOrders/:id',
                name: 'SalesOrderDetail',
                component: SalesOrderDetail
            },

            {
                path: '/inventories',
                name: 'InventoryManager',
                component: InventoryManager
            },
            {
                path: '/inventories/:id',
                name: 'InventoryDetail',
                component: InventoryDetail
            },



    ]
})
