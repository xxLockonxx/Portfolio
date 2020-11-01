$(document).ready(function(){
	
	var msgId = $('.msgId');
	var msgSId = $('.msgSId');
	
	$('input[name=uid]').keyup(function(){
		
		var value = $(this).val();
		
		if(value.length < 4){
			msgId.css('color', '#ef3f43').text('아이디는 최소 4자 이상 이어야 합니다.');
		}else{
			
			var param = {'uid': value};
			
			$.get('/jessiemarket/member/checkUid', param, function(data){
				
				if(data.result == 1){
					msgId.css('color', '#ef3f43').text('이미 사용중인 아이디 입니다.');
				}else{
					msgId.css('color', '#45ad4a').text('사용 가능한 아이디 입니다.');
				}
				
			});
			
		}
		
		console.log("value : "+value.length);
	});
	
	$('input[name=uid]').keyup(function(){
		
		var value = $(this).val();
		
		if(value.length < 4){
			msgSId.css('color', '#ef3f43').text('아이디는 최소 4자 이상 이어야 합니다.');
		}else{
			
			var param = {'uid': value};
			
			$.get('/jessiemarket/member/checkUid', param, function(data){
				
				if(data.result == 1){
					msgSId.css('color', '#ef3f43').text('이미 사용중인 아이디 입니다.');
				}else{
					msgSId.css('color', '#45ad4a').text('사용 가능한 아이디 입니다.');
				}
				
			});
			
		}
		
		console.log("value : "+value.length);
	});
	
});