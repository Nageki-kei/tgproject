<template>
  <div class="q-pa-md">
   <q-carousel
      animated
      v-model="slide"
      arrows
      infinite
      autoplay
      transition-prev="slide-right"
      transition-next="slide-left"
    >
      <q-carousel-slide name="first" img-src="https://cdn.quasar.dev/img/mountains.jpg">
        <div class="absolute-bottom custom-caption">
          <div class="text-h2">First stop</div>
          <div class="text-subtitle1">Mountains</div>
        </div>
      </q-carousel-slide>
      <q-carousel-slide name="second" img-src="https://cdn.quasar.dev/img/parallax1.jpg">
        <div class="absolute-bottom custom-caption">
          <div class="text-h2">Second stop</div>
          <div class="text-subtitle1">Famous City</div>
        </div>
      </q-carousel-slide>
      <q-carousel-slide name="third" img-src="https://cdn.quasar.dev/img/parallax2.jpg">
        <div class="absolute-bottom custom-caption">
          <div class="text-h2">Third stop</div>
          <div class="text-subtitle1">Famous Bridge</div>
        </div>
      </q-carousel-slide>

    </q-carousel>
      <div class="column" style="height: 20px"/>
        <!-- <div class="row justify-center">
            <div class="col-auto">
              <q-btn style="width: 350px"  push color="white" text-color="primary" label="Women Best Seller" />
            </div>
            <div class="col-3"/>
            <div class="col-auto">
              <q-btn style="width: 350px" push color="white" text-color="primary" label="Men Best Seller" />
            </div>
        </div> -->
      <div class="column" style="height: 20px"/>
  
    <div class="q-gutter-md row justify-center">
        <div class="col-3 ">
          <q-card>
          <q-img src="https://cdn.quasar.dev/img/parallax2.jpg" style="width: 100%">
           <div class="absolute-bottom flex flex-center btn-center q-pa-xs"> 
              <q-btn color="primary" label="sneakers" />
            </div>
          </q-img>
          </q-card>
        </div>
        <div class="col-xs-1 q-col-gutter-xl"/>
        <div class="col-3 ">
          <q-card>
          <q-img src="https://cdn.quasar.dev/img/parallax2.jpg" style="width: 100%">
            <div class="absolute-bottom flex flex-center btn-center q-pa-xs">
              <q-btn outline color="white" label="Apparel" />
            </div>
          </q-img>
          </q-card>
        </div>
      
        <div class="col-xs-1 q-col-gutter-x-xl"/>
        <div class="col-3 ">
          <q-card>
          <q-img src="https://cdn.quasar.dev/img/parallax2.jpg" style="width: 100%">
            <div class="absolute-bottom flex flex-center btn-center q-pa-xs">
              <q-btn outline color="white" label="Accessories" />
            </div>
          </q-img>
          </q-card>
        </div>
    </div>

    <div class="column" style="height: 20px"/>



  
  </div>
</template>
 

<script>
export default {
   data () {
    return {
      slide: 'first'
    }
  }
}
</script>

<style lang="sass" scoped>
.custom-caption
  text-align: center
  padding: 12px
  color: white
  background-color: rgba(0, 0, 0, .3)

.my-card
  width: 100%
  max-width: 250px

</style>
