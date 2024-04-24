<script>
import axios from 'axios'

export default {
  name: "GifView",
  data() {
    return {
      gif: {},
      isFetched: false
    }
  },
  mounted() {
    axios.get(`https://api.giphy.com/v1/gifs/${this.$route.params.id}?api_key=70SS05X49Ocbe4rAK1CzSMDJ5vZWbwx3`)
      .then((response) => {
        console.log(response.data.data)
        debugger;
        this.gif = response.data.data;
        this.isFetched = true;
      })
  }

}
</script>

<template>
  <div v-if="isFetched" class="container">
    <div>
      <img :src="gif.user.banner_image" alt="">
    </div>
    <br>
    <div class="row">
      <div class="col-4">
        <div class="card" style="width: 18rem;">
          <img :src="gif.user.avatar_url" class="card-img-top" :alt="gif.user.display_name">
          <div class="card-body">
            <h5 class="card-title">{{ gif.user.display_name }}</h5>
            <p class="card-text">{{ gif.user.description }}</p>
            <a :href="gif.user.profile_url" target="_blank" class="btn btn-primary">Go giphy profile</a>
          </div>
        </div>
      </div>
      <div class="col-8">
        <img :src="gif.images.original.url" alt="">
      </div>
    </div>

  </div>
</template>

<style></style>
