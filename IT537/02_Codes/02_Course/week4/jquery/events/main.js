$(function(){   
    $("div").on( "mouseenter mouseleave", function() {
        console.log( "mouse hovered over or left a div" );
    });

//     $( "div" ).on({
//         mouseenter: function() {console.log( "Mouse Enter" );},
//         mouseleave: function() {console.log( "Mouse Leave" );},
//         click: function() {console.log( "Mouse Click" );}
//    });
})