<template>
    <div class="q-pa-md">
        <div class="column" style="height: 100px"/>
        <div class="column">
            <q-item-label class="text-center text-h4">   LOGIN   </q-item-label>
        </div>
        <div class="column items-center">
            <div class="col-1" style="height: 20px"/>
            <div class="col-1">
                <div class="text-overline">Silakan masukkan email dan kata sandi Anda:</div>
            </div>
        </div>
        <div class="row justify-center">
            <div class="col-4 q-col-gutter-xl" style="widht: 300px">
                <q-input outlined v-model="ph" label="Username"  :dense="dense" />
            </div>
        </div>
        <div class="row justify-center" style="height: 20px"/>
        <div class="row justify-center">
            <div class="col-4 q-col-gutter-xl" style="widht: 300px">
                <q-input outlined label="Password" v-model="password" filled :type="isPwd ? 'password' : 'text'">
                    <template v-slot:append>
                    <q-icon
                        :name="isPwd ? 'visibility_off' : 'visibility'"
                        class="cursor-pointer"
                        @click="isPwd = !isPwd"
                    />
                    </template>
                </q-input>
            </div>
        </div> 
        <div class="row justify-center" style="height: 20px"/>
        <div class="column items-center ">
            <div class="col-1">
            <q-btn style="background: #283b39; color: white" label="Send Message" class="full-width" />
            </div>
        </div>
    </div>
</template>

<script>
export default {
    data()
    {
        return{        
        username: '',
        password: '',
        isPwd: true,
        }
    }
}
</script>

<style scoped>

</style>