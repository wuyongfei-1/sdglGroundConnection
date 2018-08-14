function qiehuan(dd){
    var a=$(dd).next().next();
    var b=$(a).is(":hidden") ?0:1;
    if(b==0){
        $(dd).attr("src","../images/up.PNG");
    }else{
        $(dd).attr("src","../images/down.PNG");
    }
    $(a).slideToggle();

}
function xianlu(obj){
	var text=$(obj).html();
	if(text=="自行填写"){
		$(obj).parent().prev().html("<input type='text' class='layui-input'>");
		$(obj).html("选择模板");
	}else{
		$(obj).parent().prev().html("<select name='city' lay-verify='required' lay-search>"+
			"<option value=''></option>"+
			"<option value='0'>哈红祖</option>"+
			"<option value='1'>无敌组</option>"+
			"<option value='2'>纪检组</option>"+
			"</select>");
		$(obj).html("自行填写");
	}

	layui.use(['form', 'layedit', 'laydate','element'], function() {
		var form = layui.form,
			layer = layui.layer,
			layedit = layui.layedit,
			element=layui.element,
			laydate = layui.laydate,
			a;
		element.render( 'test1');
		form.render(); //更新全部
		form.render('select'); //刷新select选择框渲染
	});
}
function shanchu(aa){
    var a=$(aa).parent();
    a.remove();
}		


