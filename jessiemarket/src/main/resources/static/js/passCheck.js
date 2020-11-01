$(document).ready(function(){
	
	var msgPass = $('.msgPass2');
	
	$('input[name=pass2]').focusout(function(){

		var pass = $('input[name=pass]').val();
		var pass2 = $('input[name=pass2]').val();
				
		if(pass == ''){
			alert('비밀번호를 입력하세요.');
			return;
		}

		if(pass != pass2){
		
			msgPass.css('color', 'red').text('비밀번호가 일치하지 않습니다.');
			
		}else{
			
			msgPass.css('color', 'green').text('비밀번호가 일치 합니다.');
			
		}

	});
	
});