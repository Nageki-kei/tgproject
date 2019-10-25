
const routes = [
  {
    path: '/',
    component: () => import('layouts/MyLayout.vue'),
    children: [
      { path: '', component: () => import('pages/Index.vue') },
      { path: '/apparel', component: () => import('pages/apparel/apparel.vue') },
      { path: '/wallet', component: () => import('pages/wallet/wallet.vue') },
      { path: '/sepatu', component: () => import('pages/sepatu/sepatu.vue') },
    ]
  }
]

// Always leave this as last one
if (process.env.MODE !== 'ssr') {
  routes.push({
    path: '*',
    component: () => import('pages/Error404.vue')
  })
}

export default routes
