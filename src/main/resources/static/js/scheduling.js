function qiehuan(dd) {
    var a = $(dd).next().next();
    var b = $(a).is(":hidden") ? 0 : 1;
    if (b == 0) {
        $(dd).attr("src", "../images/up.PNG");
    } else {
        $(dd).attr("src", "../images/down.PNG");
    }
    $(a).slideToggle();

}

function qiehuan2(dd) {
    var a = $(dd).next("");
    // var b = $(a).is(":hidden") ? 0 : 1;
    // if (b == 0) {
    //     $(dd).attr("src", "../images/up.PNG");
    // } else {
    //     $(dd).attr("src", "../images/down.PNG");
    // }
    if ($(a).is(':hidden')) {
        $(a).show();
    } else {
        $(a).hide();
    }
}

function xianlu(obj) {
    var text = $(obj).html();
    if (text == "自行填写") {
        $(obj).parent().prev().html("<input type='text' class='layui-input'>");
        $(obj).html("选择模板");
    } else {
        $(obj).parent().prev().html("<select name='city' lay-verify='required' lay-search>" +
            "<option value=''></option>" +
            "<option value='0'>哈红祖</option>" +
            "<option value='1'>无敌组</option>" +
            "<option value='2'>纪检组</option>" +
            "</select>");
        $(obj).html("自行填写");
    }

    layui.use(['form', 'layedit', 'laydate', 'element'], function () {
        var form = layui.form,
            layer = layui.layer,
            layedit = layui.layedit,
            element = layui.element,
            laydate = layui.laydate,
            a;
        element.render('test1');
        form.render(); //更新全部
        form.render('select'); //刷新select选择框渲染
    });
}

function shanchu(aa) {
    var a = $(aa).parent();
    a.remove();
}

var dayNum = 0; // 天数

