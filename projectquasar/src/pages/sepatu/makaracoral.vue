<template>
    <div class="q-pa-md">
        <div class="column" style="height: 30px"/>
        <div class="row justify-center">
            <div class="col-5">
            <q-card class="my-card newitem">
            <q-carousel swipeable animated v-model="slide" thumbnails infinite>
                        <q-carousel-slide :name="1" img-src="/statics/sepatu/s4.jpg"/>
                        <q-carousel-slide :name="2" img-src="/statics/sepatu/s4-1.jpg"/>
                        <q-carousel-slide :name="3" img-src="/statics/sepatu/s4-2.jpg"/>
                        <q-carousel-slide :name="4" img-src="./statics/sepatu/s4-3.jpg"/>
                        <q-carousel-slide :name="5" img-src="./statics/sepatu/s4-4.jpg"/>
                    </q-carousel>
            </q-card>
            </div>
            <div class="col-1 q-col-gutter-xl"/>
            <div class="col-4">
                <div class="text-left text-overline">TG PROJECT</div>
                <div style="height: 10px"/>
                <div class="text-left text-h4 ">MAKARA CORAL</div>
                <div style="height: 10px"/>
                <div class="text-left text-body1">Rp. 419.000</div>
                <div style="height: 30px"/>
                <q-separator color="blue-grey-3" inset />
                <div style="height: 30px"/>
                <div class="text-left text-body2">Makara adalah sneakers yang didesain dengan cutting details yang 
                    stylish dalam beragam pilihan warna upper yang colorful, terinspirasi dari Pantai Makara di 
                    New Zealand. Makara cocok untuk travelling, city walks, olahraga ringan, dan aktivitas harian 
                    lainnya karena ringan, empuk dan nyaman.</div>
                <div style="height: 20px"/>

                <div class="text-left text-body2">Detail:</div>
                
                <div class="row">
                    <div class="col-1"/>
                    <div class="col-1">
                        <div class="text-left text-h3">.</div>
                        <div class="text-left text-h3">.</div>
                        <div class="text-left text-h3">.</div>
                        <div class="text-left text-h3">.</div>
                    </div>  

                    <div class="col">
                        <div style="height: 30px"/>
                        <div class="text-left text-body2">Upper: Vegan Leather</div>
                        <div style="height: 27px"/>
                        <div class="text-left text-body2">Lining: Air Mesh Lining</div>
                        <div style="height: 30px"/>
                        <div class="text-left text-body2">Inshock: Air Mesh + Latex Foam</div>
                        <div style="height: 30px"/>
                        <div class="text-left text-body2">Outsole: Thermoplastic Rubber (TPR)</div>
                    </div>
                </div>

                <div style="height: 40px"/>
                <q-select outlined v-model="model" :options="options" label="Ukuran sepatu" />

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