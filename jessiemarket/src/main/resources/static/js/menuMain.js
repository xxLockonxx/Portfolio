$(function(){
    
    var menu = $('header > .menu > div > div');
    $(window).scroll(function(){

        var t = $(this).scrollTop();

        if( t > 530 ){
            menu.css({
                'position':'fixed',
                'top': '0'  
            })
        }else{
            menu.css({'position':'static'})
        }
    });

});