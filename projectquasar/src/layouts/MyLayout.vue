<template>
  <q-layout view="hhh lpR fff" class="bg-white">

    
    <q-header elevated class="bg-grey-10 text-white " height-hint="100">
      <q-toolbar align="center">
        <div class="absolute-center">
        <q-toolbar-title >
          <q-avatar>
            <img src="https://cdn.quasar.dev/logo/svg/quasar-logo.svg">
          </q-avatar>
          TG Project
        </q-toolbar-title>
        </div>
        <q-space/>

       <q-item clickable tag="a" target="" @click="$router.replace('/account')" >
         <q-item-section>
            <q-item-label>Account</q-item-label>
          </q-item-section>
       </q-item>

      <q-item clickable tag="a" target="">
         <q-item-section>
            <q-item-label>Search</q-item-label>
          </q-item-section>
          <q-menu transition-show="jump-down" transition-hide="jump-up">
            <q-input  dense  v-model="text" input-class="text-right" class="q-ml-md">
              <template v-slot:append>
                <q-icon v-if="text === ''" name="search" />
                <q-icon v-else name="clear" class="cursor-pointer" @click="text = ''" />
              </template>
            </q-input>
          </q-menu>
      </q-item>

       <q-item dense flat round clickable @click="drawer = !drawer">
         <q-item-section>
            <q-item-label>Cart</q-item-label>
          </q-item-section>
          <q-item-section avatar>
          <q-icon name="shopping_cart"/>
          </q-item-section>

          <q-menu transition-show="jump-down" transition-hide="jump-up">
             <q-list style="min-width:250px">
             <q-item clickable>

             </q-item>
             </q-list>
          </q-menu>
       </q-item>

      </q-toolbar>
<!-- menu -->
      <div class="column" style="height: 10px"/>
      <q-tabs class="text-white" align="center" v-model="tab" inline-label >
        
        <q-tab stretch flat label="HOME" @click="$router.replace('/')" />

        <q-btn class="text-grey-4"  flat label="SEMUA PRODUCT"> 
            <q-menu transition-show="jump-down" transition-hide="jump-up">

              <q-list style="min-width:150px" class="text-center">
                <q-item clickable v-close-popup  @click="$router.replace('/apparel')">
                  <q-item-section>
                    <q-item-label>Apparel</q-item-label>
                  </q-item-section>
                </q-item>

                <q-item clickable v-close-popup @click="$router.replace('/wallet')">
                  <q-item-section>
                    <q-item-label>Wallet</q-item-label>
                  </q-item-section>
                </q-item>

              <q-item clickable v-close-popup @click="$router.replace('/sepatu') ">
                <q-item-section>
                  <q-item-label>Shoes</q-item-label>
                </q-item-section>
              </q-item>
            </q-list>
            </q-menu>
        </q-btn>
       
        <q-tab stretch flat label="HUBUNGI TG PROJECT" @click="$router.replace('/hubungi') "/>

        <q-tab stretch flat label="TENTANG TG PROJECT" @click="$router.replace('/about') "/>

      </q-tabs>
    </q-header>
<!--  -->
    
    <q-page-container>
      <router-view />
    </q-page-container>

    <q-footer class="bg-white text-black">
     <q-separator color="blue-grey-3" inset />
     <div class="column">
       <div class="column" style="height: 70px"/>
         <div class="row" style="height: 180px">
            <div class="col-1 q-gutter-xl"/>
            <div class="col-3">
              <div class="text-left text-overline">TENTANG KAMI</div>
              <div class="text-left text-caption">Dalam NAH Project, kami bertujuan untuk mengacaukan </div>
              <div class="text-left text-caption">sepatu miliaran dolar dengan bersikap transparan, </div>
              <div class="text-left text-caption">Anda harga yang wajar menggunakan model langsung </div>
              <div class="text-left text-caption">konsumen, dan mengembalikan semangat dan kreativitas</div>
              <div class="text-left text-caption">dengan menjadi berani untuk mengeksplorasi.</div>
            </div>
            <div class="col-2"/>
            <div class="col-2">
              <div class="text-left text-overline">MENU FOOTER</div>
              <div class="text-left text-caption">AllProduk</div>
              <div class="text-left text-caption">About</div>
              <div class="text-left text-caption">Contact Us</div>
            </div>
            <div class="col-1"/>
            <div class="col-3 q-gutter-xs">
              <div class="text-left text-overline">NEWSLETTER</div>
              <div class="text-left text-caption">Berlangganan untuk menerima pembaruan,</div>
              <div class="text-left text-caption">akses ke penawaran eksklusif, dan banyak lagi.</div>
              <div style="height: 10px"/>
               <q-input outlined v-model="ph" placeholder="Enter your email addres" :dense="dense" style="300px" />
               <div style="height: 10px"/>
               <q-btn style="background: #283b39; color: white" label="Langganan" />
            </div>
         </div> 
         <div class="row" style="height: 100px">
          <div class="col-1 q-gutter-xl "/>
          <div class="col-10">
            <div class="column" style="100px">
              <div class="col-1">
                <div class="text-left text-overline">Kenali kami lebih baik dengan mengikuti pegangan media</div>
                <div class="text-left text-overline">sosial kami!</div>
              </div>
            </div> 
         </div>
        </div>

          <div class="column" style="240px">
            <div class="row">
              <div class="col-1 q-gutter-xl "/>
              <div class="col1">
                <div class="text-left text-overline">@TGProject</div>
              </div>
              <div class="col-10"/>
              <div class="col-auto justify-end">
                <q-img src="./statics/master.png" style="width:30px"/>
                <q-img src="./statics/visa.png" style="width:30px"/>
              </div>
            </div>
          </div>

         </div>
    </q-footer>

  </q-layout>
</template>

<script>
export default {
  data () {
    return {
       tab: 'mails',
       text: '',
       drawer: false
    }
  },
  methods: {
   

    }
  }

</script>

<style lang="sass" scoped>

.visa
  height: 50px
  width:  80px 

// #dropdown 
// {
//   position: relative;
//   display: inline-block;
// }
// #dropdown-content 
// {
//   display: none;
//   position: absolute;
//   z-index: 1;
// }
// #dropdown:hover #dropdown-content {display: block;} 
</style>

