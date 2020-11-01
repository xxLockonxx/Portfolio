$(function(){
    
    var best = $('aside > .recent_index_main');
    $(window).scroll(function(){

        var t = $(this).scrollTop();

        if( t > 200 ){
            best.css({
                'position':'fixed',
                'top': '0'       
            })
        }else{
            best.css({'position':'static'})
        }    
    });

});