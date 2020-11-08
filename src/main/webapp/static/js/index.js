// tab切换
$(function(){
    function cut(nav,cont){
        var length=$(nav).length;
        for(var i=0;i<length;i++){
            $(nav)[i].index=i;
            $(nav).eq(i).click(function(){
                $(cont).css("display","none");//ul的隐藏
                $(cont).eq(this.index).css("display","block");//ui的隐藏
                $(nav).addClass('active');//导航条的显示
                $(this).siblings().removeClass('active');//导航条的隐藏
            })
        }
    }
    cut($(".tab-top span"),$(".tab-content"));
});
$(function(){
    $('.nav-sider li,.side-nav-cont a').click(function(){
        $(this).addClass('active').siblings().removeClass('active');
    })
})