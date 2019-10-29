<template>
  <div class="q-pa-md">
   <q-carousel fluid class="sizebanner"
      animated
      v-model="slide"
      arrows
      infinite
      autoplay
      transition-prev="slide-right"
      transition-next="slide-left"
    >
      <q-carousel-slide class="responsive" name="1" img-src="./statics/1.jpg"/>
      <q-carousel-slide class="responsive" name="2" img-src="./statics/2.jpg"/>
      <q-carousel-slide class="responsive" name="3" img-src="./statics/3.jpg"/>
      <q-carousel-slide class="responsive" name="4" img-src="./statics/4.jpg"/>
      <q-carousel-slide class="responsive" name="5" img-src="./statics/5.jpg"/>

    </q-carousel>
      <div class="column" style="height: 30px"/> <!-- jarak --->
        <div class="column justify-center">
            <div class="col">
              <div class="text-h6 text-weight-regular text-center">Mendemokrasikan industri sepatu dengan menjadi merek </div>
              <div class="text-h6 text-weight-regular text-center">transparan di Indonesia</div>
            </div>
            <div class="column" style="height: 30px"/>
            <div class="col-4 flex flex-center">
            <q-img src="./statics/app-logo-128x128.png" class="deg"/>
            </div>
        </div>
      <div class="column" style="height: 30px"/> <!-- jarak --->
  
    <div class="q-gutter-md row justify-center">
        <div class="col-3 ">
          <q-card>
          <q-img src="./statics/KUSKO1.jpg" style="width: 100%" @click="$router.replace('/sepatu')"/>
          </q-card>
        </div>
        <div class="col-xs-1 q-col-gutter-xl"/>
        <div class="col-3 ">
          <q-card>
          <q-img src="./statics/ZOE_2.jpg" style="width: 100%" @click="$router.replace('/apparel')"/>
          </q-card>
        </div>
      
        <div class="col-xs-1 q-col-gutter-x-xl" @click="$router.replace('/wallet')"/>
        <div class="col-3 ">
          <q-card>
          <q-img src="./statics/SAKA2.jpg" style="width: 100%"/>
          </q-card>
        </div>
    </div>

    <div class="column" style="height: 30px"/> <!-- jarak --->

    <div class="row items-center">
      <div class="col-5">
        <q-separator color="blue-grey-3" inset />
      </div>
      <div class="col-2">
        <div class="text-h5 text-center text-weight-regular"> New Items</div>
      </div>
       <div class="col-5">
        <q-separator color="blue-grey-3" inset />
      </div>
    </div>

    <div class="column" style="height: 20px"/> <!-- jarak --->
    
    <div class="row justify-center">
      

      <div class="col-2">
        <q-card class="my-card newitem">
         <img src="statics/s2.jpg">
        <q-card-actions align="around">
          <q-item-label class="text-center text-overline">Makara Coral Man</q-item-label>
          <q-item-label class="text-center" >Rp. 419.000</q-item-label>
        </q-card-actions>
        </q-card>
      </div>

      <div class="col-2">
        <q-card class="my-card newitem">
          <img src="statics/w1.jpg">
          <q-card-actions align="around">
            <q-item-label class="text-center text-overline">Makara Coral Man</q-item-label>
            <q-item-label class="text-center" >Rp. 419.000</q-item-label>
          </q-card-actions>
          </q-card>
      </div>

      <div class="col-2">
        <q-card class="my-card newitem">
          <img src="statics/w2.jpg">
          <q-card-actions align="around">
            <q-item-label class="text-center text-overline">Makara Coral Man</q-item-label>
            <q-item-label class="text-center" >Rp. 419.000</q-item-label>
          </q-card-actions>
          </q-card>
      </div>

      <div class="col-2">
        <q-card class="my-card newitem">
          <img src="statics/j1.jpg">
          <q-card-actions align="around">
            <q-item-label class="text-center text-overline">Makara Coral Man</q-item-label>
            <q-item-label class="text-center" >Rp. 419.000</q-item-label>
          </q-card-actions>
          </q-card>
      </div>

      <div class="col-2">
        <q-card class="my-card newitem">
          <img src="statics/j2.jpg">
          <q-card-actions align="around">
            <q-item-label class="text-center text-overline">Makara Coral Man</q-item-label>
            <q-item-label class="text-center" >Rp. 419.000</q-item-label>
          </q-card-actions>
          </q-card>
      </div>

    </div>

     <div class="column" style="height: 70px"/><!-- jarak --->


    <div class="row items-center">
      <div class="col-5">
        <q-separator color="blue-grey-3" inset />
      </div>
      <div class="col-2">
        <div class="text-h5 text-center text-weight-regular"> Hot Items</div>
      </div>
       <div class="col-5">
        <q-separator color="blue-grey-3" inset />
       </div>
    </div>

    <div class="row justify-center">
      

      <div class="col-2">
        <q-card class="my-card newitem">
         <img src="statics/s2.jpg">
        <q-card-actions align="around">
          <q-item-label class="text-center text-overline">Makara Coral Man</q-item-label>
          <q-item-label class="text-center" >Rp. 419.000</q-item-label>
        </q-card-actions>
        </q-card>
      </div>

      <div class="col-2">
        <q-card class="my-card newitem">
          <img src="statics/w1.jpg">
          <q-card-actions align="around">
            <q-item-label class="text-center text-overline">Makara Coral Man</q-item-label>
            <q-item-label class="text-center" >Rp. 419.000</q-item-label>
          </q-card-actions>
          </q-card>
      </div>

      <div class="col-2">
        <q-card class="my-card newitem">
          <img src="statics/w2.jpg">
          <q-card-actions align="around">
            <q-item-label class="text-center text-overline">Makara Coral Man</q-item-label>
            <q-item-label class="text-center" >Rp. 419.000</q-item-label>
          </q-card-actions>
          </q-card>
      </div>

      <div class="col-2">
        <q-card class="my-card newitem">
          <img src="statics/j1.jpg">
          <q-card-actions align="around">
            <q-item-label class="text-center text-overline">Makara Coral Man</q-item-label>
            <q-item-label class="text-center" >Rp. 419.000</q-item-label>
          </q-card-actions>
          </q-card>
      </div>

      <div class="col-2">
        <q-card class="my-card newitem">
          <img src="statics/j2.jpg">
          <q-card-actions align="around">
            <q-item-label class="text-center text-overline">Makara Coral Man</q-item-label>
            <q-item-label class="text-center" >Rp. 419.000</q-item-label>
          </q-card-actions>
          </q-card>
      </div>

    </div>

    <div class="column" style="height: 100px"/><!-- jarak --->


  </div>
</template>
 

<script>
export default {
   data () {
    return {
      slide: '1'
    }
  }
}
</script>

<style lang="sass" scoped>
.my-card
  width: 100%
  max-width: 250px

.deg
  height: 100px
  width: 200px

.sizebanner
  width: auto
  height: 500px

.newitem
  width: 200px
  height: 200px
</style>