function addss() {
				var a = "<div style='margin-bottom: 30px;width: 800px'><input type='image' src='/images/up.PNG' style='height: 30px;width: 35px;' id='toggle' onclick='qiehuan(this)'/>" +
					"<input type='image' id='sc'  src='/images/del.PNG' onclick='shanchu(this)'  style='display:inline-block;height: 30px;width: 35px;margin-left:700px ;' />" +
					"<div id='content'>" +
						"<form class='layui-form layui-form-pane' action=''>"+
						"<table border='0'  cellspacing='0' cellpadding='0' style='width:765px'>"+
							"<tr>"+
							"	<td><label class='layui-form-label'>线路</label></td>"+
							"	<td>"+
								"	<select name='city' lay-verify='required' lay-search>"+
								"		<option value=''></option>"+
									"	<option value='0'>哈红祖</option>"+
									"	<option value='1'>无敌组</option>"+
									"	<option value='2'>哈皮组</option>"+
									"	<option value='3'>66组</option>"+
									"	<option value='4'>纪检组</option>"+
								"	</select>"+
							"	</td>"+
							"	<td colspan='2'>&nbsp;<button type='button' class='layui-btn layui-btn-normal layui-btn-radius' style='height: 30px;width: 100px;' onclick='xianlu(this)'>自行填写</button></td>"+
							"	<td colspan='2'>&nbsp;<button type='button' class='layui-btn layui-btn-normal layui-btn-radius' style='height: 30px;width: 100px'>保存模板</button></td>"+
						"	</tr>"+
					"<tr>"+
	"<td><label class='layui-form-label'>日期</label></td>"+
	"<td>"+
	"<input type='text' class='layui-input'>"+
	"</td>"+
		"</tr>"+
						"	<tr>"+
							"	<td><label class='layui-form-label'>酒店</label></td>"+
							"	<td>"+
								"	<select name='city' lay-verify='required'>"+
									"	<option value=''></option>"+
									"	<option value='0'>哈红祖</option>"+
									"	<option value='1'>无敌组</option>"+
									"	<option value='2'>哈皮组</option>"+
										"<option value='3'>66组</option>"+
										"<option value='4'>纪检组</option>"+
									"</select>"+
								"</td>"+
								"<td>"+
									"<select name='city' lay-verify='required'>"+
									"	<option value=''  selected='selected'>请选择酒店</option>"+
										"<option value='0'>哈红祖</option>"+
									"	<option value='1'>无敌组</option>"+
									"	<option value='2'>哈皮组</option>"+
									"	<option value='3'>66组</option>"+
									"	<option value='4'>纪检组</option>"+
								"	</select>"+
							"	</td>"+
								"<td><label class='layui-form-label'>请输入数量：</label></td>"+
								"<td><input type='text' class='layui-input'></td>"+
							"	<td><label class='layui-form-label'>成本价</label></td>"+
							"	<td><input type='text' class='layui-input'></td>"+
							"</tr>"+
							"<tr>"+
								"<td><label class='layui-form-label'>司陪：</label></td>"+
								"<td><label class='layui-form-label' style='width: 140px;'>请输入房间数：</label></td>"+
								"<td><input type='text' class='layui-input'></td>"+
								"<td><label class='layui-form-label'>成本价：</label></td>"+
								"<td><input type='text' class='layui-input'></td>"+
							"</tr>"+
							"<tr>"+
								"<td><label class='layui-form-label'>景点：</label></td>"+
								"<td>"+
									"<select name='city' lay-verify='required'>"+
									"	<option value=''></option>"+
										"<option value='0'>哈红祖</option>"+
									"	<option value='1'>无敌组</option>"+
									"	<option value='2'>哈皮组</option>"+
										"<option value='3'>66组</option>"+
									"<option value='4'>纪检组</option>"+
									"	</select>"+
									"</td>"+
								"	<td><div style='width: 120px;height: 30px;line-height: 30px;border: 1px lightsteelblue solid;border-radius: 1em;background-color: #1E9FFF;color: white;'>"+
									"	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;添加至行程"+
									"</div></td>"+
									"<td colspan='3'><textarea placeholder='请输入内容' class='layui-textarea'  name='desc'></textarea></td>"+
								"	<td><div style='width: 100px;height: 30px;line-height: 30px;border: 1px lightsteelblue solid;border-radius: 1em;background-color: #1E9FFF;color: white;'>"+
									"	&nbsp;&nbsp;	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;清空"+
								"	</div></td>"+
								"</tr>"+
								"<tr>"+
										"<td><label class='layui-form-label'>购物地：</label></td>"+
					"<td colspan='3'>"+
					"<select name='city' lay-verify='required'>"+
					"<option value='>无</option>"+
					"<option value='0'>啊</option>"+
					"<option value='1'>北大青鸟</option>"+
					"<option value='2'>哈皮组</option>"+
					"<option value='3'>66组</option>"+
					"<option value='4'>纪检组</option>"+
					"</select>"+
					"</td>"+
							"	</tr>"+
								"<tr>"+
										"<td><label class='layui-form-label'>午餐</label></td>"+
								"	<td>"+
									"	<select name='city' lay-verify='required'>"+
										"	<option value=''></option>"+
										"	<option value='0'>哈红祖</option>"+
										"	<option value='1'>无敌组</option>"+
										"	<option value='2'>哈皮组</option>"+
										"	<option value='3'>66组</option>"+
										"	<option value='4'>纪检组</option>"+
									"	</select>"+
								"	</td>"+
									"<td>"+
										"<select name='city' lay-verify='required'>"+
										"	<option value=''  selected='selected'>请选择酒店</option>"+
										"	<option value='0'>哈红祖</option>"+
											"<option value='1'>无敌组</option>"+
										"	<option value='2'>哈皮组</option>"+
										"	<option value='3'>66组</option>"+
										"	<option value='4'>纪检组</option>"+
										"</select>"+
								"	</td>"+
								"	<td><label class='layui-form-label'>成本价</label></td>"+
								"	<td colspan='3'><input type='text' class='layui-input'></td>"+
								"</tr>"+
							"	<tr>"+
									"<td><label class='layui-form-label'>晚餐</label></td>"+
									"<td>"+
									"	<select name='city' lay-verify='required'>"+
										"	<option value=''></option>"+
										"	<option value='0'>哈红祖</option>"+
											"<option value='1'>无敌组</option>"+
										"	<option value='2'>哈皮组</option>"+
										"	<option value='3'>66组</option>"+
										"	<option value='4'>纪检组</option>"+
									"	</select>"+
								"	</td>"+
								"	<td>"+
										"<select name='city' lay-verify='required'>"+
											"<option value=''   selected='selected'>请选择酒店</option>"+
											"<option value='0'>哈红祖</option>"+
											"<option value='1'>无敌组</option>"+
											"<option value='2'>哈皮组</option>"+
										"	<option value='3'>66组</option>"+
											"<option value='4'>纪检组</option>"+
										"</select>"+
									"</td>"+
									"<td><label class='layui-form-label'>成本价</label></td>"+
								"	<td colspan='3'><input type='text' class='layui-input'></td>"+
							"	</tr>"+
							"	<tr>"+
								"	<td><label class='layui-form-label'>行程</label></td>"+
								"	<td colspan='5'> <textarea placeholder='请输入内容' class='layui-textarea' name='desc'></textarea></td>"+
							"	</tr>"+
							"</table>	"+
					"	</form></div></div> <br />";
						$("#zong").append(a);
						
						layui.use(['form', 'layedit', 'laydate','element'], function() {
								var form = layui.form,
								layer = layui.layer,
								layedit = layui.layedit,
								element=layui.element,
								laydate = layui.laydate,
								a;
							    element.render( 'test1');
							    form.render(); //更新全部
								form.render('select'); //刷新select选择框渲染;
								form.on('radio(filter)', function(data){
								console.log(data.elem); //得到radio原始DOM对象
								console.log(data.value); //被点击的radio的value值
								});
						});
				
				var b = $("#add");
				b.remove();
				var f = "<button class='layui-btn layui-btn-normal layui-btn-radius' onclick='addss()' id='add'>Day</button>";
				$("#zong").append(f);
			}

function addjd(obj){
    var jd=$(obj).prev().val();
	alert(jd);
    var textar= $(obj).next().html();
    $(obj).next().html(textar+jd+",");
}
function deljd(obj){
    $(obj).parent().prev().html("<textarea placeholder='请输入内容' class='layui-textarea' name='desc'>");
}
function jiudian(obj,id){
    var content="<tr><td colspan='3'><input type='image' src='images/face/0.gif'>&nbsp;&nbsp;&nbsp;<span>星级：</span>3</td></tr>";
    $(obj).parent().parent().after(content);
}