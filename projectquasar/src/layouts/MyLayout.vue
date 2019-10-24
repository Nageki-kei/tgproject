<template>
  <q-layout view="hhh lpR fff">

    
    <q-header elevated class="bg-grey-10 text-white " height-hint="100">
      <q-toolbar align="center">
        <div class="absolute-center">
        <q-toolbar-title >
          <q-avatar>
            <img src="https://cdn.quasar.dev/logo/svg/quasar-logo.svg">
          </q-avatar>
          Nageki
        </q-toolbar-title>
        </div>
        <q-space/>

       <q-item clickable tag="a" target="" href="account">
         <q-item-section>
            <q-item-label>Account</q-item-label>
          </q-item-section>
       </q-item>

      <q-item clickable tag="a" target="" href="account">
         <q-item-section>
            <q-item-label>Search</q-item-label>
          </q-item-section>
       </q-item>

       <q-item dense flat round clickable @click="drawer = !drawer">
         <q-item-section>
            <q-item-label>Cart</q-item-label>
          </q-item-section>
          <q-item-section avatar>
          <q-icon name="shopping_cart"/>
          </q-item-section>
       </q-item>

      <q-drawer v-model="drawer" overlay bordered content-class="bg-grey-3"  side="right" >
      </q-drawer>


      </q-toolbar>
<!-- menu -->
      <div class="column" style="height: 10px"/>
      <q-tabs align="center" v-model="tab" inline-label class="bg-grey-10 text-white shadow-2 ">
        
        <q-tab stretch flat label="HOME" @click="$router.replace('/home')" />
      
        <q-tab stretch flat label="SEMUA PRODUK" @click="$router.replace('/semuaproduk') "/>

        <q-tab stretch flat label="HUBUNGI TG PROJECT" @click="$router.replace('/tg') "/>

        <q-tab stretch flat label="TENTANG TG PROJECT" @click="$router.replace('/tentang') "/>

      </q-tabs>
    </q-header>
<!--  -->
    <q-page-container>
      <router-view />
    </q-page-container>


     <div class="column" style="height: 40px"/>
      <q-separator color="blue-grey-3" inset /> 
    

  </q-layout>
</template>

<script>
export default {
  data () {
    return {
       tab: 'mails',
       drawer: false
    }
  },
  methods: {
   

    }
  }

</script>