function addss(num, offerLine, offerHotel, allOfferscenicJsonArray,
               allOfferrestaurantJosnArray, commonsJsonStr) {

    if (num != undefined) {
        dayNum = (num + 1);
        var lineArriveName = offerLine["lineArriveName"]; // 线路名称
        var lineDate = offerLine["lineDate"]; // 日期
        var travelContent = offerLine["travelContent"]; // 行程内容
        var hotelId = offerHotel["hotelId"]; // 酒店编号
        var hotelCostPrice = offerHotel["costPrice"]; // 酒店成本价
        var hotelOffer = offerHotel["offer"]; // 酒店报价
        var offerscenicJsonArray = [];  // 当天行程的景点json串
        var offerrestaurantJosnArray = []; // 当天行程的餐馆json串

        var travelName = commonsJsonStr["travelName"]; // 组团社名称
        var personNum = commonsJsonStr["personNum"]; // 人数
        var startTime = commonsJsonStr["startTime"]; // 接团时间
        var endTime = commonsJsonStr["endTime"]; // 送团时间
        var carType = commonsJsonStr["carType"]; // 车队类型编号
        var carTypeCost = commonsJsonStr["carTypeCost"]; // 车队类型编号
        var carTypeOffer = commonsJsonStr["carTypeOffer"]; // 车队类型编号
        var otherCostPrice = commonsJsonStr["otherCostPrice"]; // 其他的成本价
        var otherOffer = commonsJsonStr["otherOffer"]; // 其他的报价
        var remarks = commonsJsonStr["remarks"]; // 备注
        var supervision = commonsJsonStr["supervision"]; // 团队监督
        var reception = commonsJsonStr["reception"]; // 接待标准


        // 遍历所有的景点json数组
        $(allOfferscenicJsonArray).each(function (i, e) {
            if (e["weight"] == (num + 1)) {
                var scenicId = e["scenicId"]; // 景点编号
                var costPrice = e["costPrice"]; // 成本价
                var offer = e["offer"]; // 报价
                var jsonStr = {scenicId: scenicId, costPrice: costPrice, offer: offer};
                offerscenicJsonArray.push(jsonStr);
            }
        })
        var scenics = "";   // 所有景点
        var scenicsArray = []; // 景点json数组
        // 遍历当天景点数组
        $(offerscenicJsonArray).each(function (i, e) {
            var scenicId = e["scenicId"]; // 景点编号
            var costPrice = e["costPrice"]; // 成本价
            var offer = e["offer"]; // 报价
            scenics += "<tr id='scenic" + i + "'>\" +\n" +
                "<td><label class='layui-form-label'>景点</label></td>\" +\n" +
                "<td>" + scenicspots +
                "</td>\" +\n" +
                "<td>" + scenicspots +
                "</td>\" +\n" +
                "<td><label class='layui-form-label'>成本价:</label></td>\" +\n" +
                "<td><input type='text'  class='layui-input'></td>\" +\n" +
                "<td><label class='layui-form-label'>报价:</label></td>\" +\n" +
                "<td><input type='text' name='offer' class='layui-input'></td>\" +\n" +
                "<td><label class='layui-form-label'>需购票人数:</label></td>\" +\n" +
                "<td><input type='text'  class='layui-input'></td>\" +\n" +
                "<td colspan='2' width='300px'>" +
                "<input type='radio' name='scenic" + (i) + "' value='现付' title='现付' />" +
                "<input type='radio' name='scenic" + (i) + "' value='签单' title='签单' checked></td>" +
                "</tr>";
            var scenic = {scenicId: scenicId, costPrice: costPrice, offer: offer};
            scenicsArray.push(scenic);
        })

        // 遍历所有的饮食类型集合
        $(allOfferrestaurantJosnArray).each(function (i, e) {
            if (e["weight"] == (num + 1)) {
                var dictionariesId = e["dictionariesId"]; // 饮食类型编号
                var costPrice = e["costPrice"]; // 成本价
                var offer = e["offer"]; // 报价
                var havemealsdate = e["havemealsdate"]; // 用餐时间
                var jsonStr = {
                    dictionariesId: dictionariesId, costPrice: costPrice,
                    offer: offer, havemealsdate: havemealsdate
                };
                offerrestaurantJosnArray.push(jsonStr);
            }
        })
    }
    if (num == undefined) { // 点击+天数
        num = dayNum;
        dayNum++;
    }
    var a = "<div style='margin-bottom: 30px;margin-top:30px;width: 1340px;' id='offer" + (num) + "'>" +
        "<button class=\"layui-btn\" type=\"button\" style=\"font-size: 12px;margin-left:5px;width:1340px;display: inline;float: left\" onclick=\"qiehuan2(this)\">\n" +
        "第" + (num + 1) + "天" +
        "</button>" +
        "<div id='content'>" +
        "<form class='layui-form layui-form-pane' action=''>" +
        "<table border='0'  cellspacing='0' cellpadding='0' style=\"width: 1340px\">" +
        "<tr>" +
        "<td><label class='layui-form-label'>线路</label></td>" +
        "<td><input id='lineName' type='text' value='" + (lineArriveName) + "' class='layui-input' />" +
        "</td>" +
        "</tr>" +
        "<tr>" +
        "<td><label class=\"layui-form-label\">时间</label></td>\n" +
        "<td><input type=\"text\" name=\"date3\" id=\"date3\" lay-verify=\"date\" placeholder=\"yyyy-MM-dd\"\n" +
        "autocomplete=\"off\" class=\"layui-input\"></td>" +
        "</tr>" +
        "	<tr id='hotelItem'>" +
        "	<td><label class='layui-form-label'>酒店</label></td>" +
        "	<td>" + hotels +
        "</td>" +
        "<td id='therooms'>" + therooms +
        "</td>" +
        "<td><label class='layui-form-label' >房间数：</label></td>" +
        "<td><input type='text' class='layui-input' id='roomNum'></td>" +
        "<td><label class='layui-form-label'>成本价：</label></td>" +
        "<td><input type='text' class='layui-input' /></td>" +
        "<td><label class='layui-form-label'>报价：</label></td>" +
        "<td><input type='text' class='layui-input'></td>" +
        "<td colspan='2'> " +
        "<input type='radio' name='hotel' value='现付' title='现付' />" +
        "<input type='radio' name='hotel' value='签单' title='签单' checked></td>" +
        "</tr>" +
        "<tr>" +
        "<td><label class='layui-form-label'>司陪：</label></td>" +
        "<td><label class='layui-form-label' style='width: 140px;'>房间数：</label></td>" +
        "<td><input type='text' class='layui-input' id='companyBedNum'></td>" +
        "<td><label class='layui-form-label' >成本价：</label></td>" +
        "<td><input type='text' class='layui-input' id='companyBedoffer'></td>" +
        "<td colspan='2' id='privateAccompany'> " +
        "<input type='radio' name='privatePany' value='免费' title='免费' />" +
        "<input type='radio' name='privatePany' value='付费' title='付费' checked></td>" +
        "</tr>" +
        "<tr id=\"onClickjd\">\n" +
        "<td colspan=\"2\">\n" +
        "<button class=\"layui-btn\" type=\"button\" style=\"font-size: 12px;margin-left:5px;\" onclick=\"add(this," + num + ")\">\n" +
        "添加景点+\n" +
        "</button>\n" +
        "</td>\n" +
        "</tr>" +
        "<tr id='shopping'>" +
        "<td><label class='layui-form-label'>购物地：</label></td>" +
        "<td colspan='3'>" + shoppings +
        "</td>" +
        "	</tr>" +
        "<tr id='lunch'>" +
        "<td><label class='layui-form-label'>午餐</label></td>" +
        "	<td>" + restaurants +
        "	</td>" +
        "<td>" + diets +
        "	</td>" +
        "	<td><label class='layui-form-label'>成本价</label></td>" +
        "	<td ><input type='text' class='layui-input'></td>" +
        "<td><label class='layui-form-label'>报价:</label></td>" +
        "<td><input type='text' name='offer' class='layui-input'></td>" +
        "<td colspan='2'>" +
        "<input type='radio' name='lunch' value='现付' title='现付' />" +
        "<input type='radio' name='lunch' value='签单' title='签单' checked></td>" +
        "</td>" +
        "</tr>" +
        "	<tr id='dinner'>" +
        "<td><label class='layui-form-label'>晚餐</label></td>" +
        "<td>" + restaurants +
        "	</td>" +
        "	<td>" + diets +
        "</td>" +
        "<td><label class='layui-form-label'>成本价</label></td>" +
        "	<td ><input type='text' class='layui-input'></td>" +
        "<td><label class='layui-form-label'>报价:</label></td>" +
        "<td><input type='text' name='offer' class='layui-input'></td>" +
        "<td colspan='2'>" +
        "<input type='radio' name='dinner' value='现付' title='现付' />" +
        "<input type='radio' name='dinner' value='签单' title='签单' checked></td>" +
        "</td>" +
        "	</tr>" +
        "	<tr>" +
        "	<td><label class='layui-form-label'>行程</label></td>" +
        "	<td colspan='8'> <textarea placeholder='请输入内容' class='layui-textarea' name='desc'></textarea></td>" +
        "	</tr>" +
        "</table>	" +
        "	</form></div></div> <br />";
    $("#zong").append(a);

    // var b = $("#add");
    // b.remove();
    // var f = "<button class='layui-btn layui-btn-normal layui-btn-radius' onclick='addss()' id='add' style=\"width:50px;margin-left: 1000px;\">十</button>";
    // $("#zong").append(f);

    // start

    // 导游借款
    // 总计
    // // 线路绑定
    // $('#offer' + num).find("#templates [data-text=" + lineArriveName + "]").attr('selected', 'selected');
    // 时间绑定
    $('#offer' + num).find("#date3").val(lineDate);
    // 酒店绑定
    $('#offer' + num).find("#hotels [value=" + hotelId + "]").attr('selected', 'selected');
    // 酒店成本价与报价绑定
    $('#offer' + num).find("#hotels").parent('td').next().next().next().next().next().find('input').val(hotelCostPrice);
    $('#offer' + num).find("#hotels").parent('td').next().next().next().next().next().next().next().find('input').val(hotelOffer);
    // 景点绑定
    $('#offer' + num + ' #onClickjd').after(scenics);
    // 行程绑定
    $('#offer' + num).find('[name=desc]').text(travelContent);
    // 饮食类型绑定
    // 遍历当天饮食类型
    $(offerrestaurantJosnArray).each(function (i, e) {
        var dictionariesId = e["dictionariesId"]; // 饮食类型编号
        var costPrice = e["costPrice"]; // 成本价
        var offer = e["offer"]; // 报价
        var havemealsdate = e["havemealsdate"]; // 用餐时间
        if (havemealsdate == 2) {
            // 绑定午餐数据
            $('#offer' + num + ' #lunch #diets option[value=' + dictionariesId + ']').attr("selected", "selected");
            // 绑定午餐成本价
            $('#offer' + num + ' #lunch #diets').parent('td').next().next().find('input').val(costPrice);
            // 绑定午餐报价
            $('#offer' + num + ' #lunch #diets').parent('td').next().next().next().next().find('input').val(offer);
        }
        else if (havemealsdate == 3) {
            // 绑定晚餐数据
            $('#offer' + num + ' #dinner #diets option[value=' + dictionariesId + ']').attr("selected", "selected");
            // 绑定晚餐成本价
            $('#offer' + num + ' #dinner #diets').parent('td').next().next().find('input').val(costPrice);
            // 绑定晚餐报价
            $('#offer' + num + ' #dinner #diets').parent('td').next().next().next().next().find('input').val(offer);
        }
    })
    // 绑定景点
    $(scenicsArray).each(function (i, e) {
        var scenicId = e["scenicId"]; // 景点编号
        var costPrice = e["costPrice"]; // 成本价
        var offer = e["offer"]; // 报价
        $('#offer' + num + ' #scenic' + i).find('#scenicspots').first().attr("box", "true");
        $('#offer' + num + ' #scenic' + i).find('#scenicspots').first().find('option[value=' + scenicId + ']')
            .attr('selected', 'selected');
        // 绑定成本价
        $('#offer' + num + ' #scenic' + i).find('#scenicspots').parent('td').next().next().find('input').val(costPrice);
        // 绑定报价
        $('#offer' + num + ' #scenic' + i).find('#scenicspots').parent('td').next().next().next().next().find('input').val(offer);
    })
    // 组团社名称绑定
    $('#travelName').val(travelName);
    // 人数绑定
    $('#peopleNumber').val(personNum);
    // 接团时间绑定
    $('#beginDate').val(startTime);
    // 送团时间绑定
    $('#endDate').val(endTime)
    // 车队类型绑定  vehicles
    $('#vehiclesContext #vehicles option[value=' + carType + ']').attr("selected", "selected");
    // 车辆类型成本价绑定
    $('#vehiclesContext').next().next().next().next().find('input').val(carTypeCost);
    // 车辆类型报价绑定
    $('#vehiclesContext').next().next().next().next().next().next().find('input').val(carTypeOffer);
    // 其他的成本价绑定
    $('#otherCostPrice').val(otherCostPrice);
    // 其他的报价绑定
    $('#otherOffer').val(otherOffer);
    // 不含绑定
    // 备注绑定
    $('#remarks').text(remarks);
    // 团队监督绑定
    $('#supervision').text(supervision);
    // 接待标准绑定
    $('#reception').text(reception);
    // end
    // 刷新lay样式
    renderCss();
}


function addjd(obj) {
    var jd = $(obj).prev().val();
    alert(jd);
    var textar = $(obj).next().html();
    $(obj).next().html(textar + jd + ",");
}

function deljd(obj) {
    $(obj).parent().prev().html("<textarea placeholder='请输入内容' class='layui-textarea' name='desc'>");
}

function jiudian(obj, id) {
    var content = "<tr><td colspan='3'><input type='image' src='images/face/0.gif'>&nbsp;&nbsp;&nbsp;<span>星级：</span>3</td></tr>";
    $(obj).parent().parent().after(content);
}