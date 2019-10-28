<template>
    <div class="q-pa-md">
        <div class="column" style="height: 30px"/>

        <div class="column">
            <q-item-label class="text-center text-h4">   HUBUNGI KAMI   </q-item-label>
        </div>

        <div class="column" style="height: 30px"/>

        <div class="row" style="height: 100px">
            <div class="col-2"/>
            <div class="col-8">
                <div class="column">
                    <div class="col-1">
                        <div class="text-left text-overline text-weight-regular">Untuk pertanyaan lebih lanjut, seputar NAH Project seperti:</div>
                    </div>
                    <div class="col-1" style="height:30px"/>
                    <div class="col-1"/>
                    <div class="row">
                        <div class="col-1 q-gutter-xl"/>
                        <div class="col-8">
                            <div class="column">       
                                <div class="col-1">
                                    <div class="text-left text-overline text-weight-regular" style="height:30px">1. Cara Pemesanan & Status Pemesanan</div>
                                    <div class="text-left text-overline text-weight-regular" style="height:30px">2. Konfirmasi Pembayaran</div>
                                    <div class="text-left text-overline text-weight-regular" style="height:40px">3. Dan lainnya.</div>
                                </div>
                            </div>   
                        </div>
                    </div>

                    <div class="col-1">
                        <div class="text-left text-overline text-weight-regular">Tim Customer Service kami siap menjawab kamu melalui:</div>
                    </div> 
                </div>
            </div>
        </div>
        
    <div class="column" style="height: 80px"/>
        <div class="row" style="height: 100px">
            <div class="col-2"/>
            <div class="col-8">
                <div class="column">                    
                    <div class="col-1" style="height:30px"/>
                    <div class="col-1"/>
                    <div class="row">
                        <div class="col-1 q-gutter-xl"/>
                        <div class="col-8">
                            <div class="column">       
                                <div class="col-1">
                                   <div class="text-left text-h5 text-weight-medium">Whatsapp:</div>
                                   <div class="text-left text-caption"> 081281737252(admin 1), 087883697742(admin 2) atau 085817231429(admin 3)</div>
                                </div>
                            </div>   
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="column" style="height: 30px"/>
        <div class="row" style="height: 50px">
            <div class="col-2"/>
            <div class="col-8">
                <div class="column">
                    <div class="col-1">
                        <div class="text-left text-overline text-weight-regular">Atau, kamu bisa langsung menulis pesan di bawah ini:</div>
                    </div>
                </div>
            </div>        
        </div>

        <div class="column" style="height: 10px"/>
        <div class="row" style="height: 100px">
            <div class="col-2"/>
            <div class="col-8">
                <div class="row" style="height: 70px">
                    <div class="col-4">
                        <q-input outlined v-model="ph" placeholder="Your name" :dense="dense" style="300px" />
                    </div>
                    <div class="col-1 q-col-gutter-xl"/>
                    <div class="col-4">
                        <q-input outlined v-model="ph" placeholder="Your email" :dense="dense" style="300px" />
                    </div>
                </div>

                <div class="row" style="height: 70px">
                    <div class="col-9 q-col-gutter-xl">
                        <q-input outlined v-model="ph" placeholder="Your phone" :dense="dense" style="300px" />
                    </div>
                </div>

                <div class="row" style="height: 70px">
                    <div class="col-9 q-col-gutter-xl">
                        <div class="column" style="height: 70px">
                            <div class="col-4">
                                <q-input outlined v-model="ph" placeholder="Your message" :dense="dense"  />
                            </div>
                        </div>
                        <div class="column">
                            <div class="col-1">
                                <q-btn style="background: #283b39; color: white" label="Send Message" class="full-width" />
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>        
        
              

        <div class="column" style="height: 300px"/><!-- jarak --->
    </div>
</template>

<script>
export default {
    
}
</script>

<style lang="sass" scoped>

</style>