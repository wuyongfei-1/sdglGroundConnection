function qiehuan(dd){
    var a=$(dd).next().next();
    var b=$(a).is(":hidden") ?0:1;
    if(b==0){
        $(dd).attr("src","/images/up.PNG");
    }else{
        $(dd).attr("src","/images/down.PNG");
    }
    $(a).slideToggle();

}
function xianlu(obj){
    var text=$(obj).html();
    if(text=="自行填写\n" +
        "                            "){
        alert(1213)
        $(obj).parent().prev().html("<input type='text'xl='xianlu' class='layui-input' name='texts'>");
		$(obj).html("选择模板");
    }else{
        alert(456)
        $(obj).parent().prev().html("<select name=\"city\" lay-ignore lay-search xl=\"xianlu\" onchange=\"chengZi(this)\">"+
		xianluinfo+
			"</select>");
		$(obj).html("自行填写\n" +
            "                            ");
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

function insertJingdian(onClickjd) {
        var count=$(onClickjd).parent().parent().next().find("[spot='jingdian']").attr("weight");
        $(onClickjd).parent().parent().next().after("<tr id=\"scenic\">\n" +
            "                            <td><label class=\"layui-form-label\">景点</label></td>\n" +
            "                            <td>\n" +
            "                                <select name=\"city\" weight='"+count+"' lay-ignore spot=\"jingdian\"onchange=\"baojia(this)\">\n" +
            jingdian+
            "                                </select>\n" +
            "                            </td>\n" +
            "                            <td><label class=\"layui-form-label\">成本价:</label></td>\n" +
            "                            <td><input type=\"text\" class=\"layui-input\"></td>\n" +
            "                            <td><label class=\"layui-form-label\">报价:</label></td>\n" +
            "                            <td><input type=\"text\" name='offer' class=\"layui-input\"></td>\n" +
            "<td style='bottom: 0px;'><label class='layui-form-label' onclick='san(this)'>×</label></td>"+
            "</tr>");
    layui.use(['form', 'layedit', 'laydate','element'], function() {
        var form = layui.form,
            layer = layui.layer,
            layedit = layui.layedit,
            element=layui.element,
            laydate = layui.laydate,
            a;
        form.render(); //更新全部
        form.render('select'); //刷新select选择框渲染
    });
}

	function  san(dang){
      $(dang).parent().parent().remove();
	}
		showInfo3();
			function addss() {
                var count=$("#add").prev().children("div:last-child").find("[spot='jingdian']").attr("weight");
                count++;
				var a= "<div style='margin-bottom: 30px;width: 800px'>\n" +
                    "            <input type=\"image\" src=\"/images/up.PNG\" style=\"height: 30px;width: 35px;\" id=\"toggle\"\n" +
                    "                   onclick='qiehuan(this)'/>\n" +
                    "            <input type=\"image\" id=\"sc\" src=\"/images/del.PNG\" onclick='shanchu(this)'\n" +
                    "                   style=\"display:inline-block;float: right;height: 30px;width: 35px;\"/>\n" +
                    "            <div id=\"content\">\n" +
                    "                <form class=\"layui-form layui-form-pane\" action=\"\">\n" +
                    "                    <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n" +
                    "                        <tr>\n" +
                    "                            <td><label class=\"layui-form-label\" onchange='chengZi(this)'>线路</label></td>\n" +
                    "                            <td>\n" +
                    "                                <select name=\"city\" lay-ignore lay-search xl=\"xianlu\" onchange='chengZi(this)'>\n" +
                    xianluinfo+
                    "                                </select>\n" +
                    "                            </td>\n" +
                    "                            <td colspan=\"2\">&nbsp;<button type=\"button\"\n" +
                    "                                                          class='layui-btn layui-btn-normal layui-btn-radius'\n" +
                    "                                                          style='height: 30px;width: 100px;' onclick=\"xianlu(this)\">自行填写\n" +
                    "                            </button>\n" +
                    "                            </td>\n" +
                    "                            <td colspan=\"2\">&nbsp;<button type=\"button\"\n" +
                    "                                                          class='layui-btn layui-btn-normal layui-btn-radius'\n" +
                    "                                                          style='height: 30px;width: 100px'>保存模板\n" +
                    "                            </button>\n" +
                    "                            </td>\n" +
                    "                        </tr>\n" +
                    "                        <tr>\n" +
                    "                            <td><label class=\"layui-form-label\">日期</label></td>\n" +
                    "                            <td>\n" +
                    "                                <input type=\"text\" name=\"date\" id=\"date2\" lay-verify=\"date\" placeholder=\"yyyy-MM-dd\"\n" +
                    "                                       autocomplete=\"off\" class=\"layui-input\">\n" +
                    "                            </td>\n" +
                    "                        </tr>\n" +
                    "\n" +
                    "                        <tr>\n" +
                    "                            <td><label class=\"layui-form-label\">酒店</label></td>\n" +
                    "                            <td>\n" +
                    "                                <select name=\"city\" lay-ignore hotel=\"jiudian\" onchange='baojia(this)'>\n" +
                    jiudian+
                    "                                </select>\n" +
                    "                            </td>\n" +
                    "                            <td><label class=\"layui-form-label\">成本价</label></td>\n" +
                    "                            <td><input type=\"text\" class=\"layui-input\"></td>\n" +
                    "                            <td><label class=\"layui-form-label\">报价</label></td>\n" +
                    "                            <td><input type=\"text\" name='offer' class=\"layui-input\"></td>\n" +
                    "                        </tr>\n" +
                    "                        <!--点击新增景点-->\n" +
                    "                        <tr id=\"onClickjd\">\n" +
                    "                            <td colspan=\"2\">\n" +
                    "                                <button class=\"layui-btn\" type=\"button\" style=\"font-size: 12px\"\n" +
                    "                                        onclick=\"insertJingdian(this)\">添加景点+\n" +
                    "                                </button>\n" +
                    "                            </td>\n" +
                    "                        </tr>\n" +
                    " <tr id=\"scenic\">\n" +
                    "                            <td><label class=\"layui-form-label\">景点</label></td>\n" +
                    "                            <td>\n" +
                    "                                <select name=\"city\" weight='"+count+"' lay-ignore spot=\"jingdian\"onchange=\"baojia(this)\">\n" +
                    jingdian+
                    "                                </select>\n" +
                    "                            </td>\n" +
                    "                            <td><label class=\"layui-form-label\">成本价:</label></td>\n" +
                    "                            <td><input type=\"text\" class=\"layui-input\"></td>\n" +
                    "                            <td><label class=\"layui-form-label\">报价:</label></td>\n" +
                    "                            <td><input type=\"text\" name='offer' class=\"layui-input\"></td>\n" +
                    "                        </tr>"+
                    "                        <tr>\n" +
                    "                            <td><label class=\"layui-form-label\">午餐</label></td>\n" +
                    "                            <td>\n" +
                    "                                <select name=\"city\" lay-ignore wc=\"wucan\" onchange='baojia(this)'>\n" +
                    wucan+
                    "\n" +
                    "                                </select>\n" +
                    "                            </td>\n" +
                    "                            <td><label class=\"layui-form-label\">成本价</label></td>\n" +
                    "                            <td><input type=\"text\" class=\"layui-input\"></td>\n" +
                    "                            <td><label class=\"layui-form-label\">报价</label></td>\n" +
                    "                            <td><input type=\"text\" name='offer' class=\"layui-input\"></td>\n" +
                    "                        </tr>\n" +
                    "                        <tr>\n" +
                    "                            <td><label class=\"layui-form-label\">晚餐</label></td>\n" +
                    "                            <td>\n" +
                    "                                <select name=\"city\" lay-ignore wac=\"wancan\" onchange='baojia(this)'>\n" +
                    wancan+
                    "                                </select>\n" +
                    "                            </td>\n" +
                    "                            <td><label class=\"layui-form-label\">成本价</label></td>\n" +
                    "                            <td><input type=\"text\" class=\"layui-input\"></td>\n" +
                    "                            <td><label class=\"layui-form-label\">报价</label></td>\n" +
                    "                            <td><input type=\"text\" name='offer' class=\"layui-input\"></td>\n" +
                    "                        </tr>\n" +
                    "                        <tr>\n" +
                    "                            <td><label class=\"layui-form-label\">行程</label></td>\n" +
                    "                            <td colspan=\"5\"><textarea placeholder=\"请输入内容\" class=\"layui-textarea\" name=\"desc\"></textarea>\n" +
                    "                            </td>\n" +
                    "                        </tr>\n" +
                    "                    </table>\n" +
                    "                </form>\n" +
                    "            </div>\n" +
                    "        </div>";
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
								form.render('select','skt'); //刷新select选择框渲染
						});
				
				var b = $("#add");
				b.remove();
				var f = "<button class='layui-btn layui-btn-normal layui-btn-radius' onclick='addss()' id='add'>十</button>";
				$("#zong").after(f);
			}
