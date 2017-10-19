$(document).ready(function(){
    $('.navbar').affix({offset: {top: 250} });

    $('.nav li').on('click', function() {
        $('.nav li').removeClass('active');
        $(this).addClass('active');
    });

});