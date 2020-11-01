// 추천, 최신, 할인 상태변수
var isCompleteBest = false;
var isCompleteReco = false;
var isCompleteNew = false;
var isCompleteDisc = false;

$(document).ready(function(){
	
	// section 객체 선택
	var sectionHit 		 = $('section.hit');
	var sectionBest      = $('section.best');
	var sectionRecommend = $('section.recommend');
	var sectionNew 		 = $('section.new');
	var sectionDiscount  = $('section.discount');
	
	
	$(window).scroll(function(){
		
		var pos = $(this).scrollTop();
		
		if(pos >= 200 && !isCompleteBest){
			isCompleteBest = true;
			getProducts(sectionBest,'/jessiemarket/main/best');
		}else if(pos >= 400 && !isCompleteReco){
			isCompleteReco = true;
			getProducts(sectionRecommend,'/jessiemarket/main/recommend');
		}else if(pos >= 600 && !isCompleteNew){
			isCompleteNew = true;
			getProducts(sectionNew,'/jessiemarket/main/newItems');
		}else if(pos >= 800 && !isCompleteDisc){
			isCompleteDisc = true;
			getProducts(sectionDiscount,'/jessiemarket/main/discountItems');
		}
		
	});// scroll end
	
	function getProducts(section, url){
		$.ajax({
			url: url,
			type: 'get',
			dataType: 'json',
			success: function(data){
					
				section.find('img').remove();
				
				$.each(data, function(i, item){
					
					var dom = $('.hit > article:eq(0)').clone();
					
					var imgUrl = '/jessiemarket/thumb/'+item.cate1+"/"+item.cate2+"/"+item.thumb1;
					var href = '/jessiemarket/shop/view?code='+item.code;
					dom.find('.thumb > img').attr('src', imgUrl);
					
					dom.find('h2').text(item.name);
					dom.find('p').text(item.descript);
					dom.find('.org_price > del').text(item.price.toLocaleString());
					dom.find('.org_price > span').text(item.discount+'%');
					
					dom.find('.dis_price > ins').text(item.salePrice.toLocaleString());
					dom.find('a').attr('href', href);
					
					
					
					if(item.delivery > 0){
						dom.find('.dis_price > span').remove();	
					}
					
					section.append(dom);
				});
			} 						
		}); 
	}
	
});// jquery end