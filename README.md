# sdglGroundConnection
世达国旅地接社管理系统

图片上传配置：
图片请求路径：http://localhost:8888/api/image/图片名称
虚拟路径：/api/image/
windows：真实保存绝对路径：D://uploadFiles/
linux：真实保存绝对路径：/root/uploadFiles/

页面跳转url：
管理员控制类：EnterAdminPageController
登录页面：http://localhost:8888/admins/login.html
管理员首页：http://localhost:8888/admins/adminIndex.html

计调控制类：EnterCountAdjustPageController:
计调首页：http://localhost:8888/countAdjust/count-Adjust-Index.html

总控控制类：EnterGeneralControlPageController
总控首页：http://localhost:8888/General/count-Adjust-Index.html

数据库：
IP：192.168.43.124
port：3306
username: root
password: 123456
字典表：编码：ATTRACTIONS 景点等级
              DIET 饮食类型
              THEROOM 房间类型
              VEHICLE 车辆类型
              BILL 报账类型
              TRAFFIC 交通类型
              
              

实体类：pojo
accounttype 账户类型
bill   单据
billtype 单据类型
carrental 汽车租赁公司
company 公司信息
dictionaries 字典
disattr 调度景点
discar 	调度用车
disguide 调度导游
disother 调度其他
dispatch 调度
dispatchhotel 调度酒店
disrestaurant 调度餐厅
disshopp  调度购物
guide 导游
hotel 酒店
hoteroomtype 调度酒店房间类型
log  日志
mealtype 饮食类型
offer 报价信息
offercar 报价用车
offerhotel 报价酒店
offerline 报价线路信息记录
offerother 报价其他
offerrestaurant 报价餐厅
offerscenic 报价景点
operationlog 操作日志
reportaccommodation 导游报账住宿
reportdetail 导游报账明细
reportfare 导游报账车费
reportingotherexpenses 导游报账其他支出
reportqutsubsidy 导游报账出团补助
reportrestaurant 导游报账餐厅
reportticket 导游报账门票
restaurant  餐馆
role  角色
roomtype 酒店类型
scenicspot 景点
shopping 购物
staff  人员
template  模板
templatehotel  模板酒店
templatescenicspot 模板景点
traffic 交通
travel 组团社
vehicletype 车辆类型


凭证单：voucher
GuidesReimbursement.html  导游报账明细单
SecurityHints.html        山西旅遊注意事項及安全提示单
log.html		  导游带团日志单
new_file.html		  团结算账单
ptd.html		  导游接团任务工作单(派团单)
CarRenting1.html CarRenting2.html 旅游团队运输合同
BookingNotice.html        山西世达国旅订房通知单
TravelPlan.html		  地接行程计划单
Mission.html		  派团单
Confirmation.html	  确认书