function showInfo3() {
    zongxinalu = "<option value='-1'>请选择</option>";
    jingdian = "<option value='-1'>请选择</option>";
    jiudian = "<option value='-1'>请选择</option>";
    wancan = "<option value='-1'>请选择</option>";
    wucan = "<option value='-1'>请选择</option>";
    xianluinfo = "<option value='-1'>请选择</option>";
    $.ajax({
        url: "/offer/listAllShow",
        data: "",
        dataType: "json",
        type: "get",
        async:false,
        success: function (data) {
            //查询所有线路名
            $.each(data.data[0], function (i, e) {
                zongxinalu += "<option  value='" + e.lineid + "'>" + e.linename + "</option>";
            })

            //查询所有当日行程
            $.each(data.data[1], function (i, e) {
                xianluinfo += "<option value='" + e.templateId + "'>" + e.templateName + "</option>";
            })

            //查询所有景点
            $.each(data.data[2], function (i, e) {
                jingdian += "<option value='" + e.scenicSpotId + "' costPrice='"+e.costprice+"' offer='"+e.offer+"'>" + e.scenicSpotName + "</option>";
            })

            //查询所有酒店
            $.each(data.data[3], function (i, e) {
                jiudian += "<option value='" + e.hotelId + "' costPrice='"+e.costprice+"' offer='"+e.offer+"'>" + e.hotelName + "</option>";
            })

            //查询所有饭菜类型
            $.each(data.data[4], function (i, e) {
                wancan += "<option value='" + e.dictionariesId + "' costPrice='"+e.valueContent2+"' offer='"+e.valueContent3+"'>" + e.valueContent1 + "</option>";
                wucan += "<option value='" + e.dictionariesId + "' costPrice='"+e.valueContent2+"' offer='"+e.valueContent3+"'>" + e.valueContent1 + "</option>";
            })
            $.each(data.data[5], function (i, e) {
                chedui += "<option value='" + e.dictionariesId + "' costPrice='"+e.valueContent2+"' offer='"+e.valueContent3+"'>" + e.valueContent1 + "</option>";
            })
        }, error: function () {
            alert(123);
        }
    })
}


function gouwudiyes(obj){

    $(obj).parent().next().html("<select><option>请选择购物地</option></select>");
}

function gouwudino(obj){
    $(obj).parent().next().html("");
}
function addjd(obj){
    var jd=$(obj).prev().val();
    var textar= $(obj).next().html();
    $(obj).next().html(textar+jd+",");
}
function deljd(obj){
    $(obj).prev().text("");
}
