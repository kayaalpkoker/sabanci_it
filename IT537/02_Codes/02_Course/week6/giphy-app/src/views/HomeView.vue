<script>
export default {
  name: "HomeView",
  data() {
    return {
      gifs: [],
      query: ''
    }
  },
  methods: {
    doSearch() {
      fetch(`https://api.giphy.com/v1/gifs/search?api_key=70SS05X49Ocbe4rAK1CzSMDJ5vZWbwx3&q=${this.query}&limit=25`)
        .then((response) => { return response.json() })
        .then((response) => { this.gifs = response.data })
    },
    toGif(id) {
      return `gif/${id}`
    }
  },
  mounted() {
    fetch("https://api.giphy.com/v1/gifs/trending?api_key=70SS05X49Ocbe4rAK1CzSMDJ5vZWbwx3&limit=25")
      .then((response) => { return response.json() })
      .then((response) => { this.gifs = response.data })
  }
}
</script>

<template>
  <div>

    <div class="input-group mb-3">
      <input type="text" class="form-control" placeholder="Search gif" v-model="query" @keypress.enter="doSearch()">
      <button class="btn btn-outline-secondary" type="button" @click="doSearch">Search</button>
    </div>

    <ul>
      <li v-for="gif in gifs">
        <RouterLink :to="toGif(gif.id)">
          <img :src="gif.images.fixed_height.url" :alt="gif.title">
        </RouterLink>
      </li>
    </ul>
  </div>
</template>

<style scoped>
li {
  list-style: none;
  float: left;
  margin: 3px;
}
</style>