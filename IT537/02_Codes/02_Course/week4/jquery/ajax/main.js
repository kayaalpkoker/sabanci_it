// $(function(){   
//     // $.ajax({
//     //     'url' : 'https://jsonplaceholder.typicode.com/comments',
//     //     'type': 'GET'
//     // }).then(function(response) {
//     //     console.log(response[0]);
//     //     $('h2').append('<span>' +response[0].id+'</span>')
//     // })

//     // $.get({
//     //     'url' : 'https://jsonplaceholder.typicode.com/comments',
//     // }).then(function(response) {
//     //     console.log(response[0]);
//     //     $('h2').append('<span>' +response[0].id+'</span>')
//     // })

//     $.load('demo.txt #p1').then(function(response) {
//         $('h2').append('<span>' +response+'</span>')
//     })
// })


$(document).ready(function(){
    $('h2').load('demo.txt');
})