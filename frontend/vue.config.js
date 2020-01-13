module.exports = {
  publicPath: '/',
  devServer: {
    proxy: {
      '/api': {
        target: 'http://localhost:8000/',
      },
      '/static/posters': {
        target: 'http://localhost:8000/',
      },
    },
    host:'0.0.0.0',
    disableHostCheck:true,
    port : 80,
    public : '13.124.112.93',
  }
}