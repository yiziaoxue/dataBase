$(function() {

	$("#dataShow").bootstrapTable({
		url : "getOrderDetail",
		method : 'post', // 请求方式（*）
		toolbar : '#toolbar', // 工具按钮用哪个容器
		striped : false, // 是否显示行间隔色
		cache : false, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
		pagination : true, // 是否显示分页（*）
		sortable : false, // 是否启用排序
		sortOrder : "asc", // 排序方式
		queryParams : getParams, // 传递参数（*）
		queryParamsType : "limit",
		pagination : true,
		pageNumber : 1, // 初始化加载第一页，默认第一页
		pageSize : 10, // 每页的记录行数（*）
		pageList : [ 10, 25, 50, 100 ], // 可供选择的每页的行数（*）
		clickToSelect : true, // 是否启用点击选中行
		showToggle : true, // 是否显示详细视图和列表视图的切换按钮
		onLoadSuccess : function(data) {
		},
		columns : [ {
			field : 'Number',
			title : '序号',
			formatter : function(value, row, index) {
				return index + 1;
			}
		}, {
			field : 'orderCode',
			title : '订单编码'
		}, {
			field : 'bkMebId',
			title : '会员编码'
		}, {
			field : 'thirdOrderCode',
			title : '第三方订单号'
		}, {
			field : 'innName',
			title : '酒店名称'
		}, {
			field : 'bkName',
			title : '预订人姓名'
		}, {
			field : 'payRate',
			title : '支付金额'
		}, {
			field : 'payType',
			title : '支付方式'
		}, {
			field : 'createTime',
			title : '下单时间',
			formatter : function(value) {
				var data = new Date(value);
				return FormatDate(value);
			}
		} ]
	});

	// 搜索
	$("#orderQuery").click(function(params) {
		// $(this).button('loading');
		var param = {
			limit : params.limit, // 页面大小
			offset : params.offset, // 页码
			orderCode : $("#orderCode").val(),
			memberId : $("#memberId").val()
		};
		$("#dataShow").bootstrapTable("refresh", param);

	});
	// enter键搜索
	$("#searchKey").keydown(function(event) {
		if (event.keyCode == 13) {
			$("#orderQuery").click();
		}
	});
	
	
});

// 默认加载时携带参数
function getParams(params) {
	var orderCode = $("#orderCode").val();
	var memberId = $("#memberId").val();
	return {
		limit : params.limit, // 页面大小
		offset : params.offset, // 页码
		orderCode : orderCode,
		memberId : memberId
	};
}
function FormatDate(strTime) {
    var date = new Date(strTime);
    return date.getFullYear()+"-"+date.getMonth()+"-"+date.getDate()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
}
