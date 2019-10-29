<template>
    <div class="q-pa-md">
        <div class="column" style="height: 30px"/>
        <div class="row justify-center">
            <div class="col-5">
            <q-card class="my-card newitem">
            <q-carousel swipeable animated v-model="slide" thumbnails infinite>
                        <q-carousel-slide :name="1" img-src="/statics/s1.jpg"/>
                        <q-carousel-slide :name="2" img-src="/statics/s2.jpg"/>
                        <q-carousel-slide :name="3" img-src="/statics/s3.jpg"/>
                        <q-carousel-slide :name="4" img-src="./statics/s4.jpg"/>
                    </q-carousel>
            </q-card>
            </div>
            <div class="col-1 q-col-gutter-xl"/>
            <div class="col-4">
                <div class="text-left text-overline">TG PROJECT
                <div style="height: 10px"/>
                <div class="text-left text-h4 ">MAKARA CORAL</div>
                <div class="text-left text-caption">Rp. 419.000</div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data () {
    return {
      slide: 1
    }
  }
}
</script>

<style lang="sass" scoped>

</style>