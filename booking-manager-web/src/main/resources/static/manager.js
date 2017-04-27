$('#booking-tabs a').click(function(e) {
	e.preventDefault();
	$(this).tab('show');
});

function init() {
	// 根据窗口大小，同步iframe高度
	$("#bodyMain").height($(window).height()-$("#header").height()-140);

	// 当窗口大小改变时，同步iframe高度
	$(window).resize(function() {
		$("#bodyMain").height($(window).height()-$("#header").height());
	});
}

function changgeCenter(index){
	switch(index){
	case 1 :
		window.location.href = "account.html";
		break;
	case 2 :
		document.getElementById("bodyMain").src
		alert(document.getElementById("bodyMain").src);
		$('#bodyMain').src = "account.html";
		alert(document.getElementById("bodyMain").src);
		break;
	case 3 :
		$('#bodyMain').src = "account.html";
		break;
	}
}

$(function() {
	init();
	
	$(document).ready(function(){
		$('#loginModal').modal('show');
	});
});