/**
 * 
 */
var host = window.location.protocol + "//" + window.location.host;


$(function(){
	//添加头部和尾部
	$("#head").load("header.html");
	$("#foot").load("footer.html");
	//推荐文章
	recommend();
	//热门点击
	hotClick();
	
})

//推荐阅读
function recommend(){
	$.ajax({
        type: "post",
        url: host + "/article/recommend",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (result) {
        	
        	var str = '<ol>'
        	for(var i=0;i<result.length;i++){
        		str+='<li><span><strong>'+parseInt(i + 1)+'</strong></span><a href="/">'+result[i].title+'</a></li>'
        	}
        	str+='</ol>';
        	$(".tuijian").append(str);
        }
    });
}

//热门点击
function hotClick(){
	$.ajax({
        type: "post",
        url: host + "/article/hotClick",
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (result) {
        	
        	var str = '<ol>'
        	for(var i=0;i<result.length;i++){
        		str+='<li><span><a href="#">慢生活</a></span><a href="#">'+result[i].title+'</a></li>';
        	}
        	str+='</ol>';
        	$(".clicks").append(str);
        }
    });
}

//将时间戳转化为时间
function add0(m) {
    return m < 10 ? '0' + m : m
}
function getLocalTime(shijianchuo) {
//shijianchuo是整数，否则要parseInt转换
    if (shijianchuo == undefined || shijianchuo == 0) {
        return "";
    }
    var time = new Date(shijianchuo);
    var y = time.getFullYear();
    var m = time.getMonth() + 1;
    var d = time.getDate();
    var h = time.getHours();
    var mm = time.getMinutes();
    var s = time.getSeconds();
    return y + '/' + add0(m) + '/' + add0(d) + ' ' + add0(h) + ':' + add0(mm) + ':' + add0(s);
}