window.onload =function(){
	dynamicLoading.add("css/bootstrap.min.css");
	dynamicLoading.add("js/bootstrap.min.js");
}

// 获取当前网址，如：http://localhost:8080/ssm/index.jsp
var currentPath = window.document.location.href;
// 获取主机地址之后的目录，如： /ssm/index.jsp
var pathName = window.document.location.pathname;
var pos = currentPath.indexOf(pathName);
// 获取主机地址，如： http://localhost:8080
var localhostPath = currentPath.substring(0, pos);
// 获取带"/"的项目名，如：/ssm
var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);

$.fn.serializeObject = function() {
	var o = {};
	var a = this.serializeArray();
	$.each(a, function() {
		if (o[this.name] !== undefined) {
			if (!o[this.name].push) {
				o[this.name] = [ o[this.name] ];
			}
			o[this.name].push(this.value || '');
		} else {
			o[this.name] = this.value || '';
		}
	});
	return o;
}

var dynamicLoading = {
	add: function(path){
		var _this = this;
		if(!path || path.length === 0)
			throw new Error('argument "path" is required !');
		var fileExt = path.substr(path.lastIndexOf(".")).toLowerCase();
		if (fileExt == ".css")
			_this.css(path);
		if (fileExt == ".js")
			_this.js(path);
	},
    css: function(path){
		if(!path || path.length === 0){
			throw new Error('argument "path" is required !');
		}
		var head = document.getElementsByTagName('head')[0];
        var link = document.createElement('link');
        link.href = path;
        link.rel = 'stylesheet';
        link.type = 'text/css';
        head.appendChild(link);
    },
    js: function(path){
		if(!path || path.length === 0){
			throw new Error('argument "path" is required !');
		}
		var head = document.getElementsByTagName('head')[0];
        var script = document.createElement('script');
        script.src = path;
        script.type = 'text/javascript';
        head.appendChild(script);
    }
}

