/**
 * 
 */
$(function(){
	initData();
})
//初始化数据
function initData(){
	
	myCard();
	findList();
	
}

function findList(){
	
	var url = host + "/article/list";
	$.post(url,{pageNo:0,pageSize:5},function(result){
		var data = JSON.parse(result);
		var str='';
		for(var i=0;i<data.length;i++){
			str+='<li>'+
        '<div class="arrow_box">'+
          '<div class="ti"></div>'+
          '<div class="ci"></div>'+
          '<h2 class="title"><a href="#" target="_blank">'+data[i].title+'</a></h2>'+
          '<ul class="textinfo">'+
            '<a href="/"><img src="images/s1.jpg"></a>'+
            '<p> '+data[i].sumary+'。</p>'+
          '</ul>'+
          '<ul class="details">'+
            '<li class="comments"><a href="#">'+data[i].clickCount+'</a></li>'+
            '<li class="icon-time"><a href="#">'+getLocalTime(data[i].createDate)+'</a></li>'+
          '</ul>'+
        '</div>'+
      '</li>';
		}
		$(".bloglist").append(str);
	});
}
//我的名片
function myCard(){
	$.ajax({
        type: "post",
        url: host + "/user/list",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (result) {
        	var str = '<h1>我的名片</h1>'+
				      '<p>网名：'+result.nickName+'</p>'+
				      '<p>职业：'+result.job+'</p>'+
				      '<p>QQ：'+result.qq+'</p>'+
				      '<p>Email：'+result.email+'</p>';
        	$(".card").append(str);
        }
    });
}